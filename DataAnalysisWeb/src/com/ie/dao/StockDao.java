package com.ie.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.ie.common.ApplicationIns;
import com.ie.po.DayStockData;
import com.ie.po.StockCode;


@SuppressWarnings("serial")
public class StockDao extends ApplicationIns{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DayStockData> queryAllDayStock(){
		String sql = "SELECT code, name, date, CAST(low AS DECIMAL(5, 2)) AS low " +
				"FROM `p_table_copy` WHERE TO_DAYS(NOW()) - TO_DAYS(date) <= 60 ORDER BY date, code;";
		return getJdbc().query(sql, new BeanPropertyRowMapper(DayStockData.class));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DayStockData> queryAllDayStockByCode(String code) {
		// TODO Auto-generated method stub
		String sql = "SELECT id, code, name, date, CAST(low AS DECIMAL(5, 2)) AS low " +
				"FROM `p_table_copy` WHERE code in (" + code + ") AND TO_DAYS(NOW()) - TO_DAYS(date) <= 60 ORDER BY date, code;";
		return getJdbc().query(sql, new BeanPropertyRowMapper(DayStockData.class));
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<StockCode> queryAllStockCode(){
		String sql = "SELECT * FROM p_stockcode_other";
		return getJdbc().query(sql, new BeanPropertyRowMapper(StockCode.class));
	}
	
	/**
	 * 获取所有代码的总数
	 * @return
	 */
	public int queryStockCount(){
		String sql = "SELECT COUNT(*) FROM p_stockcode_other";
		return getJdbc().queryForInt(sql);
	}
	
	/**
	 * 分页查询代码
	 * @param page
	 * @param size
	 * @return
	 */
	public List<String> queryForStockCodeByPage(int page, int size){
		String sql = "SELECT stockCode FROM p_stockcode_other limit " + page + "," + size;
		return getJdbc().queryForList(sql, String.class);
	}
	
	/**
	 * 批量插入代码数据
	 * @param dayStockData
	 * @return
	 */
	public int[] batchInsertTableCopy(List<DayStockData> dayStockData){
		final List<DayStockData> stockList = dayStockData;
		StringBuilder sql = new StringBuilder("INSERT INTO p_table_copy (`name`, `date`,  `open`,  `high`,  `low`,  `close`, ");
			sql.append(" `volume`, `adjClose`, `code`) SELECT ?, ?, ?, ?, ?, ?, ?, ?, ?")
				.append(" FROM DUAL WHERE ? NOT IN (SELECT date FROM p_table_copy WHERE `name`=?)");
		
		return getJdbc().batchUpdate(sql.toString(), new BatchPreparedStatementSetter() { 
			@Override
			public void setValues(java.sql.PreparedStatement ps, int i)	throws SQLException {
				DayStockData dayStock = stockList.get(i);
                ps.setString(1, dayStock.getName()); 
                ps.setString(2, dayStock.getDate());
                ps.setDouble(3, dayStock.getOpen());
                ps.setDouble(4, dayStock.getHigh());
                ps.setDouble(5, dayStock.getLow());
                ps.setDouble(6, dayStock.getClose());
                ps.setDouble(7, dayStock.getVolume());
                ps.setDouble(8, dayStock.getAdjClose());
                ps.setString(9, dayStock.getCode());
                ps.setString(10, dayStock.getDate());
                ps.setString(11, dayStock.getName());
            } 

			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return stockList.size();
			}
        }); 
	}
	
	/**
	 * 批量插入代码
	 * @param stockCodeList
	 * @return
	 */
	public int[] batchInsertStockCodeOther(List<StockCode> stockCodeList) {
		// TODO Auto-generated method stub
		final List<StockCode> stockList = stockCodeList;
		StringBuilder sql = new StringBuilder("INSERT INTO p_stockcode_other (`stockCode`, `stockName` ");
			sql.append(") SELECT ?, ? FROM DUAL WHERE ? NOT IN (SELECT stockCode FROM p_stockcode_other)");
		
		return getJdbc().batchUpdate(sql.toString(), new BatchPreparedStatementSetter() { 
			@Override
			public void setValues(java.sql.PreparedStatement ps, int i)	throws SQLException {
				StockCode dayStock = stockList.get(i);
				ps.setString(1, dayStock.getStockCode());
                ps.setString(2, dayStock.getStockName()); 
				ps.setString(3, dayStock.getStockCode());
            } 

			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return stockList.size();
			}
        }); 
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<DayStockData> queryStockDataByCode(String code, String startDate,
			String endDate) {
		// TODO Auto-generated method stub
		String sql = "SELECT id, code, name, date, CAST(adjClose AS DECIMAL(5, 2)) AS adjClose " +
				", CAST(close AS DECIMAL(5, 2)) AS close, CAST(high AS DECIMAL(5, 2)) AS high" +
				", CAST(low AS DECIMAL(5, 2)) AS low, CAST(open AS DECIMAL(5, 2)) AS open" +
				", CAST(volume AS DECIMAL(10, 0)) AS volume " +
				"FROM `p_table_copy` WHERE code='" + code + "' AND date BETWEEN '" + startDate + 
				"' AND '" + endDate + "' ORDER BY date;";
		return getJdbc().query(sql, new BeanPropertyRowMapper(DayStockData.class));
	}
}
