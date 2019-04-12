package com.ideepmind.joy.sdk;

public class RMIException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 错误码
	 */
	private int code;
	
	/**
	 * 错误细节
	 */
	private String detail;
	
	public RMIException(int code, String message) {
		super(message);
		this.code = code;
	}
	
	public RMIException(int code, String message, String detail) {
		super(message);
		this.code = code;
		this.detail = detail;
	}
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
