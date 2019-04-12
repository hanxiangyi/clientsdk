package com.ideepmind.joy.sdk;

import java.io.Serializable;

/**
 * @author tby
 * 数据字典项
 */
public class DataItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	private String id="";
	/**
	 * 名称
	 */
	private String name="";
	/**
	 * 判断取消和新增状态
	 */
	
	private String status1 = "";
	
	public DataItem() {
		
	}
	
	
	public DataItem(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public DataItem(String id, String name,String status) {
		super();
		this.id = id;
		this.name = name;
		this.status1 = status;
	}
	


	public String getStatus1() {
		return status1;
	}


	public void setStatus1(String status) {
		this.status1 = status;
	}


	/**
	 * 获取ID
	 * @return String ID
	 */
	public String getId() {
		return id;
	}
	/**
	 * 赋值ID
	 * @param String ID
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取名字
	 * @return String 名字
	 */
	public String getName() {
		return name;
	}
	/**
	 * 赋值名字
	 * @param String 名字
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*@Override
	public String toString() {
		return String.format("%s:%s:%s", this.id==null?"":this.id, this.name==null?"":this.name,this.status==null?"":this.status);
	}*/
	
}
