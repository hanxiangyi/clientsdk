package com.ideepmind.joy.sdk.diet;

import java.io.Serializable;

/**
 * 健康咨询的问答
 * @author zdq
 *
 */

public class HealthContent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String menu;
	
	private String question;
	
	private String answer;

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
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
	
	
	
	
}
