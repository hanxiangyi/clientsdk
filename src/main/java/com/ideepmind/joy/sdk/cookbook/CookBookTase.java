package com.ideepmind.joy.sdk.cookbook;

import java.util.List;

import com.ideepmind.joy.sdk.ServiceResult;


public class CookBookTase extends ServiceResult<CookBookTase>{
	
	private List<SimpleFood> androidData;
	
	
	public List<SimpleFood> getAndroidData() {
		return androidData;
	}
	public void setAndroidData(List<SimpleFood> androidData) {
		this.androidData = androidData;
	}
	private List<String> efficacy1;
	private List<String> efficacy2;
	
	private List<String> crowd;
	private List<String> taste;
	private List<String> season;
	private List<String> preference;
	
	
	public List<String> getPreference() {
		return preference;
	}
	public void setPreference(List<String> preference) {
		this.preference = preference;
	}
	public List<String> getEfficacy1() {
		return efficacy1;
	}
	public void setEfficacy1(List<String> efficacy1) {
		this.efficacy1 = efficacy1;
	}
	public List<String> getEfficacy2() {
		return efficacy2;
	}
	public void setEfficacy2(List<String> efficacy2) {
		this.efficacy2 = efficacy2;
	}
	public List<String> getCrowd() {
		return crowd;
	}
	public void setCrowd(List<String> crowd) {
		this.crowd = crowd;
	}
	public List<String> getTaste() {
		return taste;
	}
	public void setTaste(List<String> taste) {
		this.taste = taste;
	}
	public List<String> getSeason() {
		return season;
	}
	public void setSeason(List<String> season) {
		this.season = season;
	}
}
