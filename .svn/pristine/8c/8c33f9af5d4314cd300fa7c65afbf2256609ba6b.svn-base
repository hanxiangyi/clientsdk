package com.ideepmind.joy.sdk.test.user;

import com.alibaba.fastjson.JSON;
import com.ideepmind.joy.sdk.DataItem;
import com.ideepmind.joy.sdk.DataUtil;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;
import com.ideepmind.joy.sdk.user.UserData;

public class TestUser {
	public static void main(String[] args) {
		//RMIResult.
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
		System.out.println("openSession:" + JSON.toJSONString(s.openSession("33a1c7ad9fe44f2186953d17a7b2c101")));

		System.out.println("getAllUserData:" + JSON.toJSONString(s.getAllUserData()));
		
		System.out.println("getAllUserData:" + JSON.toJSONString(s.recommendFamilyCookbook()));

	}
}
