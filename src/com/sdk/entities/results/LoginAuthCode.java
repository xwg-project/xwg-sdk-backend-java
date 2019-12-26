package com.sdk.entities.results;

public class LoginAuthCode implements IResults {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			if(data==null)
				return;
			this.setData(String.valueOf(data));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
