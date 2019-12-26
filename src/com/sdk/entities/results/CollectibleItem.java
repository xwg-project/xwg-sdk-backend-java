package com.sdk.entities.results;

import java.util.Map;

import com.sdk.utils.StringUtil;

public class CollectibleItem implements IResults {
	private String id;
	private String collectibleId;
	private CollectibleItemCategory category;
	private String uuid;
	private String ownerId;
	private String infoUrl;
	private Object properties;
	
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
	public CollectibleItemCategory getCategory() {
		return category;
	}
	public void setCategory(CollectibleItemCategory category) {
		this.category = category;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getInfoUrl() {
		return infoUrl;
	}
	public void setInfoUrl(String infoUrl) {
		this.infoUrl = infoUrl;
	}
	public Object getProperties() {
		return properties;
	}
	public void setProperties(Object properties) {
		this.properties = properties;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//{owner_id=1163283543638970082, collectible_id=1.0, id=105.0, category={icon_url=https://res.xwg.one/col/COL00000000.png, id=COL00000000, title=刘备}, uuid=562814a9-7982-413a-b773-020f63f59acc, info_url=http://news.baidu.com/, properties={att=1.0, generation=1.0, skl_1={icon_url=https://res.xwg.one/col/COL00000003.png, level=1, name=致命一击, id=SKL00000001, type=passive}, skl_2=null, val_reference=20.0, cst=3.0, level=1.0, src=drop, cri_multiplier=0.0, agl=0.05, hp=701.0, val_initial=20.0, skl_3={icon_url=https://res.xwg.one/col/COL00000003.png, level=3, name=暴击, id=SKL00000007, type=passive}, skl_4={icon_url=https://res.xwg.one/col/COL00000003.png, level=3, name=嗜血, id=SKL10000002, type=active}, hit=1.0, cap=758.0, rgn=0.0, atk=57.0, cri_chance=0.0, val_growing=0.0, ele=metal, rarity=epic}}
			if(data==null)
				return;
			Map<String,Object> map = StringUtil.cast(data);
			if(map==null||map.size()<=0)
				return;
			this.setId(String.valueOf(map.get("id")));
			Object categoryObj = map.get("category");
			if(categoryObj!=null){
				CollectibleItemCategory category =new CollectibleItemCategory();
				category.assignment(categoryObj);
				this.setCategory(category);
			}
			
			this.setUuid(String.valueOf(map.get("uuid")));
			this.setInfoUrl(String.valueOf(map.get("info_url")));
			this.setOwnerId(String.valueOf(map.get("owner_id")));
			this.setProperties(map.get("properties"));
						

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
