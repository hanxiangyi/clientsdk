package com.ideepmind.joy.sdk.test;

import com.alibaba.fastjson.JSON;
import com.ideepmind.joy.sdk.DataItem;
import com.ideepmind.joy.sdk.DataUtil;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;
import com.ideepmind.joy.sdk.user.UserData;

public class TestRMI {
	public static void main(String[] args) {
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://192.168.1.10/joy2");
		s.openSession("test", "code");
		System.out.println(JSON.toJSON(s.findFoodMaterials("春", 0, 0)));
		s.closeSession();
	}
	
	public static void main2(String[] args) {
		//RMIResult.
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
		System.out.println("openSession" + JSON.toJSONString(s.openSession("test", "code")));

		UserData u1 = new UserData();
		u1.id = "4372ac5b774e4aa2b221a9af92727121";//DataUtil.getUUID();
		u1.name = "fdfdsf";
		u1.birthday = "1933-1-1";
		u1.getDisease().add(new DataItem("B01", "糖尿病"));
		s.saveMember(u1);
		s.deleteMember(u1);
	}
	
	public static void main1(String[] args) {
		//RMIResult.
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
		System.out.println("openSession" + JSON.toJSONString(s.openSession("test", "code")));

		UserData u1 = new UserData();
		u1.id = "4372ac5b774e4aa2b221a9af92727121";//DataUtil.getUUID();
		u1.name = "fdfdsf";
		u1.birthday = "1933-1-1";
		u1.getDisease().add(new DataItem("B01", "糖尿病"));
		s.saveMember(u1);
//		s.deleteMember(u1);
//		System.out.println("findNames:" + JSON.toJSONString(s.findNames(CategoryType.Efficacity)));
		System.out.println("findCookbookDetail:" + JSON.toJSONString(s.findCookbookDetail("D002")));
		System.out.println("getAllMemberData:" + JSON.toJSONString(s.getAllMemberData()));

		System.out.println("findFoods:" + JSON.toJSONString(s.findFoodMaterials(new Category(CategoryType.Season,"春"), 0, 10)));
		System.out.println("findCookbook:" + JSON.toJSONString(s.findCookbook(new Category(CategoryType.Season,"春"), 0, 10)));

		System.out.println("findCookbookDetail:" + JSON.toJSONString(s.findCookbookDetail("D006")));
		
//		System.out.println("findFoods:" + JSON.toJSONString(s.findFoods(Category.build(CategoryType.Season, new String[]{"春", "夏"}), 1, 2)));
//
//		System.out.println("findFoods:" + JSON.toJSONString(s.findFoods(Category.build(CategoryType.Season, new String[]{"春", "夏"}), 1, 2)));
//		System.out.println("findFoods:" + JSON.toJSONString(s.findFoods(Category.build(CategoryType.Season, new String[]{"春", "夏"}), 3, 2)));
		System.out.println("dietHome:" + JSON.toJSONString(s.getDietDataOfHome()));
		
		System.out.println("foodDetail:" + JSON.toJSONString(s.getFoodMaterialDetail("猪肉")));
		System.out.println("foodIntro:" + JSON.toJSONString(s.getFoodMaterialIntro("猪肉")));
//		
//		System.out.println("findCookbook:" + JSON.toJSONString(s.findCookbook((Category)null, 0, 0)));
//		System.out.println("recommendFamily:" + JSON.toJSONString(s.recommendFamily()));
//		System.out.println("findCookbookDetail:" + JSON.toJSONString(s.findCookbookDetail("")));
//		System.out.println("recommendCombo:" + JSON.toJSONString(s.recommendCombo()));
		
//		System.out.println(JSON.toJSONString(s.getAllUserData()));
		s.closeSession();
//		s.tryLogin("bc200eff20e240a4a2935967bae0c22e", "11");
	}
}
