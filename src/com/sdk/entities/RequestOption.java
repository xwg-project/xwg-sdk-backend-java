package com.sdk.entities;

import java.util.Map;

import com.sdk.entities.results.IResults;
import com.sdk.enums.HttpMethod;

public class RequestOption{
	private HttpMethod method;
	private String endpoint;
//	private boolean sign;
//	private Class entityClass;
	private IResults resultClass;
	private boolean hasCommonParams;
	private String methodPath;
	private boolean hasAppSecretParams; 
	private Map<String,String> headers;
//	private Object entityCollectionable;
//	private Object headers;
//	private Object query;
//	private Object body;
	
	public HttpMethod getMethod() {
		return method;
	}
	public void setMethod(HttpMethod method) {
		this.method = method;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public IResults getResultClass() {
		return resultClass;
	}
	public void setResultClass(IResults resultClass) {
		this.resultClass = resultClass;
	}
	public boolean isHasCommonParams() {
		return hasCommonParams;
	}
	public void setHasCommonParams(boolean hasCommonParams) {
		this.hasCommonParams = hasCommonParams;
	}
	public String getMethodPath() {
		return methodPath;
	}
	public void setMethodPath(String methodPath) {
		this.methodPath = methodPath;
	}
	public Map<String,String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String,String> headers) {
		this.headers = headers;
	}
	public boolean isHasAppSecretParams() {
		return hasAppSecretParams;
	}
	public void setHasAppSecretParams(boolean hasAppSecretParams) {
		this.hasAppSecretParams = hasAppSecretParams;
	}


	
}