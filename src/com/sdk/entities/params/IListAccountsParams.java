package com.sdk.entities.params;

public class IListAccountsParams {
	private String symbols;
	private String performerUserId;
	public String getSymbols() {
		return symbols;
	}
	public void setSymbols(String symbols) {
		this.symbols = symbols;
	}
	public String getPerformerUserId() {
		return performerUserId;
	}
	public void setPerformerUserId(String performerUserId) {
		this.performerUserId = performerUserId;
	}
}
