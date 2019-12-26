package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.ITransferTransOrderParams;
import com.sdk.entities.results.OrderReceipt;
import com.sdk.enums.HttpMethod;

public class TransferTransOrder extends Request {
	
	public TransferTransOrder(Map<String,Object> map){
		ITransferTransOrderParams paramsObj = new ITransferTransOrderParams();
		String payeeId = map.containsKey("payeeId")?String.valueOf(map.get("payeeId")):"";
	    paramsObj.setPayeeId(payeeId);
	    String outOrderNo = map.containsKey("outOrderNo")?String.valueOf(map.get("outOrderNo")):"";
	    paramsObj.setOutOrderNo(outOrderNo);
	    String symbol = map.containsKey("symbol")?String.valueOf(map.get("symbol")):"";
	    paramsObj.setSymbol(symbol);
	    String totalAmount = map.containsKey("totalAmount")?String.valueOf(map.get("totalAmount")):"";
	    paramsObj.setTotalAmount(totalAmount);
	    String notifyUrl = map.containsKey("notifyUrl")?String.valueOf(map.get("notifyUrl")):"";
	    paramsObj.setNotifyUrl(notifyUrl);
	    String remark = map.containsKey("remark")?String.valueOf(map.get("remark")):"";
	    paramsObj.setRemark(remark);
	    String operatorId = map.containsKey("operatorId")?String.valueOf(map.get("operatorId")):"";
	    paramsObj.setOperatorId(operatorId);
		
		this.params = paramsObj;
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/merchant/order/trans/transfer");
		this.option.setMethodPath("merchant.order.trans.transfer");
		this.option.setResultClass(new OrderReceipt());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(true);
	}
}