package com.ideepmind.joy.sdk.diet;

import java.io.Serializable;

/** 饮食首页菜单
 * @author tby
 *
 */
public class Menu implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name="";
	private Category[] items;
	private CategoryType categoryType;
	
	public Menu() {
		
	}
	
	public Menu(String name, Category[] items) {
		super();
		this.name = name;
		this.items = items;
	}
	
	public Menu(String name, CategoryType categoryType, Category[] items) {
		super();
		this.name = name;
		this.items = items;
		this.categoryType = categoryType;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Category[] getItems() {
		return items;
	}
	
	public void setItems(Category[] items) {
		this.items = items;
	}

	/**
	 * @return the categoryType
	 */
	public CategoryType getCategoryType() {
		return categoryType;
	}

	/**
	 * @param categoryType the categoryType to set
	 */
	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}
}
