package com.ie.common;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import net.sf.json.JSONObject;

public class CommonClass {
	/**
	 * 把对象组合成String
	 * @return
	 */
	public static JSONObject composeObject(Object obj){
		Field[] fields = obj.getClass().getDeclaredFields();
		JSONObject json = new JSONObject();
		for(Field field : fields){
			String fieldName = field.getName();			//得到类的字段名称
			Object value = getter(obj, fieldName);		//获取该字段的值
			json.element(fieldName, value == null ? "" : value);
		}
		return json;
	}
	
	/**
	 * 将日期中的小数点和后面的数去掉 
	 * @param date
	 * @return
	 */
	public static String splitPointDate(String date){
		String[] d = date.split("\\.");
		if(d.length == 2){
			return d[0];
		}
		
		return date;
	}
	
	/**判断对象是否可以做为sql的查询条件
	 * param:Object
	 * return:是或者否
	 * */
	public static boolean isCon(Object obj){
		if(obj != null && !obj.toString().equals("") && !obj.toString().equals("null")){
			return Boolean.TRUE;
		}else{
			return Boolean.FALSE;
		}
	}

	/**
	 * 通过反射获得对像的值
	 * @param obj　要获取值的对象
	 * @param name　要获取的属性
	 * @return 属性的值
	 */
	private static Object getter(Object obj, String name) {
		Object o = null;
		try {
			name = name.replaceFirst(name.substring(0, 1), name.substring(0, 1).toUpperCase());
			Method method = obj.getClass().getMethod("get" + name);
			o = method.invoke(obj);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return o;
	}
	
	public static void comboReturnJson(JSONObject json){
		json.put("errorCode", 1);
		json.put("errorMsg", "");
		json.put("isSuccess", true);
		json.put("timeStamp", DateComm.getDateTime("yyyy-MM-dd HH:mm:ss"));
	}
	
	public static void comboReturnJson(JSONObject json, int errorCode, String errorMsg, boolean isSuccess){
		json.put("errorCode", errorCode);
		json.put("errorMsg", errorMsg);
		json.put("isSuccess", isSuccess);
		json.put("timeStamp", DateComm.getDateTime("yyyy-MM-dd HH:mm:ss"));
	}
	
	public static void comboReturnJsonWithFailure(JSONObject json, String msg){
		json.put("errorCode", 0);
		json.put("errorMsg", msg);
		json.put("isSuccess", false);
		json.put("timeStamp", DateComm.getDateTime("yyyy-MM-dd HH:mm:ss"));
		json.put("data", "");
	}
}
