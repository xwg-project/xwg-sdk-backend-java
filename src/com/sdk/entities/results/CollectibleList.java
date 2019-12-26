package com.sdk.entities.results;

import java.util.ArrayList;
import java.util.List;

import com.sdk.utils.StringUtil;

public class CollectibleList implements IResults {
	private List<Collectible> data;
	public List<Collectible> getData() {
		return data;
	}
	public void setData(List<Collectible> data) {
		this.data = data;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//[{icon_url=https://www.baidu.com/img/bd_logo1.png, symbol=SG, name=三国, description=xxxxxxxxxx, id=1.0, info_url=https://www.baidu.com/}]
			if(data==null)
				return;
			List<Object> list = StringUtil.cast(data);
			if(list==null)
				return;
			List<Collectible> abList = new ArrayList<Collectible>();
			for(int i=0,lengthI=list.size();i<lengthI;i++){
			    Object obj = list.get(i);
			    if(obj==null)
			    	continue;
			    
			    Collectible c = new Collectible();
			    c.assignment(obj);
			    
			    abList.add(c);
			}
			this.setData(abList);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
