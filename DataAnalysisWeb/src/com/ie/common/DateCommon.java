package com.ie.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCommon {
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
	 * 计算两个日期之间相差的天数
	 * 
	 * @param smdate
	 *            较小的时间
	 * @param bdate
	 *            较大的时间
	 * @return 相差天数
	 * @throws ParseException
	 */
	public static int daysBetween(Date smdate, Date bdate)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		smdate = sdf.parse(sdf.format(smdate));
		bdate = sdf.parse(sdf.format(bdate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 字符串的日期格式的计算
	 */
	public static int daysBetween(String smdate, String bdate)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(smdate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(bdate));
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 判断时间date_one是否在时间date_two之前,时间格式: yyyy-MM-dd HH:mm:ss 
	 * @param date_one
	 * @param date_two
	 * @return
	 */
	public static boolean isDateBefore(String date_one, String date_two){
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.parse(date_one).before(sdf.parse(date_two));
		} catch (Exception e) {
			// TODO: handle exception
			Log.log(e.getMessage());
			return false;
		}
	}
}
