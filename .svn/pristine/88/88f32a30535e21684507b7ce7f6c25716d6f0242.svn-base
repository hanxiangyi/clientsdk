package com.ideepmind.joy.sdk.diet;

import com.ideepmind.joy.sdk.DataItem;

public class Category extends DataItem {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 类别
	 */
	private CategoryType type ;
	
	private String imageUrl="";
	/**
	 * 筛选/推荐条件集合
	 * @param type 筛选/推荐条件类型
	 * @param items
	 * @return Category[] 数组
	 */
	public static Category[] build(CategoryType type, String... items) {
		Category[] arr = new Category[items.length];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = new Category(type, items[i]);
		}
		return arr;
	}
	
	public Category() {
		
	}
	
	public Category(CategoryType type, String name) {
		super();
		this.type = type;
		this.setName(name);
	}
	/**
	 * 获得类别
	 * @return
	 */
	public CategoryType getType() {
		return type;
	}
	/**
	 * 设置类别
	 * @param type
	 */
	public void setType(CategoryType type) {
		this.type = type;
	}

	/**
	 * @return 主图片地址
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param 主图片地址
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s", this.getName()==null?"":this.getName(), this.type.toString());
	}
}
