package com.ideepmind.joy.sdk;

import java.io.Serializable;

/**
 * @author tby
 * 用户头像数据
 */
public class UserHeadImage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private byte[] imageData;
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the imageData
	 */
	public byte[] getImageData() {
		return imageData;
	}
	/**
	 * @param imageData the imageData to set
	 */
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	
	
}
