package com.ideepmind.joy.sdk.cookbook;

import com.alibaba.fastjson.JSON;
import com.ideepmind.joy.sdk.PageData;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryDetail;

public class CookbookPage extends PageData implements CookbookAcceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 类别
	 */
	private Category category;
	private Object detail;
	
	public CategoryDetail categoryDetail() {
		if (detail == null)
			return null;
		return JSON.parseObject(JSON.toJSONString(detail), CategoryDetail.class);
	}
	
	public FoodIntro foodIntro() {
		if (detail == null)
			return null;
		return JSON.parseObject(JSON.toJSONString(detail), FoodIntro.class);
	}
	
	/**
	 * 菜谱集
	 */
	private Cookbook[] cookbooks;

	public Cookbook[] getCookbooks() {
		return cookbooks;
	}

	public void setCookbooks(Cookbook[] cookbooks) {
		this.cookbooks = cookbooks;
	}
	
	public void accept(CookbookVisitor visitor) {
		if (cookbooks != null) {
			for (Cookbook c : cookbooks) {
				if (c != null) {
					visitor.visitCookbook(c);
				}
			}
		}
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	public Object getDetail() {
		return detail;
	}

	public void setDetail(Object detail) {
		this.detail = detail;
	}
	
	
}
