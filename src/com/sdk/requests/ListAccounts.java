package com.sdk.requests;

import java.util.HashMap;
import java.util.Map;

import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IListAccountsParams;
import com.sdk.entities.results.Account;
import com.sdk.enums.HttpMethod;

public class ListAccounts extends Request {
	
	public ListAccounts(Map<String,Object> map){
		IListAccountsParams paramsObj = new IListAccountsParams();
		String symbols = map.containsKey("symbols")?String.valueOf(map.get("symbols")):"";
		paramsObj.setSymbols(symbols);
		String performerUserId = map.containsKey("performerUserId")?String.valueOf(map.get("performerUserId")):"";
		paramsObj.setPerformerUserId(performerUserId);
		
		this.params = paramsObj;
		
		String token = map.containsKey("token")?String.valueOf(map.get("token")):"";
		Map<String,String> header = new HashMap<String,String>();
		header.put("Authorization", "Bearer "+token);
		this.option.setHeaders(header);
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/wallet/person/token/list/query");
		this.option.setMethodPath("person.token.list.query");
		this.option.setResultClass(new Account());
		this.option.setHasCommonParams(true);
		this.option.setHasAppSecretParams(false);
	}

}
