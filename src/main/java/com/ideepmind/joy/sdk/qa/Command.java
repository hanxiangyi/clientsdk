package com.ideepmind.joy.sdk.qa;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.JSON;

/*
 *  服务器返回的指令，该指令包含返回的数据内容
 */
public class Command implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String operation="";
	private String type="";
	private String moduleName="";
	private Object content;
	
	public Command() {		
	}
	
	public Command(String operation, String type, String moduleName) {
		this.operation = operation;
		this.type = type;
		this.moduleName = moduleName;
	}
	
	public Command(String operation, String type, String moduleName,Object content) {
		this.operation = operation;
		this.type = type;
		this.moduleName = moduleName;
		this.content=content;
	}


	/**
	 * 操作，具体信息由各模块定义
	 * @return 操作
	 */
	public String getOpration() {
		return operation;
	}

	public void setOpration(String opration) {
		this.operation = opration;
	}

	
	/**
	 * 模块名称
	 * @return
	 */
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	/**
	 * 类型，具体信息由各模块定义
	 * @return
	 */
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
	/** 获取指令数据对象
	 * @param clazz
	 * @return
	 */
	public <T> T contentAsObject(Class<T> clazz) {
		if (this.content == null) {
			return null;
		}
		return JSON.parseObject(JSON.toJSONString(this.content), clazz);
	}
	
	/** 获取指令数据数组List
	 * @param clazz
	 * @return
	 */
	public <T> List<T> contentAsArray(Class<T> clazz) {
		if (this.content == null) {
			return null;
		}
		return JSON.parseArray(JSON.toJSONString(this.content), clazz);
	}
}
