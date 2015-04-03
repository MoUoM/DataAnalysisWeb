package com.ie.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StockCode implements Serializable {

	private int id;
	private String stockCode;
	private String stockName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	@Override
	public String toString() {
		return "StockCode [id=" + id + ", stockCode=" + stockCode
				+ ", stockName=" + stockName + "]";
	}
	
}
