package com.ideepmind.joy.sdk.diet;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *  健康咨询视图
 * @author zdq
 *
 */

public class HealthQuery implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 		     this class is for android client 
	 * 
	 * 			 this view for example :
	 * 
	 * 		
	 * 		   key1				 key2			 key3           ......
	 * 		
	 * 		HealthContent     HealthContent    HealthContent    ......
	 * 		HealthContent	  HealthContent	   HealthContent	......
	 * 		HealthContent	  HealthContent    HealthContent	......
	 * 
	 * 
	 */
	
	private List<List<HealthContent>> healthCategory;
	
	/**
	 * 		     this class is for android client 
	 * 
	 * 			 this view for example :
	 * 
	 * 		
	 * 		   key1				 key2			 key3           ......
	 * 		
	 * 		HealthContent     HealthContent    HealthContent    ......
	 * 		HealthContent	  HealthContent	   HealthContent	......
	 * 		HealthContent	  HealthContent    HealthContent	......
	 * 
	 * 
	 */

	public List<List<HealthContent>> getHealthCategory() {
		return healthCategory;
	}
	
	public void setHealthCategory(List<List<HealthContent>> healthCategory) {
		this.healthCategory = healthCategory;
	}
	
}

