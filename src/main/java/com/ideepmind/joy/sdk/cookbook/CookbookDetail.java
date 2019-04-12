package com.ideepmind.joy.sdk.cookbook;

/**
 * @author tby
 * 食谱详情信息
 */
public class CookbookDetail extends Cookbook {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String intro="";
	
	private CookbookStep[] steps;
	
	private CookbookFood[] foodList;
	
	private KindPeopleCook[] kindCook;
	
	private String buildTime="";
	
	private String suiteMachine="";
	
	private String cookingMethod="";
	
	private String tips="";
	
	private String[] cuilinary; //含有的营养

	private String nutrition = ""; //缺失的营养
	
	private String[] recommendDiet;
	
	public KindPeopleCook[] getKindCook() {
		return kindCook;
	}

	public void setKindCook(KindPeopleCook[] kindCook) {
		this.kindCook = kindCook;
	}

	public String[] getRecommendDiet() {
		return recommendDiet;
	}

	public void setRecommendDiet(String[] recommendDiet) {
		this.recommendDiet = recommendDiet;
	}


	public String getNutrition() {
		return nutrition;
	}

	public String[] getCuilinary() {
		return cuilinary;
	}

	public void setCuilinary(String[] cuilinary) {
		this.cuilinary = cuilinary;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	/**
	 * 收藏
	 */
	private String favor="";
	
	/**
	 * 功效
	 */
	private String efficacity="";
	/**
	 * 功效列表
	 */
	private String[] efficacities;
	
	/**
	 * 获得简介信息
	 * @return 简介
	 */
	public String getIntro() {
		return intro;
	}

	/**
	 * @param 简介
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}

	/**
	 * 获得食谱步骤
	 * @return 步骤 CookbookStep
	 */
	public CookbookStep[] getSteps() {
		return steps;
	}

	/**
	 * @param 步骤
	 */
	public void setSteps(CookbookStep[] steps) {
		this.steps = steps;
	}

	/**
	 * 获得食材列表
	 * @return 食材列表 CookbookFood
	 */
	public CookbookFood[] getFoodList() {
		return foodList;
	}

	/**
	 * @param 食材列表
	 */
	public void setFoodList(CookbookFood[] foodList) {
		this.foodList = foodList;
	}

	/**
	 * 获得烹饪时间
	 * @return 用时，烹调时间
	 */
	public String getBuildTime() {
		return buildTime;
	}

	/**
	 * @param 用时，烹调时间
	 */
	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}

	/**
	 * 获得适用制作食谱的九阳产品
	 * @return 适用于九阳机器
	 */
	public String getSuiteMachine() {
		return suiteMachine;
	}

	/**
	 * @param 适用于九阳机器
	 */
	public void setSuiteMachine(String suiteMachine) {
		this.suiteMachine = suiteMachine;
	}

	/**
	 * 获得烹调方式
	 * @return 烹调方式
	 */
	public String getCookingMethod() {
		return cookingMethod;
	}

	/**
	 * @param 烹调方式
	 */
	public void setCookingMethod(String cookingMethod) {
		this.cookingMethod = cookingMethod;
	}

	/**
	 * 获得小贴士
	 * @return 小贴士
	 */
	public String getTips() {
		return tips;
	}

	/**
	 * @param 小贴士
	 */
	public void setTips(String tips) {
		this.tips = tips;
	}

	/**
	 * @return the favor
	 */
	public String getFavor() {
		return favor;
	}

	/**
	 * @param favor the favor to set
	 */
	public void setFavor(String favor) {
		this.favor = favor;
	}

	/**
	 * 获取食谱功效字符串（多个功效拼接成）
	 * @return the efficacity
	 */
	public String getEfficacity() {
		return efficacity;
	}

	/**
	 * 将食谱多个功效拼接成字符串，并赋值
	 * @param efficacity the efficacity to set
	 */
	public void setEfficacity(String efficacity) {
		this.efficacity = efficacity;
	}
	/**
	 * 获取食谱功效列表
	 * @return the efficacities String[]
	 */
	public String[] getEfficacities() {
		return efficacities;
	}

	/**
	 * 设置食谱功效
	 * @param efficacities the efficacitiy to set
	 */
	public void setEfficacities(String[] efficacities) {
		this.efficacities = efficacities;
	}
	
}
