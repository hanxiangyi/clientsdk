package com.ideepmind.joy.sdk;

import java.io.Serializable;

public class ContactIMInfo implements Serializable {
	private String userId;
	private String userName;
	private String appKey;
    private String appToken;
	
    public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAppKey() {
		return appKey;
	}
	
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	
	public String getAppToken() {
		return appToken;
	}
	
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}
}