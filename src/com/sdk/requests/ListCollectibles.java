package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IListCollectiblesParams;
import com.sdk.entities.results.CollectibleList;
import com.sdk.enums.HttpMethod;

public class ListCollectibles extends Request {
	
	public ListCollectibles(Map<String,Object> map){
		IListCollectiblesParams paramsObj = new IListCollectiblesParams();
		String pageNum = map.containsKey("pageNum")?String.valueOf(map.get("pageNum")):"";
		paramsObj.setPageNum(pageNum);
		String pageSize = map.containsKey("pageSize")?String.valueOf(map.get("pageSize")):"";
		paramsObj.setPageSize(pageSize);
		
		this.params = paramsObj;
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/collectible/list/query");
		this.option.setMethodPath("collectible.list.query");
		this.option.setResultClass(new CollectibleList());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(false);
	}
}