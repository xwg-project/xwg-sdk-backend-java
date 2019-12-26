package com.sdk.requests;

import java.util.Map;

import com.sdk.ClientOption;
import com.sdk.Request;
import com.sdk.entities.RequestOption;
import com.sdk.entities.params.IGetLoginAuthCodeParams;
import com.sdk.entities.results.LoginAuthCode;
import com.sdk.enums.HttpMethod;

public class GetLoginAuthCode extends Request {
	
	public GetLoginAuthCode(Map<String,Object> map){
		IGetLoginAuthCodeParams paramsObj = new IGetLoginAuthCodeParams();
		String username = map.containsKey("username")?String.valueOf(map.get("username")):"";
		paramsObj.setUsername(username);
		String clientId = map.containsKey("clientId")?String.valueOf(map.get("clientId")):ClientOption.getInstance().getAppId();
		paramsObj.setClientId(clientId);
		String clientSecret = map.containsKey("clientSecret")?String.valueOf(map.get("clientSecret")):ClientOption.getInstance().getAppSecret();
		paramsObj.setClientSecret(clientSecret);
		this.params = paramsObj;
	}
	
	@Override
	public void initRequestOption(){
		this.option = new RequestOption();
		this.option.setMethod(HttpMethod.POST);
		this.option.setEndpoint("/appauth/login/thirdAuthCode");
		this.option.setMethodPath("");
		this.option.setResultClass(new LoginAuthCode());
		this.option.setHasCommonParams(false);
		this.option.setHasAppSecretParams(false);
	}
}