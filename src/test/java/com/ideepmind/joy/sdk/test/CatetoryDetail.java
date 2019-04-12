package com.ideepmind.joy.sdk.test;

import com.alibaba.fastjson.JSONObject;
import com.ideepmind.joy.sdk.JoyException;
import com.ideepmind.joy.sdk.JoyHttpService;
import com.ideepmind.joy.sdk.chat.ChatRecord;
import com.ideepmind.joy.sdk.diet.Category;
import com.ideepmind.joy.sdk.diet.CategoryType;
import com.ideepmind.joy.sdk.diet.HealthDataResult;
import com.ideepmind.joy.sdk.qa.QAResult;

public class CatetoryDetail {

	public static void main(String[] args) throws JoyException {
		JoyHttpService.getIntance().setBaseUrl("http://localhost:8080");
//		JoyHttpService.getIntance().invoke(RMIResult.class, "Test", "Test");
		
		JoyHttpService s = JoyHttpService.getIntance();
		s.setBaseUrl("http://localhost:8080");
//		s.setBaseUrl("http://192.168.1.10/joy2");
		//AF63325BD1D50570C520EEDE9657EB28   02EDBC2B547CF476B12E94C3FAEBC199
		s.openSession("A6511D3CF9FCD491628C9FBB8925CF46");
		
		//s.ask("修改喜欢的口味", "PersonAddiInfo");   zhangshansjb的
		QAResult ask = s.ask("我要修", "standby");
		System.out.println(JSONObject.toJSON(ask));
		
		//s.closeSession();
	}

}
