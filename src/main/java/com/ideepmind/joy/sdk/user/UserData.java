package com.ideepmind.joy.sdk.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ideepmind.joy.sdk.DataItem;


public class UserData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String id="";
	
	public String name="";
	public String sex="";
	public String birthday="";
	public float height=0;
	public float weight=0;
	public String city="";
	
	private String phone = "";
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 头像名
	 */
	public String icon;
	/**
	 * 日常保健
	 */
	public List<DataItem> healthCare = new ArrayList<>();
	/**
	 * 病情调理
	 */
	public List<DataItem> disease = new ArrayList<>();
	
	public List<DataItem> liketaste = new ArrayList<>();
	
	public List<DataItem> hitetaste = new ArrayList<>();
	
	public List<DataItem> likefoodmat = new ArrayList<>();
	
	public List<DataItem> hitefoodmat = new ArrayList<>();
	
	public List<DataItem> likefoodmatList = new ArrayList<>();
	
	public List<DataItem> hitefoodmatList = new ArrayList<>();

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the healthCare
	 */
	public List<DataItem> getHealthCare() {
		return healthCare;
	}

	/**
	 * @param healthCare the healthCare to set
	 */
	public void setHealthCare(List<DataItem> healthCare) {
		this.healthCare = healthCare;
	}

	/**
	 * @return the disease
	 */
	public List<DataItem> getDisease() {
		return disease;
	}

	/**
	 * @param disease the disease to set
	 */
	public void setDisease(List<DataItem> disease) {
		this.disease = disease;
	}

	/**
	 * @return the liketaste
	 */
	public List<DataItem> getLiketaste() {
		return liketaste;
	}

	/**
	 * @param liketaste the liketaste to set
	 */
	public void setLiketaste(List<DataItem> liketaste) {
		this.liketaste = liketaste;
	}

	/**
	 * @return the hitetaste
	 */
	public List<DataItem> getHitetaste() {
		return hitetaste;
	}

	/**
	 * @param hitetaste the hitetaste to set
	 */
	public void setHitetaste(List<DataItem> hitetaste) {
		this.hitetaste = hitetaste;
	}

	/**
	 * @return the likefoodmat
	 */
	public List<DataItem> getLikefoodmat() {
		return likefoodmat;
	}

	/**
	 * @param likefoodmat the likefoodmat to set
	 */
	public void setLikefoodmat(List<DataItem> likefoodmat) {
		this.likefoodmat = likefoodmat;
	}

	/**
	 * @return the hitefoodmat
	 */
	public List<DataItem> getHitefoodmat() {
		return hitefoodmat;
	}

	/**
	 * @param hitefoodmat the hitefoodmat to set
	 */
	public void setHitefoodmat(List<DataItem> hitefoodmat) {
		this.hitefoodmat = hitefoodmat;
	}

	/**
	 * @return the likefoodmatList
	 */
	public List<DataItem> getLikefoodmatList() {
		return likefoodmatList;
	}

	/**
	 * @param likefoodmatList the likefoodmatList to set
	 */
	public void setLikefoodmatList(List<DataItem> likefoodmatList) {
		this.likefoodmatList = likefoodmatList;
	}

	/**
	 * @return the hitefoodmatList
	 */
	public List<DataItem> getHitefoodmatList() {
		return hitefoodmatList;
	}

	/**
	 * @param hitefoodmatList the hitefoodmatList to set
	 */
	public void setHitefoodmatList(List<DataItem> hitefoodmatList) {
		this.hitefoodmatList = hitefoodmatList;
	}
	
}
