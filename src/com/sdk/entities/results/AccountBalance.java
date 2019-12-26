package com.sdk.entities.results;

import java.util.Map;

import com.sdk.utils.StringUtil;

public class AccountBalance implements IResults {
	private String symbol;
	private String available;
	private String frozen;
	private String total;
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	public String getFrozen() {
		return frozen;
	}
	public void setFrozen(String frozen) {
		this.frozen = frozen;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//[{symbol=RMBC, balance={total=10000000000000, available=10000000000000, frozen=0.0}}, {symbol=RMBT, balance={total=10000000000000, available=10000000000000, frozen=0.0}}, {symbol=TCB, balance={total=0.0, available=0.0, frozen=0.0}}, {symbol=XWG, balance={total=0.0, available=0.0, frozen=0.0}}, {symbol=XWGC, balance={total=10000000000000, available=10000000000000, frozen=0.0}}, {symbol=XWGS, balance={total=10000000000000, available=10000000000000, frozen=0.0}}, {symbol=XWGT, balance={total=0.0, available=0.0, frozen=0.0}}]
			if(data==null)
				return;
			Map<String,Object> map = StringUtil.cast(data);
			if(map==null||map.size()<=0)
				return;
			
			Object balance = map.get("balance");
			if(balance==null)
				return;
			
			Map<String,Object> balanceMap = StringUtil.cast(balance);
		    if(balanceMap==null||balanceMap.size()<=0)
		    	return;
		    
		    this.setTotal(String.valueOf(balanceMap.get("total")));
		    this.setAvailable(String.valueOf(balanceMap.get("available")));
		    this.setFrozen(String.valueOf(balanceMap.get("frozen")));
		    
		    String symbol = String.valueOf(map.get("symbol"));
		    this.setSymbol(symbol);
		    
		    
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
}