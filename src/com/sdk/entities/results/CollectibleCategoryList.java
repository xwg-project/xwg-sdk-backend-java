package com.sdk.entities.results;

import java.util.ArrayList;
import java.util.List;

import com.sdk.utils.StringUtil;

public class CollectibleCategoryList implements IResults {
	private List<CollectibleCategory> data;
	public List<CollectibleCategory> getData() {
		return data;
	}
	public void setData(List<CollectibleCategory> data) {
		this.data = data;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//[{icon_url=https://res.xwg.one/col/COL00000000.png, total=100.0, remain=99.0, description=字玄德，涿郡涿县人，汉景帝子中山靖王胜之后也。以仁德治天下。, collectible_id=1.0, id=COL00000000, title=刘备, way=获取方式}, {icon_url=https://res.xwg.one/col/COL00000001.png, total=200.0, remain=120.0, description=字仲谋，吴郡富春县人。统领吴与蜀魏三足鼎立，制衡天下。, collectible_id=1.0, id=COL00000001, title=孙权, way=获取方式}, {icon_url=https://res.xwg.one/col/COL00000002.png, total=300.0, remain=112.0, description=字孟德，小名阿瞒、吉利，沛国谯人。精兵法，善诗歌，乃治世之能臣，乱世之奸雄也。, collectible_id=1.0, id=COL00000002, title=曹操, way=获取方式}, {icon_url=https://res.xwg.one/col/COL00000003.png, total=9000.0, remain=1.0, description=字子龙，常山真定人。身长八尺，姿颜雄伟。, collectible_id=1.0, id=COL00000003, title=赵云, way=获取方式}, {icon_url=https://res.xwg.one/col/COL00000004.png, total=300.0, remain=276.0, description=本字长生，后改字云长，河东郡解县人。被奉为“关圣帝君”，崇为“武圣”。, collectible_id=1.0, id=COL00000004, title=关羽, way=获取方式}]
			if(data==null)
				return;
			List<Object> list = StringUtil.cast(data);
			if(list==null)
				return;
			List<CollectibleCategory> abList = new ArrayList<CollectibleCategory>();
			for(int i=0,lengthI=list.size();i<lengthI;i++){
			    Object obj = list.get(i);
			    if(obj==null)
			    	continue;
			    
			    CollectibleCategory cci = new CollectibleCategory();
			    cci.assignment(obj);
			    
			    abList.add(cci);
			}
			this.setData(abList);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
