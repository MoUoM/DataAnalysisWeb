package com.ie.common;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.ie.dao.StockDao;

@SuppressWarnings("serial")
public class HttpClientHandler extends StockDao{

	public String execGet(String url){
		HttpClient httpClient = new DefaultHttpClient(); 
		String result = "";
		try {  
		    //创建HttpGet  
		    HttpGet httpGet = new HttpGet(url);  
//		    System.err.println("executing request " + httpGet.getURI());  
		    //执行get请求  
		    HttpResponse response = httpClient.execute(httpGet);  
		    if(!response.getStatusLine().toString().equalsIgnoreCase("HTTP/1.1 200 OK"))
		    	return null;
		    //获取响应实体  
		    HttpEntity entity = response.getEntity();  
//		    System.err.println("======================================================");  
		    //打印响应状态  
//		    System.out.println(response.getStatusLine());  
		    if (entity != null) {  
		        //打印响应内容的长度  
//		        System.out.println("Response content lenght:" + entity.getContentLength());  
		        String content = EntityUtils.toString(entity);  
		          
		        //解决HttpClient获取中文乱码 ，用String对象进行转码  
//		        System.out.println("Response content:" + new String(content.getBytes("UTF-8")));  
		        result = new String(content.getBytes("UTF-8"));
		    }  
//		    System.err.println("==========================================================");  
		} catch (Exception e) {  
		    // TODO: handle exception
			e.printStackTrace();
			return null;
		}finally{  
		    //关闭连接，释放资源  
		    httpClient.getConnectionManager().shutdown();  
		}  
		return result;
	}
}
