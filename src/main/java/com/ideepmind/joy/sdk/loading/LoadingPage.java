package com.ideepmind.joy.sdk.loading;

import java.io.Serializable;

public class LoadingPage implements Serializable{

	private static final long serialVersionUID = 1L;
	LoadData[] loadDatas;
	public LoadData[] getLoadDatas() {
		return loadDatas;
	}
	public void setLoadDatas(LoadData[] loadDatas) {
		this.loadDatas = loadDatas;
	}
	
	
}
