package com.sdk.entities.results;

import java.util.Map;

import com.sdk.utils.StringUtil;

public class CollectibleItemCategory implements IResults {
	private String id;
	private String title;
	private String iconUrl;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
			if(data==null)
				return;
			Map<String,Object> map = StringUtil.cast(data);
			if(map==null||map.size()<=0)
				return;
			this.setId(String.valueOf(map.get("id")));
			this.setIconUrl(String.valueOf(map.get("icon_url")));
			this.setTitle(String.valueOf(map.get("title")));

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
