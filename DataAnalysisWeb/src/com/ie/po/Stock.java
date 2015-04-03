package com.ie.po;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Stock implements Serializable {

	private String stockName;
	private String stockCode;
	private double todayOpening;
	private double yclose;
	private double spotPrice;
	private double dayHighPrice;
	private double dayLowPrice;
	private double jingBuyJia;
	private double jingSaleJia;
	private double chengJiaoShu;
	private double chengJiaoE;
	private double buy1Shou;
	private double buy1Jia;
	private double buy2Shou;
	private double buy2Jia;
	private double buy3Shou;
	private double buy3Jia;
	private double buy4Shou;
	private double buy4Jia;
	private double buy5Shou;
	private double buy5Jia;
	private double sale1Shou;
	private double sale1Jia;
	private double sale2Shou;
	private double sale2Jia;
	private double sale3Shou;
	private double sale3Jia;
	private double sale4Shou;
	private double sale4Jia;
	private double sale5Shou;
	private double sale5Jia;
	private String date;
	private String time;
	public Stock(){super();}
	public Stock(String stockName, double todayOpening, double yclose,
			double spotPrice, double dayHighPrice, double dayLowPrice,
			double jingBuyJia, double jingSaleJia, double chengJiaoShu,
			double chengJiaoE, double buy1Shou, double buy1Jia,
			double buy2Shou, double buy2Jia, double buy3Shou, double buy3Jia,
			double buy4Shou, double buy4Jia, double buy5Shou, double buy5Jia,
			double sale1Shou, double sale1Jia, double sale2Shou,
			double sale2Jia, double sale3Shou, double sale3Jia,
			double sale4Shou, double sale4Jia, double sale5Shou,
			double sale5Jia, String date, String time, String stockCode) {
		super();
		this.stockName = stockName;
		this.todayOpening = todayOpening;
		this.yclose = yclose;
		this.spotPrice = spotPrice;
		this.dayHighPrice = dayHighPrice;
		this.dayLowPrice = dayLowPrice;
		this.jingBuyJia = jingBuyJia;
		this.jingSaleJia = jingSaleJia;
		this.chengJiaoShu = chengJiaoShu;
		this.chengJiaoE = chengJiaoE;
		this.buy1Shou = buy1Shou;
		this.buy1Jia = buy1Jia;
		this.buy2Shou = buy2Shou;
		this.buy2Jia = buy2Jia;
		this.buy3Shou = buy3Shou;
		this.buy3Jia = buy3Jia;
		this.buy4Shou = buy4Shou;
		this.buy4Jia = buy4Jia;
		this.buy5Shou = buy5Shou;
		this.buy5Jia = buy5Jia;
		this.sale1Shou = sale1Shou;
		this.sale1Jia = sale1Jia;
		this.sale2Shou = sale2Shou;
		this.sale2Jia = sale2Jia;
		this.sale3Shou = sale3Shou;
		this.sale3Jia = sale3Jia;
		this.sale4Shou = sale4Shou;
		this.sale4Jia = sale4Jia;
		this.sale5Shou = sale5Shou;
		this.sale5Jia = sale5Jia;
		this.date = date;
		this.time = time;
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getTodayOpening() {
		return todayOpening;
	}
	public void setTodayOpening(double todayOpening) {
		this.todayOpening = todayOpening;
	}
	public double getYclose() {
		return yclose;
	}
	public void setYclose(double yclose) {
		this.yclose = yclose;
	}
	public double getSpotPrice() {
		return spotPrice;
	}
	public void setSpotPrice(double spotPrice) {
		this.spotPrice = spotPrice;
	}
	public double getDayHighPrice() {
		return dayHighPrice;
	}
	public void setDayHighPrice(double dayHighPrice) {
		this.dayHighPrice = dayHighPrice;
	}
	public double getDayLowPrice() {
		return dayLowPrice;
	}
	public void setDayLowPrice(double dayLowPrice) {
		this.dayLowPrice = dayLowPrice;
	}
	public double getJingBuyJia() {
		return jingBuyJia;
	}
	public void setJingBuyJia(double jingBuyJia) {
		this.jingBuyJia = jingBuyJia;
	}
	public double getJingSaleJia() {
		return jingSaleJia;
	}
	public void setJingSaleJia(double jingSaleJia) {
		this.jingSaleJia = jingSaleJia;
	}
	public double getChengJiaoShu() {
		return chengJiaoShu;
	}
	public void setChengJiaoShu(double chengJiaoShu) {
		this.chengJiaoShu = chengJiaoShu;
	}
	public double getChengJiaoE() {
		return chengJiaoE;
	}
	public void setChengJiaoE(double chengJiaoE) {
		this.chengJiaoE = chengJiaoE;
	}
	public double getBuy1Shou() {
		return buy1Shou;
	}
	public void setBuy1Shou(double buy1Shou) {
		this.buy1Shou = buy1Shou;
	}
	public double getBuy1Jia() {
		return buy1Jia;
	}
	public void setBuy1Jia(double buy1Jia) {
		this.buy1Jia = buy1Jia;
	}
	public double getBuy2Shou() {
		return buy2Shou;
	}
	public void setBuy2Shou(double buy2Shou) {
		this.buy2Shou = buy2Shou;
	}
	public double getBuy2Jia() {
		return buy2Jia;
	}
	public void setBuy2Jia(double buy2Jia) {
		this.buy2Jia = buy2Jia;
	}
	public double getBuy3Shou() {
		return buy3Shou;
	}
	public void setBuy3Shou(double buy3Shou) {
		this.buy3Shou = buy3Shou;
	}
	public double getBuy3Jia() {
		return buy3Jia;
	}
	public void setBuy3Jia(double buy3Jia) {
		this.buy3Jia = buy3Jia;
	}
	public double getBuy4Shou() {
		return buy4Shou;
	}
	public void setBuy4Shou(double buy4Shou) {
		this.buy4Shou = buy4Shou;
	}
	public double getBuy4Jia() {
		return buy4Jia;
	}
	public void setBuy4Jia(double buy4Jia) {
		this.buy4Jia = buy4Jia;
	}
	public double getBuy5Shou() {
		return buy5Shou;
	}
	public void setBuy5Shou(double buy5Shou) {
		this.buy5Shou = buy5Shou;
	}
	public double getBuy5Jia() {
		return buy5Jia;
	}
	public void setBuy5Jia(double buy5Jia) {
		this.buy5Jia = buy5Jia;
	}
	public double getSale1Shou() {
		return sale1Shou;
	}
	public void setSale1Shou(double sale1Shou) {
		this.sale1Shou = sale1Shou;
	}
	public double getSale1Jia() {
		return sale1Jia;
	}
	public void setSale1Jia(double sale1Jia) {
		this.sale1Jia = sale1Jia;
	}
	public double getSale2Shou() {
		return sale2Shou;
	}
	public void setSale2Shou(double sale2Shou) {
		this.sale2Shou = sale2Shou;
	}
	public double getSale2Jia() {
		return sale2Jia;
	}
	public void setSale2Jia(double sale2Jia) {
		this.sale2Jia = sale2Jia;
	}
	public double getSale3Shou() {
		return sale3Shou;
	}
	public void setSale3Shou(double sale3Shou) {
		this.sale3Shou = sale3Shou;
	}
	public double getSale3Jia() {
		return sale3Jia;
	}
	public void setSale3Jia(double sale3Jia) {
		this.sale3Jia = sale3Jia;
	}
	public double getSale4Shou() {
		return sale4Shou;
	}
	public void setSale4Shou(double sale4Shou) {
		this.sale4Shou = sale4Shou;
	}
	public double getSale4Jia() {
		return sale4Jia;
	}
	public void setSale4Jia(double sale4Jia) {
		this.sale4Jia = sale4Jia;
	}
	public double getSale5Shou() {
		return sale5Shou;
	}
	public void setSale5Shou(double sale5Shou) {
		this.sale5Shou = sale5Shou;
	}
	public double getSale5Jia() {
		return sale5Jia;
	}
	public void setSale5Jia(double sale5Jia) {
		this.sale5Jia = sale5Jia;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", todayOpening="
				+ todayOpening + ", yclose=" + yclose + ", spotPrice="
				+ spotPrice + ", dayHighPrice=" + dayHighPrice
				+ ", dayLowPrice=" + dayLowPrice + ", jingBuyJia=" + jingBuyJia
				+ ", jingSaleJia=" + jingSaleJia + ", chengJiaoShu="
				+ chengJiaoShu + ", chengJiaoE=" + chengJiaoE + ", buy1Shou="
				+ buy1Shou + ", buy1Jia=" + buy1Jia + ", buy2Shou=" + buy2Shou
				+ ", buy2Jia=" + buy2Jia + ", buy3Shou=" + buy3Shou
				+ ", buy3Jia=" + buy3Jia + ", buy4Shou=" + buy4Shou
				+ ", buy4Jia=" + buy4Jia + ", buy5Shou=" + buy5Shou
				+ ", buy5Jia=" + buy5Jia + ", sale1Shou=" + sale1Shou
				+ ", sale1Jia=" + sale1Jia + ", sale2Shou=" + sale2Shou
				+ ", sale2Jia=" + sale2Jia + ", sale3Shou=" + sale3Shou
				+ ", sale3Jia=" + sale3Jia + ", sale4Shou=" + sale4Shou
				+ ", sale4Jia=" + sale4Jia + ", sale5Shou=" + sale5Shou
				+ ", sale5Jia=" + sale5Jia + ", date=" + date + ", time="
				+ time + "]";
	}

	public Stock(String[] sto, String stockCode){
		this(sto[0], Double.parseDouble(sto[1]), Double.parseDouble(sto[2]), Double.parseDouble(sto[3]),
				Double.parseDouble(sto[4]), Double.parseDouble(sto[5]), Double.parseDouble(sto[6]), Double.parseDouble(sto[7]),
				Double.parseDouble(sto[8]),	Double.parseDouble(sto[9]), Double.parseDouble(sto[10]), Double.parseDouble(sto[11]),
				Double.parseDouble(sto[12]), Double.parseDouble(sto[13]), Double.parseDouble(sto[14]), Double.parseDouble(sto[15]),
				Double.parseDouble(sto[16]), Double.parseDouble(sto[17]), Double.parseDouble(sto[18]), Double.parseDouble(sto[19]), 
				Double.parseDouble(sto[20]), Double.parseDouble(sto[21]), Double.parseDouble(sto[22]), Double.parseDouble(sto[23]),
				Double.parseDouble(sto[24]), Double.parseDouble(sto[25]), Double.parseDouble(sto[26]), Double.parseDouble(sto[27]),
				Double.parseDouble(sto[28]), Double.parseDouble(sto[29]), sto[30], sto[31], stockCode);
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
}
