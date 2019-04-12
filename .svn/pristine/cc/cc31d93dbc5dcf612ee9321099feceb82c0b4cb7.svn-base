package com.ideepmind.joy.sdk.test;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.ideepmind.joy.sdk.user.UserData;

public class TestJson {
	
	public static void main(String[] args) {
		List<UserData> list = new ArrayList<>();
		UserData u = new UserData();
		u.id = "3333";
		list.add(u);
		u = new UserData();
		u.id = "3333";
		list.add(u);
		u = new UserData();
		u.id = "3333";
		list.add(u);
		String json = JSON.toJSONString(list);
		Object o = JSON.parse(json);
		Class<? extends List> clazz = list.getClass();
		if (clazz.isAssignableFrom(List.class)) {
		
		if (o instanceof JSONArray) {
			 ParameterizedType pt = (ParameterizedType)o.getClass().getGenericSuperclass();
			List list2 = JSON.parseArray(json, pt.getActualTypeArguments()[0].getClass());
			System.out.println(list2);
		}
		
		}
	}
}
