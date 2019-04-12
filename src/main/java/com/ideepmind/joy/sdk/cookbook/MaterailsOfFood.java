package com.ideepmind.joy.sdk.cookbook;

import java.io.Serializable;
import java.util.List;

import com.ideepmind.joy.sdk.diet.Category;
/**
 * 食材列表
 * @author jixuguo
 *
 */
public class MaterailsOfFood implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Category[] foodList;
	/**
	 * 获得食材列表
	 * @return
	 */
	public Category[] getFoodList() {
		return foodList;
	}

	public void setFoodList(Category[] foodList) {
		this.foodList = foodList;
	}
}
