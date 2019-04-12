package com.ideepmind.joy.sdk.cookbook;
import com.ideepmind.joy.sdk.diet.Category;

/**
 * @author tby
 * 食材介绍
 */
public class FoodIntro extends Category {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nutritionFacts="";
	private String[] exampleImageUrls;
	private String appetiteSuggestion="";
	private String[] efficacities;
	private String selectionMethod="";
	private String efficacy="";
	/** 
	 * 获取功效
	 * @return String[] 功效
	 */
	public String[] getEfficacities() {
		return efficacities;
	}

	/** 设置功效
	 * @param efficacities 功效
	 */
	public void setEfficacities(String[] efficacities) {
		this.efficacities = efficacities;
	}
	
	/** 
	 * 获取挑选技巧
	 * @return String 挑选技巧
	 */
	public String getSelectionMethod() {
		return selectionMethod;
	}

	/** 
	 * 赋值挑选技巧
	 * @param String 挑选技巧
	 */
	public void setSelectionMethod(String selectionMethod) {
		this.selectionMethod = selectionMethod;
	}

	/**
	 * 获得图片列表
	 * @return String[] 例子图片地址 
	 */
	public String[] getExampleImageUrls() {
		return exampleImageUrls;
	}

	/**
	 * 设置图片列表
	 * @param 例子图片地址 
	 */
	public void setExampleImageUrls(String[] exampleImageUrls) {
		this.exampleImageUrls = exampleImageUrls;
	}
	/**
	 * 获取营养价值
	 * @return String 营养价值 
	 */
	public String getNutritionFacts() {
		return nutritionFacts;
	}

	/**
	 * 设置营养价值
	 * @param String 营养价值
	 */
	public void setNutritionFacts(String nutritionFacts) {
		this.nutritionFacts = nutritionFacts;
	}
	/**
	 * 获得食用建议
	 * @return  String 食用建议
	 */
	public String getSuggestion() {
		return appetiteSuggestion;
	}

	/**
	 * 设置食用建议
	 * @param String 食用建议
	 */
	public void setSuggestion(String appetiteSuggestion) {
		this.appetiteSuggestion = appetiteSuggestion;
	}
	
	/**
	 * 获得食用建议
	 * @return  String 食用建议
	 */
	public String getEfficacy() {
		return efficacy;
	}

	/**
	 * 设置食用建议
	 * @param String 食用建议
	 */
	public void setEfficacy(String efficacy) {
		this.efficacy = efficacy;
	}
	
}
