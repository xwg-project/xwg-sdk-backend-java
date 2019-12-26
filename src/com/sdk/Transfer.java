package com.sdk;

import java.util.Date;
import java.util.Map;

import com.sdk.entities.params.ICommonParams;
import com.sdk.entities.results.RequestResultError;
import com.sdk.enums.HttpMethod;
import com.sdk.utils.HttpUtil;
import com.sdk.utils.JsonUtil;
import com.sdk.utils.StringUtil;

public class Transfer {
	
	private Client client;
    private Request request;
   
	public Transfer(Client client, Request request){
		this.setClient(client);
		this.setRequest(request);
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
	
    public static Transfer getInstance(Client client, Request request) {
        return new Transfer(client, request);
    }
    
    public Object send(){
    	String data = "";
    	String url = client.getClientOption().getHost() + this.request.option.getEndpoint();
    	String param = StringUtil.getRequestParamStr(this.request.params);
    	
    	if(this.request.option.isHasCommonParams()){
    		param+=("&"+StringUtil.getRequestParamStr(this.commonParams(param)));
    	}
    	if(this.request.option.isHasAppSecretParams()){
    		param+=("&performer_app_secret="+ClientOption.getInstance().getAppSecret());
    	}
    	if(!this.request.option.getMethodPath().equals("")){
    		param+=("&method="+this.request.option.getMethodPath());
    	}
    	
    	if (this.request.option.getMethod() == HttpMethod.GET) {
            data = HttpUtil.sendGet(url,param);
        } else {
        	data = HttpUtil.sendPost(url,param,this.request.option.getHeaders());
        }
    	if(data.equals(""))
    		return null;
    	
    	JsonUtil json = new JsonUtil(data);
		Map<String,Object> map = StringUtil.cast(json.parse());
		if(map==null||map.size()<=0||!map.containsKey("data"))
			return null;
		String code = StringUtil.trimZero(String.valueOf(map.get("code")));
		if(!code.equals("0")){
			RequestResultError error = new RequestResultError();
			error.setCode(code);
			error.setMessage(String.valueOf(map.get("message")));
			return error;
		}
    	return this.request.analyticalRequestResult(map.get("data"));
    }
    
    private ICommonParams commonParams(String param){
    	ICommonParams commonParams = new ICommonParams();
    	commonParams.setVersion(this.client.getVersion());
    	commonParams.setPerformerAppId(ClientOption.getInstance().getAppId());
    	Date date = new Date();
    	int time = (int)(date.getTime()/1000);
    	String timestamp = String.valueOf(time);
    	commonParams.setTimestamp(timestamp);
    	if(param!=null&&!param.equals("")&&param.indexOf("performer_user_id")>=0){
    		commonParams.setPerformerUserId(null);
    	}else{
    		commonParams.setPerformerUserId("");
    	}
    	return commonParams;
    }
	
}
