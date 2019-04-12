package com.ideepmind.joy.sdk.diet;
/**
 * 筛选/推荐条件
 * @author jixuguo
 *食材
 *时令
 *功效(包括疾病调理和日常保健)
 *功效-日常保健
 *功效-疾病调理
 *口味
 *人群
 *节庆节气
 */
public enum CategoryType {
	/**
	 * 食材
	 */
	Food,
	
	/**
	 * 时令
	 */
	Season,
	
	/**
	 * 功效
	 */
	Efficacity,
	/**
	 * 功效-日常保健
	 */
	EffHealthcare,
	
	/**
	 * 功效-疾病调理
	 */
	EffDisease,
	
	/**
	 * 口味
	 */
	Taste,
	
	/**
	 * 人群
	 */
	Crowd,
	
	/**
	 * 节庆节气
	 */
	FestivalAndSolarTerm,
	
	/**
	 * 地域
	 */
	Region,
	
	/**
	 * 场景					
	 */
	Scene,
	
	/**
	 * 烹饪方式					
	 */
	DishStyle,
	
	/**
	 * 菜系
	 */
	FoodType,
	
	/**
	 * 烹饪方式
	 */
	CookType,
}
