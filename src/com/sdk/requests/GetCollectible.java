package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IGetCollectibleParams;
import com.sdk.entities.results.Collectible;
import com.sdk.enums.HttpMethod;

public class GetCollectible extends Request {
	
	public GetCollectible(Map<String,Object> map){
		IGetCollectibleParams paramsObj = new IGetCollectibleParams();
		String collectibleId = map.containsKey("collectibleId")?String.valueOf(map.get("collectibleId")):"";
		paramsObj.setCollectibleId(collectibleId);
		
		this.params = paramsObj;
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/collectible/info/query");
		this.option.setMethodPath("collectible.info.query");
		this.option.setResultClass(new Collectible());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(false);
	}
}
