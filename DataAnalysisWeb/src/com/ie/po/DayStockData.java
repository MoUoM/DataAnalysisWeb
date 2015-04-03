package com.ie.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DayStockData implements Serializable {

	public String id;
	public String code;
	public String name;
	public String date;
	public double open;
	public double high;
	public double low;
	public double close;
	public double volume;
	public double adjClose;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getAdjClose() {
		return adjClose;
	}
	public void setAdjClose(double adjClose) {
		this.adjClose = adjClose;
	}
	@Override
	public String toString() {
		return "DayStockData [id=" + id + ", code=" + code + ", name=" + name + ", date=" + date
				+ ", open=" + open + ", high=" + high + ", low=" + low
				+ ", close=" + close + ", volume=" + volume + ", adjClose="
				+ adjClose + "]";
	}
	public static DayStockData setAllParam(StockCode str, String string) {
		// TODO Auto-generated method stub
		try{
		String[] data = string.split(",");
		if(data.length != 7)
			return null;
		return new DayStockData(str.getStockName(), str.getStockCode(), data[0], Double.parseDouble(data[1].trim())
				, Double.parseDouble(data[2].trim()), Double.parseDouble(data[3].trim())
				, Double.parseDouble(data[4].trim()), Double.parseDouble(data[5].trim())
				, Double.parseDouble(data[6].trim()));
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("有异常的数据: " + str + ">>>" + string);
			return null;
		}
	}
	
	public DayStockData() {
		super();
	}
	public DayStockData(String name, String code, String date, double open,
			double high, double low, double close, double volume,
			double adjClose) {
		super();
		this.name = name;
		this.code = code;
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
		this.adjClose = adjClose;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
