package com.sdk.entities.results;

import java.util.ArrayList;
import java.util.List;

import com.sdk.utils.StringUtil;

public class TokenList implements IResults {
	private List<Token> data;
	public List<Token> getData() {
		return data;
	}
	public void setData(List<Token> data) {
		this.data = data;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//[{icon_url=https://cdnjs.cloudflare.com/ajax/libs/simple-icons/3.0.1/xing.svg, pausable=true, symbol=XWG, total_supply=1000000000000000000, decimals=8.0, name=XWG, burnable=true, mintable=false}, {icon_url=https://cdnjs.cloudflare.com/ajax/libs/simple-icons/3.0.1/visa.svg, pausable=true, symbol=XWGT, total_supply=1000000000000000000, decimals=8.0, name=XWGT, burnable=true, mintable=false}, {icon_url=https://cdnjs.cloudflare.com/ajax/libs/simple-icons/3.0.1/wire.svg, pausable=true, symbol=TCB, total_supply=1000000000000000000, decimals=8.0, name=TCB, burnable=true, mintable=false}, {icon_url=https://cdnjs.cloudflare.com/ajax/libs/simple-icons/3.0.1/wire.svg, pausable=true, symbol=RMBC, total_supply=1000000000000000000, decimals=8.0, name=RMBC, burnable=true, mintable=false}, {icon_url=https://cdnjs.cloudflare.com/ajax/libs/simple-icons/3.0.1/wire.svg, pausable=true, symbol=RMBT, total_supply=1000000000000000000, decimals=8.0, name=RMBT, burnable=true, mintable=false}, {icon_url=https://cdnjs.cloudflare.com/ajax/libs/simple-icons/3.0.1/wire.svg, pausable=true, symbol=XWGC, total_supply=1000000000000000000, decimals=8.0, name=XWGC, burnable=true, mintable=false}, {icon_url=https://cdnjs.cloudflare.com/ajax/libs/simple-icons/3.0.1/wire.svg, pausable=true, symbol=XWGS, total_supply=1000000000000000000, decimals=8.0, name=XWGS, burnable=true, mintable=false}]
			if(data==null)
				return;
			List<Object> list = StringUtil.cast(data);
			if(list==null)
				return;
			List<Token> abList = new ArrayList<Token>();
			for(int i=0,lengthI=list.size();i<lengthI;i++){
			    Object obj = list.get(i);
			    if(obj==null)
			    	continue;
			    
			    Token t = new Token();
			    t.assignment(obj);
			    
			    abList.add(t);
			}
			this.setData(abList);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

