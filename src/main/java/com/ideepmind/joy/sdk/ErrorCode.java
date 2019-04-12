package com.ideepmind.joy.sdk;

public final class ErrorCode {
	/**
	 * 调用成功
	 */
	public static final int SUCCESS = 0;
	
	/**
	 * 查询无数据
	 */
	public static final int NODATA = 1;
	
	/**
	 * 登录错误
	 */
	public static final int LOGIN_ERROR =     2;
	
	/**
	 * 未知异常
	 */
	public static final int UNKNOWN_ERROR =  -1;
	
	
	/**
	 * HTTP错误
	 */
	public static final int HTTP_ERROR =       100;
	
	/**
	 * JSON错误 
	 */
	public static final int JSON_ERROR =       101;
	
	/**
	 * 网络错误 
	 */
	public static final int NETWORK_ERROR =    102;
	
	/**
	 * session过期
	 */
	public static final int SESSION_EXPIRED =  10001;
	
	/**
	 * session无效
	 */
	public static final int SESSION_NOTVALID = 10002;
	
	/**
	 * 请求缺失sessionKey
	 */
	public static final int SESSION_KEYNULL =  10003;
	
	/**
	 * 临时账号
	 */
	public static final int USER_TEMPORARY =   10010;
	
	
	public static final int METHOD_ARG_ERROR = 10021;
	public static final int METHOD_NOT_FIND =  10022;
	
	/** 判断是否为session错误
	 * @param code 错误码
	 * @return
	 */
	public static boolean isSessionError(int code) {
		return code >= SESSION_EXPIRED && code <= SESSION_KEYNULL;
	}
	
}
