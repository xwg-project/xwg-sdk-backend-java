package com.sdk;

import java.util.Map;

public class ClientOption {
	private static ClientOption clientOption;
	public static ClientOption getInstance(){
		if(clientOption==null){
			clientOption = new ClientOption();
		}
		return clientOption;
	}
	
	public void init(Map<String,Object> map){
		String host = map.containsKey("host")?String.valueOf(map.get("host")):"";
		clientOption.setHost(host);
		String appId = map.containsKey("appId")?String.valueOf(map.get("appId")):"";
		clientOption.setAppId(appId);
		String appSecret = map.containsKey("appSecret")?String.valueOf(map.get("appSecret")):"";
		clientOption.setAppSecret(appSecret);
	}
	
	private String host;
	private String appId;
	private String appSecret;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	
}
