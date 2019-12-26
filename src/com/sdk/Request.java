package com.sdk;

import com.sdk.entities.RequestOption;
import com.sdk.entities.results.IResults;

public abstract class Request implements IRequest {
	public RequestOption option;
//    public Object rules;
    public Object params;
    public Request(){
		this.initRequestOption();
	}    
    
    @Override
	public Object analyticalRequestResult(Object data) {
		// TODO Auto-generated method stub
    	IResults result = this.option.getResultClass();
    	result.assignment(data);
		return result;
	}
}

interface IRequest {
	public void initRequestOption();	//初始化请求选项
	public Object analyticalRequestResult(Object data);	//解析请求数据
}
 
class IParams{
}