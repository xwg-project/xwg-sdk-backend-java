package com.sdk.entities.results;

import java.util.Map;

import com.sdk.utils.StringUtil;

public class Token implements IResults{
	private String name;
    private String symbol;
    private String decimals;
    private String totalSupply;
    private String mintable;
    private String burnable;
    private String pausable;
    private String iconUrl;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getDecimals() {
		return decimals;
	}
	public void setDecimals(String decimals) {
		this.decimals = decimals;
	}
	public String getTotalSupply() {
		return totalSupply;
	}
	public void setTotalSupply(String totalSupply) {
		this.totalSupply = totalSupply;
	}
	public String isMintable() {
		return mintable;
	}
	public void setMintable(String mintable) {
		this.mintable = mintable;
	}
	public String isBurnable() {
		return burnable;
	}
	public void setBurnable(String burnable) {
		this.burnable = burnable;
	}
	public String isPausable() {
		return pausable;
	}
	public void setPausable(String pausable) {
		this.pausable = pausable;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	
	
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//{icon_url=https://cdnjs.cloudflare.com/ajax/libs/simple-icons/3.0.1/xing.svg, pausable=true, symbol=XWG, total_supply=1000000000000000000, decimals=8.0, name=XWG, burnable=true, mintable=false}
			if(data==null)
				return;
			Map<String,Object> map = StringUtil.cast(data);
			if(map==null||map.size()<=0)
				return;
			
			this.setName(String.valueOf(map.get("name")));
			this.setSymbol(String.valueOf(map.get("symbol")));
			this.setDecimals(String.valueOf(map.get("decimals")));
			this.setTotalSupply(String.valueOf(map.get("total_supply")));
			this.setMintable(String.valueOf(map.get("mintable")));
			this.setBurnable(String.valueOf(map.get("burnable")));
			this.setPausable(String.valueOf(map.get("pausable")));
			this.setIconUrl(String.valueOf(map.get("icon_url")));
		    
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
