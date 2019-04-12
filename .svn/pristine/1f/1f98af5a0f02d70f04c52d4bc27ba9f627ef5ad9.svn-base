package com.ideepmind.joy.sdk.test;

import com.alibaba.fastjson.JSON;
import com.ideepmind.joy.sdk.DataItem;
import com.ideepmind.joy.sdk.DataUtil;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;
import com.ideepmind.joy.sdk.user.UserData;

public class TestFindCookbook {
	public static void main(String[] args) {
		//RMIResult.
//		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:9050");
//		s.setBaseUrl("http://192.168.1.10/joy2");
//		System.out.println("tryLogin" + JSON.toJSONString(s.tryLogin("48F654CFE88FC432FCE0ABDBD987B6F7", "333")));
//		System.out.println("openSession" + JSON.toJSONString(s.openSession("test", "code")));

//		System.out.println("find" + JSON.toJSONString(s.findCookbook(Category.build(CategoryType.EffDisease, "糖尿病"), 1, 6)));
//		System.out.println("find" + JSON.toJSONString(s.findCookbook(Category.build(CategoryType.Season, "猪肉"), 1, 6)));
//		System.out.println("find" + JSON.toJSONString(s.findCookbook(Category.build(CategoryType.EffHealthcare, "怀孕"), 1, 6)));

		System.out.println("find" + JSON.toJSONString(s.findItemsOfCategory(CategoryType.Taste,0,0)));
		
//		s.closeSession();
//		s.tryLogin("bc200eff20e240a4a2935967bae0c22e", "11");
	}
}
