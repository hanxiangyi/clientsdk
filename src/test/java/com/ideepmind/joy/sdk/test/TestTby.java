package com.ideepmind.joy.sdk.test;

import com.alibaba.fastjson.JSONObject;
import com.ideepmind.joy.sdk.BooleanResult;
import com.ideepmind.joy.sdk.JoyException;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;

public class TestTby {

	public static void main(String[] args) {
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
		s.openSession("84401656d75b422aba9c22b75a694e22");
		BooleanResult faceSuccess = s.faceSuccess();
		System.out.println(faceSuccess);
//		s.closeSession();
	}
	
	public static void main2(String[] args) throws JoyException {
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
		
		String param = "{\"op_action\":\"regTempUser\",\"api_version\":\"2\",\"app\":\"3\",\"mob_data\":{\"mobile_id\":\"c52c568a49f53af876f133a78e3a9896\"}}";
		String devCode = "c52c568a49f53af876f133a78e3a9896";
		
		s.loginTemp(param, devCode);
//		s.login("d8eae73aa2a441a1ab533e731dccbc51", "237ab084a746fed8fffd4e805dbb97ec");
		
//		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().findCookbook(new Category(CategoryType.Season, "春"), 0, 0)));
//		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().findCookbook(new Category(CategoryType.Season, "人群"), 0, 0)));
		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().
				getCategoryDetail(new Category(CategoryType.Season, "春"))));

		//		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().getDietDataOfHome()));
		
	}
	
	class Node {
		public Node nextNode;
		public Object value;
	}
	
	class LinkList {
		public Node firstNode;
		
		public void reverse1() {
			if (firstNode == null || firstNode.nextNode == null) {
				return ;
			}
			// 循环算法
			Node curNode = firstNode;
			Node nextNode = firstNode.nextNode;
			while (nextNode != null) {
				Node next = nextNode.nextNode;
				nextNode.nextNode = curNode;
				curNode = nextNode;
				nextNode = next;
			}
			firstNode = curNode;
		}
		
		public void reverse2() {
			if (firstNode == null || firstNode.nextNode == null) {
				return ;
			}
			// 递归
			Node last = firstNode;
			LinkList tempList = new LinkList();
			Node next = firstNode.nextNode;
			tempList.firstNode = next;
			tempList.reverse2();			
			firstNode = tempList.firstNode;
			next.nextNode = last;
		}
	}

}
