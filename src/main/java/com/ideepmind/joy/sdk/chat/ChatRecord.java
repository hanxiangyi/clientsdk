package com.ideepmind.joy.sdk.chat;

import java.io.Serializable;

/**
 * 用户聊天记录
 * @author zdq
 *
 */

public class ChatRecord implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 用户说的话
	 */
	private String question;
	/**
	 * 机器人的回答
	 */
	private String answer;
	/**
	 * 交互时间
	 */
	private String time;
	
	/**
	 * 问题类别
	 */
	private String moduleName;
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	

}
