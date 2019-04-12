package com.ideepmind.joy.sdk.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ideepmind.joy.sdk.DataUtil;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;
import com.ideepmind.joy.sdk.user.UserData;

public class TestLogin {
	public static void main(String[] args) {
		//RMIResult.
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
//		String param =
		JSONObject json = new JSONObject();
		json.put("op_action", "login");
		json.put("uname", "13717979653");
		json.put("passwd", "1234");
		
		JSONObject mob_data = new JSONObject();
		mob_data.put("model", "iPhone");
		mob_data.put("mobile_id", "978bb08de150ab5de8161e5372b75051240e147a");
		json.put("mob_data", mob_data);
		
		String param = json.toJSONString();
		
		s.login(param, "test");
		System.out.println(s.caculateBodyFat(1, 10, 15,178));
//		s.closeSession();
	}
}
