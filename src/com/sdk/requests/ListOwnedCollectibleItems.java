package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IListOwnedCollectibleItemsParams;
import com.sdk.entities.results.CollectibleItemList;
import com.sdk.enums.HttpMethod;

public class ListOwnedCollectibleItems extends Request {
	
	public ListOwnedCollectibleItems(Map<String,Object> map){
		IListOwnedCollectibleItemsParams paramsObj = new IListOwnedCollectibleItemsParams();
		String collectibleIds = map.containsKey("collectibleIds")?String.valueOf(map.get("collectibleIds")):"";
		paramsObj.setCollectibleIds(collectibleIds);
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
		this.option.setEndpoint("/wallet/merchant/collectible/item/query");
		this.option.setMethodPath("merchant.collectible.item.query");
		this.option.setResultClass(new CollectibleItemList());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(true);
	}
}
