/** 
 * <pre>项目名称:ssm-maven-wdd 
 * 文件名称:CommonCanstant.java 
 * 包名:com.jk.wdd.utils 
 * 创建日期:2018年12月19日下午3:41:29 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.utils;

/**
 * 
 * <pre>项目名称：Maven    
 * 类名称：CommonCanstant    
 * 类描述：    
 * 创建人：王鹏焱
 * 创建时间：2019年4月12日 下午7:50:04    
 * 修改人：王鹏焱
 * 修改时间：2019年4月12日 下午7:50:04    
 * 修改备注：       
 * @version </pre>
 */
public class CommonCanstant {


	/**
	 * 缓存权限详细标识
	 */
	public static final String POWER_URL_CACHE = "Power_Url_Cache";
	/**
	 * 发生短信url
	 * 转换大写：ctrl+shift+x  
	 * 转换小写：ctrl+shift+y
	 */
	public static final String SEND_MSG_URL = "https://api.miaodiyun.com/20150822/industrySMS/sendSMS";
	
	/**
	 * 发送短信ACCOUNT SID
	 */
	public static final String SEND_MSG_ACCOUNT_ID = "99331b2bc30f4d54b1d298d1a62ebde9";
	
	/**
	 * 发送短信token
	 */
	public static final String SEND_MSG_TOKEN = "4afd86f610704d2ba5038fb7053e8dd5";
	
	/**
	 * 缓存验证码
	 */
	public static final String SEND_MSG_VALCODE = "valcode";
	



	public static final Long DEPT_CACHE_TIME = 30L;
}
