package com.sdk.entities.results;

import java.util.ArrayList;
import java.util.List;

import com.sdk.utils.StringUtil;

public class Account implements IResults {
	private List<AccountBalance> data;
	public List<AccountBalance> getData() {
		return data;
	}
	public void setData(List<AccountBalance> data) {
		this.data = data;
	}
	
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//[{symbol=RMBC, balance={total=10000000000000, available=10000000000000, frozen=0.0}}, {symbol=RMBT, balance={total=10000000000000, available=10000000000000, frozen=0.0}}, {symbol=TCB, balance={total=0.0, available=0.0, frozen=0.0}}, {symbol=XWG, balance={total=0.0, available=0.0, frozen=0.0}}, {symbol=XWGC, balance={total=10000000000000, available=10000000000000, frozen=0.0}}, {symbol=XWGS, balance={total=10000000000000, available=10000000000000, frozen=0.0}}, {symbol=XWGT, balance={total=0.0, available=0.0, frozen=0.0}}]
			if(data==null)
				return;
			List<Object> list = StringUtil.cast(data);
			if(list==null)
				return;	
			List<AccountBalance> abList = new ArrayList<AccountBalance>();
			for(int i=0,lengthI=list.size();i<lengthI;i++){
			    Object obj = list.get(i);
			    if(obj==null)
			    	continue;
			    
			    AccountBalance ab = new AccountBalance();
			    ab.assignment(obj);
			    
			    abList.add(ab);
			}
			this.setData(abList);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	
}
