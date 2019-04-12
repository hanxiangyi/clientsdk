package com.ideepmind.joy.sdk.user;
import java.io.Serializable;
/**
 * 用户的体脂率和体重指标
 * @author jixuguo
 *
 */
public class BFR implements Serializable {
	private BFREnum weight;
	private float bfr =0;
	/**
	 * 
	 * @return 返回成员的体重指标
	 */
	public BFREnum getWeight() {
		return weight;
	}
	public void setWeight(BFREnum weight) {
		this.weight = weight;
	}
	/**
	 * 
	 * @return 返回成员的体脂率
	 */
	public float getBfr() {
		return bfr;
	}
	public void setBfr(float bfr) {
		this.bfr = bfr;
	}
	
}
