package com.ideepmind.joy.sdk.test;

import com.alibaba.fastjson.JSON;
import com.ideepmind.joy.sdk.DataItem;
import com.ideepmind.joy.sdk.DataUtil;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;
import com.ideepmind.joy.sdk.user.UserData;

public class TestCook {
	public static void main(String[] args) {
		//RMIResult.
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
		s.openSession("test", "470353e6d7f3f0664770adc7430ebcfb");
//		s.openSession("7433be63653c45a8b64921cb89063131", "code");
		//System.out.println("getFoodMaterialDetail:" + JSON.toJSONString(
		//		s.getFoodMaterialDetail("熟肉")));
		System.out.println(s.findCookbookDetail("D001").getResult().getName());
//<<<<<<< .mine
////		s.findNames(CategoryType.Food);
//=======
//		s.findItemsOfCategory(CategoryType.Food);
//>>>>>>> .r933
//		UserData u1 = new UserData();
//		u1.id = "4372ac5b774e4aa2b221a9af92727121";//DataUtil.getUUID();
//		u1.name = "fdfdsf";
//		u1.birthday = "1933-1-1";
////		u1.getDisease().add(new DataItem("B01", "糖尿病"));
//
////		s.deleteMember(u1);
//		
//<<<<<<< .mine
//		System.out.println("getAllMemberData:" + JSON.toJSONString(
//				s.getAllMemberData()));
//		
////		System.out.println("recommendFamily:" + JSON.toJSONString(s.recommendFamilyCookbook()));
//		System.out.println("recommendFamily:" + JSON.toJSONString(
//				s.queryPages(2, 3, "af947b4f0320428ba5b925e192ca3ac6")));
//=======
//		System.out.println("recommendFamily:" + JSON.toJSONString(s.recommendFamilyCookbook()));
//>>>>>>> .r933
		s.closeSession();
//		s.tryLogin("bc200eff20e240a4a2935967bae0c22e", "11");
	}
}
