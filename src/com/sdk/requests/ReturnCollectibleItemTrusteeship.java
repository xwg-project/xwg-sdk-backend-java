package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IReturnCollectibleItemTrusteeshipParams;
import com.sdk.entities.results.OperationReceipt;
import com.sdk.enums.HttpMethod;

public class ReturnCollectibleItemTrusteeship extends Request {
	
	public ReturnCollectibleItemTrusteeship(Map<String,Object> map){
		IReturnCollectibleItemTrusteeshipParams paramsObj = new IReturnCollectibleItemTrusteeshipParams();
		String originalOperationNo = map.containsKey("originalOperationNo")?String.valueOf(map.get("originalOperationNo")):"";
		paramsObj.setOriginalOperationNo(originalOperationNo);
		String outOperationNo = map.containsKey("outOperationNo")?String.valueOf(map.get("outOperationNo")):"";
		paramsObj.setOutOperationNo(outOperationNo);
		String notifyUrl = map.containsKey("notifyUrl")?String.valueOf(map.get("notifyUrl")):"";
		paramsObj.setNotifyUrl(notifyUrl);
		String operatorId = map.containsKey("operatorId")?String.valueOf(map.get("operatorId")):"";
		paramsObj.setOperatorId(operatorId);
		
		this.params = paramsObj;
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/merchant/collectible/item/operation/trusteeship/return");
		this.option.setMethodPath("merchant.collectible.item.operation.trusteeship.return");
		this.option.setResultClass(new OperationReceipt());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(true);
	}
}