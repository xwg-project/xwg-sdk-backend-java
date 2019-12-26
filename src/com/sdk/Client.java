package com.sdk;

public class Client {
	private String version = "1.0";
	private ClientOption clientOption;
	
	public Client(){
		this.setClientOption(ClientOption.getInstance());
	}
	
	public ClientOption getClientOption() {
		return clientOption;
	}

	public void setClientOption(ClientOption clientOption) {
		this.clientOption = clientOption;
	}
	
	public Object request(Request request){
        return Transfer.getInstance(this, request).send();
    }

	public String getVersion() {
		return version;
	}
}
