package com.sdk.entities.results;

import java.util.Map;

import com.sdk.utils.StringUtil;

public class CollectibleCategory implements IResults {
	private String id;
	private String collectibleId;
	private String title;
	private String description;
	private String iconUrl;
	private String way;
	private String total;
	private String remain;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCollectibleId() {
		return collectibleId;
	}
	public void setCollectibleId(String collectibleId) {
		this.collectibleId = collectibleId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getRemain() {
		return remain;
	}
	public void setRemain(String remain) {
		this.remain = remain;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//{icon_url=https://res.xwg.one/col/COL00000000.png, total=100.0, remain=99.0, description=字玄德，涿郡涿县人，汉景帝子中山靖王胜之后也。以仁德治天下。, collectible_id=1.0, id=COL00000000, title=刘备, way=获取方式}
			if(data==null)
				return;
			Map<String,Object> map = StringUtil.cast(data);
			if(map==null||map.size()<=0)
				return;

			this.setId(String.valueOf(map.get("id")));
			this.setCollectibleId(String.valueOf(map.get("collectible_id")));
			this.setTitle(String.valueOf(map.get("title")));
			this.setDescription(String.valueOf(map.get("description")));
			this.setIconUrl(String.valueOf(map.get("icon_url")));
			this.setWay(String.valueOf(map.get("way")));
			this.setTotal(String.valueOf(map.get("total")));
			this.setRemain(String.valueOf(map.get("remain")));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
