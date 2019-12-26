package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IGetOrderParams;
import com.sdk.entities.results.Order;
import com.sdk.enums.HttpMethod;

public class GetOrder extends Request {
	
	public GetOrder(Map<String,Object> map){
		IGetOrderParams paramsObj = new IGetOrderParams();
		String outOrderNo = map.containsKey("outOrderNo")?String.valueOf(map.get("outOrderNo")):"";
		paramsObj.setOutOrderNo(outOrderNo);
		String orderNo = map.containsKey("orderNo")?String.valueOf(map.get("orderNo")):"";
		paramsObj.setOrderNo(orderNo);
		
		this.params = paramsObj;
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/merchant/order/info/query");
		this.option.setMethodPath("merchant.order.info.query");
		this.option.setResultClass(new Order());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(true);
	}

}
