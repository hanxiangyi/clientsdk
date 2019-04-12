package com.ideepmind.joy.sdk.test;

import com.alibaba.fastjson.JSON;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.diet.CategoryPageResult;
import com.ideepmind.joy.sdk.diet.CategoryType;

public class TestFindName {
	public static void main(String[] args) {
		//RMIResult.
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
		s.openSession("test", "code");
		CategoryPageResult names = s.findItemsOfCategory(CategoryType.Food);
		System.out.println(names.getResult().getItems().length);
		
		System.out.println(JSON.toJSONString(s.findItemsOfCategory(CategoryType.Efficacity, 0, 10)));
		s.closeSession();
//		s.tryLogin("bc200eff20e240a4a2935967bae0c22e", "11");
	}
	
	public static void main1(String[] args) {
		//RMIResult.
		JoyHttpService s = JoyHttpService.getIntance();
//		s.setBaseUrl("http://localhost:8080");
		s.setBaseUrl("http://192.168.1.10/joy2");
		//s.loginSession("bc200eff20e240a4a2935967bae0c22e", "11");
		
		System.out.println(JSON.toJSONString(s.getAllMemberData()));
//		s.closeSession();
//		s.tryLogin("bc200eff20e240a4a2935967bae0c22e", "11");
	}
}
