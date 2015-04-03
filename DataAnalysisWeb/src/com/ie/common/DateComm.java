package com.ie.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateComm {

	public final static String DATETIMEFORMAT = "yyyy-MM-dd HH:mm:ss";
	public final static String DAYTIMEFORMAT = "dd HH:mm:ss";
	public final static String DATEFORMAT = "yyyy-MM-dd";
	public final static String DATETIMEID = "yyyyMMddHHmmss";
	
	
	/**
	 * 根据给定的格式返回日期时间
	 * @param format
	 * @return
	 */
	public static String getDateTime(String format){
		try{
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Calendar cal = Calendar.getInstance();
			return sdf.format(cal.getTime());
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}
	
	/**
	 * 根据给定的格式返回日期时间
	 * @param format
	 * @return
	 */
	public static String getDateTime(String format, int month){
		try{
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.MONTH, month);
			return sdf.format(cal.getTime());
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}
	
	/**
	 * 根据给定的时间和格式校验
	 * @param s
	 * @return
	 */
	public static boolean isValidDate(String s, String format) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			dateFormat.parse(s);
			return true;
		} catch (Exception e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			return false;
		}
	}
}
