package com.sdk.entities.results;

import java.util.Map;

import com.sdk.utils.StringUtil;

public class TokenExchangeRate implements IResults{
	private String pair;
	private String rate;
	
	public String getPair() {
		return pair;
	}
	public void setPair(String pair) {
		this.pair = pair;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//{rate=1.0, pair=XWG/TCB}
			if(data==null)
				return;
			Map<String,Object> map = StringUtil.cast(data);
			if(map==null||map.size()<=0)
				return;
			
			this.setRate(String.valueOf(map.get("rate")));
			this.setPair(String.valueOf(map.get("pair")));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
