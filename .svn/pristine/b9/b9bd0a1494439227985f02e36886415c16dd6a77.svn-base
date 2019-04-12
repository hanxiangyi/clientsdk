package com.ideepmind.joy.sdk.test;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.ideepmind.joy.sdk.DataUtil;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.cookbook.MaterailsOfFood;
import com.ideepmind.joy.sdk.cookbook.MaterialOfFoodData;
import com.ideepmind.joy.sdk.cookbook.MaterialsOfFoodResult;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;
import com.ideepmind.joy.sdk.user.UserData;

public class TestWeight2 {
	public static void main(String[] args) {
		//RMIResult.
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
		s.openSession("test", "code");
		Category[] foods = s.GetMaterailsOfFood("萝卜").getResult().getFoodList();
		for(Category data:foods)
		{
			System.out.println(data.getName());
		}
		s.closeSession();
	}
}
