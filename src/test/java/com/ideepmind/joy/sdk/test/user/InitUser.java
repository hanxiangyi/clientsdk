package com.ideepmind.joy.sdk.test.user;

import com.alibaba.fastjson.JSON;
import com.ideepmind.joy.sdk.DataItem;
import com.ideepmind.joy.sdk.DataUtil;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;
import com.ideepmind.joy.sdk.user.UserData;

public class InitUser {
	public static void main(String[] args) {
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

	}
}
