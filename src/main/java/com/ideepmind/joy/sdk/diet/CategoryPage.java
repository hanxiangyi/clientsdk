package com.ideepmind.joy.sdk.diet;

import com.ideepmind.joy.sdk.PageData;
/**
 * 获得食谱筛选条件集合（食材，功效，口味，人群）
 * @author jixuguo
 *
 */
public class CategoryPage extends PageData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Category[] items;

	/**
	 * @return Category[]
	 */
	public Category[] getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 * Category[]
	 */
	public void setItems(Category[] items) {
		this.items = items;
	}
	
}