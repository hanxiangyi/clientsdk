package com.ideepmind.joy.sdk;

import java.io.Serializable;

/**
 * API返回结果
 * @author tby
 *
 * @param <T>
 */
public class ServiceResult<T> implements IServiceResult, Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code=-1;
	/**
	 * 消息
	 */
	private String message;
	/**
	 * 错误细节
	 */
	private String detail;
	private T result;
	
	public int getCode() {
		return code;
	}
	
	public boolean success() {
		return this.code == 0;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
