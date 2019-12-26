package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.ICreateTradeOrderParams;
import com.sdk.entities.results.OrderReceipt;
import com.sdk.enums.HttpMethod;

public class CreateTradeOrder extends Request {
	
	public CreateTradeOrder(Map<String,Object> map){	    
		ICreateTradeOrderParams paramsObj = new ICreateTradeOrderParams();
		String payerId = map.containsKey("payerId")?String.valueOf(map.get("payerId")):"";
		paramsObj.setPayerId(payerId);
		String outOrderNo = map.containsKey("outOrderNo")?String.valueOf(map.get("outOrderNo")):"";
		paramsObj.setOutOrderNo(outOrderNo);
		String symbol = map.containsKey("symbol")?String.valueOf(map.get("symbol")):"";
		paramsObj.setSymbol(symbol);
		String totalAmount = map.containsKey("totalAmount")?String.valueOf(map.get("totalAmount")):"0";
		paramsObj.setTotalAmount(totalAmount);
		String discountAmount = map.containsKey("discountAmount")?String.valueOf(map.get("discountAmount")):"0";
		paramsObj.setDiscountAmount(discountAmount);
		String returnUrl = map.containsKey("returnUrl")?String.valueOf(map.get("returnUrl")):"";
		paramsObj.setReturnUrl(returnUrl);
		String notifyUrl = map.containsKey("notifyUrl")?String.valueOf(map.get("notifyUrl")):"";
		paramsObj.setNotifyUrl(notifyUrl);
		String subject = map.containsKey("subject")?String.valueOf(map.get("subject")):"";
		paramsObj.setSubject(subject);
		String body = map.containsKey("body")?String.valueOf(map.get("body")):"";
		paramsObj.setBody(body);
		String operatorId = map.containsKey("operatorId")?String.valueOf(map.get("operatorId")):"";
		paramsObj.setOperatorId(operatorId);
		String feeSymbol = map.containsKey("feeSymbol")?String.valueOf(map.get("feeSymbol")):"";
		paramsObj.setFeeSymbol(feeSymbol);
		String feeAmount = map.containsKey("feeAmount")?String.valueOf(map.get("feeAmount")):"0";
		paramsObj.setFeeAmount(feeAmount);
		
		this.params = paramsObj;
	
	}
	
	@Override
	public void initRequestOption() {
		// TODO Auto-generated method stub
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/merchant/order/trade/create");
		this.option.setMethodPath("merchant.order.trade.create");
		this.option.setResultClass(new OrderReceipt());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(true);
	}

}
