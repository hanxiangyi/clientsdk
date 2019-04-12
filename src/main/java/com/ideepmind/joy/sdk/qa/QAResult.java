package com.ideepmind.joy.sdk.qa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 问题结果
 * @author tby
 *
 */
public class QAResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String OK = "";
	private String text;
	private String question;
	private QACode code;
	private int erroCode = 0;
	private String erroMessage = "";
	private String detail = "";
	private String imgUrl = "";
	
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getErroCode() {
		return erroCode;
	}

	public void setErroCode(int erroCode) {
		this.erroCode = erroCode;
	}

	public String getErroMessage() {
		return erroMessage;
	}

	public void setErroMessage(String erroMessage) {
		this.erroMessage = erroMessage;
	}


	private List<Command> commands;
	

	/**
	 * 模块的名称
	 */
	private String moduleName;
	
	/**
	 * 回答内容
	 */
	private String answer;

	// 原始问题")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	// 问题，可能经过纠错")
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	

	/**
   **/
	// 返回码")
	public QACode getCode() {
		return code;
	}

	public void setCode(QACode code) {
		this.code = code;
	}

	// 回答")
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 *  获得指令集合
	 * @return List<Command>
	 */
	public List<Command> getCommands() {
		return commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

	public void appendCommand(Command cmd) {
		if (this.commands == null) {
			this.commands = new ArrayList<>();
		}
		this.commands.add(cmd);
	}
	
	public void appendCommand(Command... commands) {
		if (this.commands == null) {
			this.commands = new ArrayList<>();
		}
		for (Command cmd : commands) {
			this.commands.add(cmd);
		}
	}
	/**
	 * @return 获得将要跳转的模块名称
	 */
	// 处理模块")
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * @param moduleName the moduleName to set
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	

	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return this.code != QACode.Unknown;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
