package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IListCollectibleCategoriesParams;
import com.sdk.entities.results.CollectibleCategoryList;
import com.sdk.enums.HttpMethod;

public class ListCollectibleCategories extends Request {
	
	public ListCollectibleCategories(Map<String,Object> map){
		IListCollectibleCategoriesParams paramsObj = new IListCollectibleCategoriesParams();
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
		this.option.setEndpoint("/wallet/collectible/item/category/list/query");
		this.option.setMethodPath("collectible.item.category.list.query");
		this.option.setResultClass(new CollectibleCategoryList());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(false);
	}

}
