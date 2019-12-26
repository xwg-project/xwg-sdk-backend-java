package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IListTokenExchangeRatesParams;
import com.sdk.entities.results.TokenExchangeRateList;
import com.sdk.enums.HttpMethod;

public class ListTokenExchangeRates extends Request {
	
	public ListTokenExchangeRates(Map<String,Object> map){
		IListTokenExchangeRatesParams paramsObj = new IListTokenExchangeRatesParams();
		String pairs = map.containsKey("pairs")?String.valueOf(map.get("pairs")):"";
		paramsObj.setPairs(pairs);
		
		this.params = paramsObj;
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/token/exchange_rate/query");
		this.option.setMethodPath("token.exchange_rate.query");
		this.option.setResultClass(new TokenExchangeRateList());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(false);
	}
}
