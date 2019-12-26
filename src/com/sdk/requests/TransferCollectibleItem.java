package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.ITransferCollectibleItemParams;
import com.sdk.entities.results.OperationReceipt;
import com.sdk.enums.HttpMethod;

public class TransferCollectibleItem extends Request {
	
	public TransferCollectibleItem(Map<String,Object> map){
		ITransferCollectibleItemParams paramsObj = new ITransferCollectibleItemParams();
		String outOperationNo = map.containsKey("outOperationNo")?String.valueOf(map.get("outOperationNo")):"";
		paramsObj.setOutOperationNo(outOperationNo);
		String itemUuid = map.containsKey("itemUuid")?String.valueOf(map.get("itemUuid")):"";
		paramsObj.setItemUuid(itemUuid);
		String receiverId = map.containsKey("receiverId")?String.valueOf(map.get("receiverId")):"";
		paramsObj.setReceiverId(receiverId);
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
		this.option.setEndpoint("/wallet/merchant/collectible/item/operation/trans/transfer");
		this.option.setMethodPath("merchant.collectible.item.operation.trans.transfer");
		this.option.setResultClass(new OperationReceipt());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(true);
	}
}