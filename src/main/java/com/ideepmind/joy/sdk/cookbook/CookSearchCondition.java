package com.ideepmind.joy.sdk.cookbook;

import java.util.List;


import com.ideepmind.joy.sdk.DataItem;
import com.ideepmind.joy.sdk.user.UserData;

/**
 * @author tby
 * 食材和食谱查询条件
 */
public class CookSearchCondition {
	/**
	 * 用户信息
	 */
	private UserData userData;
	
	/**
	 * 日常保健
	 */
	private List<DataItem> healthCare;
	/**
	 * 病情调理
	 */
	private List<DataItem> disease;
	
	private List<DataItem> liketaste;
	
	private List<DataItem> hitetaste;
	
	private List<DataItem> likefoodmat;
	
	private List<DataItem> hitefoodmat;

	
	/**
	 * 其他喜欢的要求
	 */
	private List<DataItem> likeOthers;
	
	/**
	 * 其他不喜欢的要求
	 */
	private List<DataItem> dislikeOthers;
	
	private String[] sqlDatas;
	
	private int count;
	private String season;
	private String moon;
	
	private String territoryColumn;
	
	private String[] msjTags;
	
	/**
	 * 没有匹配条件
	 */
	private boolean noMatchCondtion;
	
	public String getMoon() {
		return moon;
	}

	public void setMoon(String moon) {
		this.moon = moon;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public boolean isNoMatchCondtion() {
		return noMatchCondtion;
	}

	public void setNoMatchCondtion(boolean noMatchCondtion) {
		this.noMatchCondtion = noMatchCondtion;
	}

	public void resetSqlDatas() {
		this.sqlDatas = null;
	}
	
	public void mergeDisease(List<DataItem> items) {
		if (this.disease == null) {
			this.disease = items;
		} else {
			this.disease.addAll(items);
		}
	}
	
	public void mergeHealthCare(List<DataItem> items) {
		if (this.healthCare == null) {
			this.healthCare = items;
		} else {
			this.healthCare.addAll(items);
		}
	}
	
	public void mergeLiketaste(List<DataItem> items) {
		if (this.liketaste == null) {
			this.liketaste = items;
		} else {
			this.liketaste.addAll(items);
		}
	}
	
	public void mergeHitetaste(List<DataItem> items) {
		if (this.hitetaste == null) {
			this.hitetaste = items;
		} else {
			this.hitetaste.addAll(items);
		}
	}
	
	public void mergeLikefoodmat(List<DataItem> items) {
		if (this.likefoodmat == null) {
			this.likefoodmat = items;
		} else {
			this.likefoodmat.addAll(items);
		}
	}
	
	public void mergeHitefoodmat(List<DataItem> items) {
		if (this.hitefoodmat == null) {
			this.hitefoodmat = items;
		} else {
			this.hitefoodmat.addAll(items);
		}
	}
	
	public void mergeLikeOthers(List<DataItem> items) {
		if (this.likeOthers == null) {
			this.likeOthers = items;
		} else {
			this.likeOthers.addAll(items);
		}
	}
	
	public void mergeDislikeOthers(List<DataItem> items) {
		if (this.dislikeOthers == null) {
			this.dislikeOthers = items;
		} else {
			this.dislikeOthers.addAll(items);
		}
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
	 * @return the likeOthers
	 */
	public List<DataItem> getLikeOthers() {
		return likeOthers;
	}

	/**
	 * @param likeOthers the likeOthers to set
	 */
	public void setLikeOthers(List<DataItem> likeOthers) {
		this.likeOthers = likeOthers;
	}

	/**
	 * @return the dislikeOthers
	 */
	public List<DataItem> getDislikeOthers() {
		return dislikeOthers;
	}

	/**
	 * @param dislikeOthers the dislikeOthers to set
	 */
	public void setDislikeOthers(List<DataItem> dislikeOthers) {
		this.dislikeOthers = dislikeOthers;
	}

	/**
	 * @return the userData
	 */
	public UserData getUserData() {
		return userData;
	}

	/**
	 * @param userData the userData to set
	 */
	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	/**
	 * @return the sqlDatas
	 */
	public String[] getSqlDatas() {
		return sqlDatas;
	}

	/**
	 * @param sqlDatas the sqlDatas to set
	 */
	public void setSqlDatas(String[] sqlDatas) {
		this.sqlDatas = sqlDatas;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getTerritoryColumn() {
		return territoryColumn;
	}

	public void setTerritoryColumn(String territoryColumn) {
		this.territoryColumn = territoryColumn;
	}

	/**
	 * @return the msjTags
	 */
	public String[] getMsjTags() {
		return msjTags;
	}

	/**
	 * @param msjTags the msjTags to set
	 */
	public void setMsjTags(String[] msjTags) {
		this.msjTags = msjTags;
	}
}
