package com.sdk.entities.params;

public class ITransferCollectibleItemParams {
    private String outOperationNo;
    private String itemUuid;
    private String receiverId;
    private String notifyUrl;
    private String operatorId;
	public String getOutOperationNo() {
		return outOperationNo;
	}
	public void setOutOperationNo(String outOperationNo) {
		this.outOperationNo = outOperationNo;
	}
	public String getItemUuid() {
		return itemUuid;
	}
	public void setItemUuid(String itemUuid) {
		this.itemUuid = itemUuid;
	}
	public String getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
}
