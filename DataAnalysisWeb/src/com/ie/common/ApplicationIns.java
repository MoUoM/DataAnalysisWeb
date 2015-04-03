package com.ie.common;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


@SuppressWarnings("serial")
public class ApplicationIns implements Serializable {

	@Resource(name="dataSource")
	private DataSource ds;
	private JdbcTemplate jdbc;  //JdbcTemplate扩展类
	
	public void setDataSource(DataSource ds){
		this.jdbc = new JdbcTemplate(ds);	
	}
	
	public DataSource getDataSource(){
		return ds;
	}
	
	public JdbcTemplate getJdbc(){
		if(this.jdbc == null){
			this.jdbc = new JdbcTemplate(ds);
		}
		
		return this.jdbc;
	}
}
