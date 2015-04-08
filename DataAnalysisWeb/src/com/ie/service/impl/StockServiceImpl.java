package com.ie.service.impl;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.ie.dao.StockDao;
import com.ie.po.DayStockData;
import com.ie.po.StockCode;

@SuppressWarnings("serial")
@Service(value="stockServiceImpl")
public class StockServiceImpl extends StockDao{
	
	public String getStockData(String code, String startDate,String endDate){
		List<DayStockData> stockList = queryStockDataByCode(code, startDate, endDate);
		if(stockList.size() == 0)
			return new JSONObject().element("errMsg", "查询不到数据").toString();
		
		//移动平均线
		JSONArray arr3 = shuanshupingjunxian(stockList, 3);
		JSONArray arr5 = shuanshupingjunxian(stockList, 5);
		JSONArray arr8 = shuanshupingjunxian(stockList, 8);
		JSONArray arr10 = shuanshupingjunxian(stockList, 10);
		JSONArray arr12 = shuanshupingjunxian(stockList, 12);
		JSONArray arr15 = shuanshupingjunxian(stockList, 15);

		JSONArray arr30 = shuanshupingjunxian(stockList, 30);
		JSONArray arr35 = shuanshupingjunxian(stockList, 35);
		JSONArray arr40 = shuanshupingjunxian(stockList, 40);
		JSONArray arr45 = shuanshupingjunxian(stockList, 45);
		JSONArray arr50 = shuanshupingjunxian(stockList, 50);
		JSONArray arr60 = shuanshupingjunxian(stockList, 60);
		
		JSONObject json = new JSONObject();
		json.element("arr3", arr3);
		json.element("arr5", arr5);
		json.element("arr8", arr8);
		json.element("arr10", arr10);
		json.element("arr12", arr12);
		json.element("arr15", arr15);
		
		json.element("arr30", arr30);
		json.element("arr35", arr35);
		json.element("arr40", arr40);
		json.element("arr45", arr45);
		json.element("arr50", arr50);
		json.element("arr60", arr60);
		//移动平均线
		
		//CandleStick Data
		JSONArray arr = new JSONArray();
		for (DayStockData dsd : stockList) {
			JSONArray array = new JSONArray();
			array.add(dsd.getDate());
			array.add(dsd.getOpen());
			array.add(dsd.getHigh());
			array.add(dsd.getLow());
			array.add(dsd.getClose());
			arr.add(array);
		}
		json.element("candleData", arr);
		
		return json.toString();
	}
	
	/**
	 * 统计学分析公式，算数移动平均线
	 * @param dec
	 * @param day
	 * @return
	 */
	public JSONArray shuanshupingjunxian(List<DayStockData> dec, int day) {
		JSONArray arr = new JSONArray();
		if (day <= dec.size() && dec.size() > 0) {		//检验数据长度
			int dayIndex = day;
			while(dayIndex < dec.size()){
				double sum = 0;
				for(int i = dayIndex - day; i < dayIndex; i++){
					DayStockData example = dec.get(i);
					sum += example.getClose();
				}
				try{
					JSONArray eachArr = new JSONArray();
					eachArr.add(dec.get(dayIndex).getDate());
					eachArr.add((float)(sum / day));
					arr.add(eachArr);
				} catch (Exception e) {
					// TODO: handle exception
				} finally{
					++dayIndex;
				}
			}
		}
		return arr;
	}

	/**
	 * 获取所有
	 * @return
	 */
	public String getAllStockCode() {
		// TODO Auto-generated method stub
		JSONArray arr = new JSONArray();
		List<StockCode> stockCodeList = queryAllStockCode();
		for (StockCode stockCode : stockCodeList) {
			JSONObject json = new JSONObject();
			json.element("label", stockCode.getStockCode());
			json.element("category", stockCode.getStockName());
			arr.add(json);
		}
		return arr.toString();
	}

	
}
