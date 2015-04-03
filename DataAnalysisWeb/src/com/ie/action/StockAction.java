package com.ie.action;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;


import com.ie.common.DateCommon;
import com.ie.common.Log;
import com.ie.service.impl.StockServiceImpl;

@Path(value="/")
public class StockAction {

	@Autowired
	private StockServiceImpl stockServiceImpl;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path(value="/getStockDataByCode/{code}/{startDate}/{endDate}")
	public String getStockData(@PathParam(value="code")String code, 
			@PathParam(value="startDate")String startDate,@PathParam(value="endDate")String endDate){
		Log.log("getStockData input Data code:" + code + ", startDate: " + startDate + ", endDate: " + endDate);
		if(DateCommon.isDateBefore(startDate, endDate))
			return stockServiceImpl.getStockData(code, startDate, endDate);
		else
			return new JSONObject().element("errMsg", "开始日期必须在结束日期之前").toString();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path(value="/getAllStockCode")
	public String getAllStockCode(){
		return stockServiceImpl.getAllStockCode();
	}
}
