package com.ideepmind.joy.sdk;

import java.io.Serializable;

import com.ideepmind.joy.sdk.cookbook.QueryIdAcceptor;
import com.ideepmind.joy.sdk.cookbook.QueryIdVisitor;

public class PageData implements Serializable, QueryResult, QueryIdAcceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 页号，从1开始计数
	 */
	private int pageIndex;

	/**
	 * 分页大小
	 */
	private int pageSize;

	/**
	 * 总数
	 */
	private int total;

	/**
	 *  查询ID
	 */
	private String queryId;

	/**
	 * @return the pageIndex
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * @param pageIndex the pageIndex to set
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	
	/** 获取查询ID
	 * @return 查询ID
	 */
	public String getQueryId() {
		return queryId;
	}
	
	/** 设置查询ID
	 * @param queryId 查询ID
	 */
	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public void accept(QueryIdVisitor visitor) {
		visitor.visitId(queryId);		
	}
	
}
