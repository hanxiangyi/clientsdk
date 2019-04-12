package com.ideepmind.joy.sdk.cookbook;

import java.io.Serializable;

/**
 * @author tby
 * 食谱食材和用量
 */
public class CookbookFood implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String foodName="";
	private String foodAmount="";
	
	private CookbookFood()
	{}
	public CookbookFood(String foodName,String foodAmount)
	{
		this.foodName = foodName;
		this.foodAmount = foodAmount;
	}
	
	/**
	 * @return the foodName
	 */
	public String getFoodName() {
		return foodName;
	}
	/**
	 * @param foodName the foodName to set
	 */
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	/**
	 * @return 用量
	 */
	public String getFoodAmount() {
		return foodAmount;
	}
	/**
	 * @param 用量
	 */
	public void setFoodAmount(String foodAmount) {
		this.foodAmount = foodAmount;
	}
	
	
}
