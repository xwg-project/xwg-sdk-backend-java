package com.sdk.entities.params;

public class ICommonParams {
	private String performerAppId;
	private String performerUserId;
	private String version;
	private String timestamp;
	public String getPerformerAppId() {
		return performerAppId;
	}
	public void setPerformerAppId(String performerAppId) {
		this.performerAppId = performerAppId;
	}
	public String getPerformerUserId() {
		return performerUserId;
	}
	public void setPerformerUserId(String performerUserId) {
		this.performerUserId = performerUserId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
