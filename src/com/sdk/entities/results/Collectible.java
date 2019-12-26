package com.sdk.entities.results;

import java.util.Map;

import com.sdk.utils.StringUtil;

public class Collectible implements IResults {
	private String id;
	private String name;
	private String symbol;
	private String iconUrl;
	private String infoUrl;
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getInfoUrl() {
		return infoUrl;
	}
	public void setInfoUrl(String infoUrl) {
		this.infoUrl = infoUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//{icon_url=https://www.baidu.com/img/bd_logo1.png, symbol=SG, name=三国, description=xxxxxxxxxx, id=1.0, info_url=https://www.baidu.com/}
			Map<String,Object> map = StringUtil.cast(data);
			if(map==null||map.size()<=0)
				return;
			this.setIconUrl(String.valueOf(map.get("icon_url")));
			this.setSymbol(String.valueOf(map.get("symbol")));
			this.setName(String.valueOf(map.get("name")));
			this.setDescription(String.valueOf(map.get("description")));
			this.setId(String.valueOf(map.get("id")));
			this.setInfoUrl(String.valueOf(map.get("info_url")));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
