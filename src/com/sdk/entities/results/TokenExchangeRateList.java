package com.sdk.entities.results;

import java.util.ArrayList;
import java.util.List;

import com.sdk.utils.StringUtil;

public class TokenExchangeRateList implements IResults {
	private List<TokenExchangeRate> data;
	public List<TokenExchangeRate> getData() {
		return data;
	}
	public void setData(List<TokenExchangeRate> data) {
		this.data = data;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//[{rate=1.0, pair=XWG/TCB}, {rate=0.7, pair=XWG/XWGT}, {rate=0.7, pair=TCB/XWGT}]
			if(data==null)
				return;
			List<Object> list = StringUtil.cast(data);
			if(list==null)
				return;
			List<TokenExchangeRate> abList = new ArrayList<TokenExchangeRate>();
			for(int i=0,lengthI=list.size();i<lengthI;i++){
			    Object obj = list.get(i);
			    if(obj==null)
			    	continue;
			    
			    TokenExchangeRate ter = new TokenExchangeRate();
			    ter.assignment(obj);
			    
			    abList.add(ter);
			}
			this.setData(abList);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}