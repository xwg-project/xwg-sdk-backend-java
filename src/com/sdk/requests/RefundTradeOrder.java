package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IRefundTradeOrderParams;
import com.sdk.entities.results.OrderReceipt;
import com.sdk.enums.HttpMethod;

public class RefundTradeOrder extends Request {
	
	public RefundTradeOrder(Map<String,Object> map){
		IRefundTradeOrderParams paramsObj = new IRefundTradeOrderParams();
		String originalOrderNo = map.containsKey("originalOrderNo")?String.valueOf(map.get("originalOrderNo")):"";
		paramsObj.setOriginalOrderNo(originalOrderNo);
		String outOrderNo = map.containsKey("outOrderNo")?String.valueOf(map.get("outOrderNo")):"";
		paramsObj.setOutOrderNo(outOrderNo);
		String totalAmount = map.containsKey("totalAmount")?String.valueOf(map.get("totalAmount")):"";
		paramsObj.setTotalAmount(totalAmount);
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
		this.option.setEndpoint("/wallet/merchant/order/trade/refund");
		this.option.setMethodPath("merchant.order.trade.refund");
		this.option.setResultClass(new OrderReceipt());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(true);
	}
}