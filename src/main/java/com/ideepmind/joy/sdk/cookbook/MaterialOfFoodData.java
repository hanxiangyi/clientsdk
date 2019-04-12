package com.ideepmind.joy.sdk.cookbook;

import java.io.Serializable;
/**
 * 食材数据
 * @author jixuguo
 *
 */
public class MaterialOfFoodData implements Serializable {
	private String foodId="";
	private String footName="";
	/**
	 * 读取食材ID
	 * @param foodId
	 */
	public String getFoodId() {
		return foodId;
	}
	
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	/**
	 * 读取食材名字
	 * @return
	 */
	public String getFootName() {
		return footName;
	}
	public void setFootName(String footName) {
		this.footName = footName;
	}
	
}
