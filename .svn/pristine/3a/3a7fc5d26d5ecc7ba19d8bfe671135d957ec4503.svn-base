package com.ideepmind.joy.sdk.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ideepmind.joy.sdk.JoyException;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;

public class Test1 {

	public static void main(String[] args) {
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
		JoyHttpService.getIntance().tryLogin("101", null);
	}
	public static void main2(String[] args) throws JoyException {
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		{"contactIMInfo":{"appKey":"8a216da85805311d015819f507380bc9","appToken":"40ce469ab3b0ff76d36824319834e406","userId":"100237"},"sessionKey":"715d0a7d2cf144f1ad4087b3a00754a2","temp":true}
		String param = "{\"op_action\":\"login\",\"uname\":\"15555530123\",\"passwd\":\"11\",\"mob_data\":{\"mobile_id\":\"1b813197b36ef3ddc14066bc38de025a\"}}";
		String devCode = "1b813197b36ef3ddc14066bc38de025a";
//		System.out.println(JSON.toJSON(s.login(param, devCode)));
//		s.openSession("test", "code");
		s.tryLogin("715d0a7d2cf144f1ad4087b3a00754a2", "f02b1b1d1c313b195ac3b9fa1ea75940");
		
		//["715d0a7d2cf144f1ad4087b3a00754a2","f02b1b1d1c313b195ac3b9fa1ea75940"]
//		System.out.println(JSON.toJSON(s.recommendCombinatorialCookbook(2)));
		
		// s.closeSession();
	}
	
	public static void main1(String[] args) throws JoyException {
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
		s.openSession("test", "code");
//		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().findCookbook(new Category(CategoryType.Season, "春"), 0, 0)));
//		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().findCookbook(new Category(CategoryType.Season, "人群"), 0, 0)));
		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().
				getCategoryDetail(new Category(CategoryType.Season, "春"))));

		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().ask("你好", "")));
		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().city("40.046548726921589,116.31596612695755")));
		//		System.out.println(JSONObject.toJSON(JoyHttpService.getIntance().getDietDataOfHome()));
		s.closeSession();
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
