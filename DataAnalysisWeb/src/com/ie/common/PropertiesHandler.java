package com.ie.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;


public class PropertiesHandler {
	public final static String CONFIGPROPERTIES = "config.properties";	//配置文件名
	
	/**
	 * 获取config.properties参数的方法
	 */
	public String queryProperty(String file, String params){
		FileInputStream fis = null;
		String param = "";
		try {
			String path = (getClass().getClassLoader().getResource("").toURI())
					.getPath();
			fis = new FileInputStream(path + file);
			Properties prop = new Properties();
			prop.load(fis);
			param = (String) prop.get(params);
		} catch (URISyntaxException e) {
			Log.log(e);
		} catch (FileNotFoundException e) {
			Log.log(e);
		} catch (IOException e) {
			Log.log(e);
		} finally {
			try {
				if (fis != null){
					fis.close();
				}
			} catch (IOException e) {
				Log.log(e.getMessage());
			}
		}
		return param;
	}
	
	/**
	 * 获取config.properties参数的方法
	 */
	public String queryProperty(String params){
		FileInputStream fis = null;
		String param = "";
		try {
			String path = (getClass().getClassLoader().getResource("").toURI())
					.getPath();
			fis = new FileInputStream(path + CONFIGPROPERTIES);
			Properties prop = new Properties();
			prop.load(fis);
			param = (String) prop.get(params);
		} catch (URISyntaxException e) {
			Log.log(e);
		} catch (FileNotFoundException e) {
			Log.log(e);
		} catch (IOException e) {
			Log.log(e);
		} finally {
			try {
				if (fis != null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return param;
	}
}
