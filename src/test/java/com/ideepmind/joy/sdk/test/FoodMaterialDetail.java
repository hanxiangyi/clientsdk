package com.ideepmind.joy.sdk.test;

import com.ideepmind.joy.sdk.JoyException;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.cookbook.FoodIntro;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;

public class FoodMaterialDetail {

	public static void main(String[] args) throws JoyException {
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
		s.openSession("test", "code");
		//System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().getDietDataOfHome()));
		Category cate = new Category();
		cate.setType(CategoryType.Food);
		cate.setName("黄豆");;
		FoodIntro food = JoyHttpService.getIntance().getFoodMaterialDetail("黄豆").getResult();
		System.out.println(food.getEfficacy() + " NutritionFact:" +food.getNutritionFacts() + "SelectionMethod: "+food.getSelectionMethod());
		s.closeSession();
	}

}
