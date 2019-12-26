package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IListOrdersParams;
import com.sdk.entities.results.OrderList;
import com.sdk.enums.HttpMethod;

public class ListOrders extends Request {
	
	public ListOrders(Map<String,Object> map){
		IListOrdersParams paramsObj = new IListOrdersParams();
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
		this.option.setEndpoint("/wallet/merchant/order/list/query");
		this.option.setMethodPath("merchant.order.list.query");
		this.option.setResultClass(new OrderList());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(true);
	}
}