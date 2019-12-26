package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IGetCollectibleItemParams;
import com.sdk.entities.results.CollectibleItem;
import com.sdk.enums.HttpMethod;

public class GetCollectibleItem extends Request {
	
	public GetCollectibleItem(Map<String,Object> map){
		IGetCollectibleItemParams paramsObj = new IGetCollectibleItemParams();
		String collectibleItemId = map.containsKey("collectibleItemId")?String.valueOf(map.get("collectibleItemId")):"";
		paramsObj.setCollectibleItemId(collectibleItemId);

		this.params = paramsObj;
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/collectible/item/info/query");
		this.option.setMethodPath("collectible.item.info.query");
		this.option.setResultClass(new CollectibleItem());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(false);
	}

}
