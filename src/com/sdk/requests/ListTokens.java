package com.sdk.requests;

import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IListTokensParams;
import com.sdk.entities.results.TokenList;
import com.sdk.enums.HttpMethod;

public class ListTokens extends Request {
	
	public ListTokens(Map<String,Object> map){
		IListTokensParams paramsObj = new IListTokensParams();

		this.params = paramsObj;
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/token/list/query");
		this.option.setMethodPath("token.list.query");
		this.option.setResultClass(new TokenList());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(false);
	}
}
