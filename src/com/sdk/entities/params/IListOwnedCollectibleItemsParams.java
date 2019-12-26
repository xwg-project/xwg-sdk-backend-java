package com.sdk.entities.params;

public class IListOwnedCollectibleItemsParams  {
	private String pageNum;
	private String pageSize;
	private String collectibleIds;
	public String getPageNum() {
		return pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getCollectibleIds() {
		return collectibleIds;
	}
	public void setCollectibleIds(String collectibleIds) {
		this.collectibleIds = collectibleIds;
	}
}