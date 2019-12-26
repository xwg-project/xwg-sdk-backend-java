package com.sdk.entities.results;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.sdk.utils.StringUtil;

public class OperationReceipt implements IResults {
	private String itemUuid;
	private String appId;
	private String operationNo;
	private String outOperationNo;
	private String type;
	private String senderId;
	private String receiverId;
	private String status;
	private Date createdAt;
	
	public String getItemUuid() {
		return itemUuid;
	}
	public void setItemUuid(String itemUuid) {
		this.itemUuid = itemUuid;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getOperationNo() {
		return operationNo;
	}
	public void setOperationNo(String operationNo) {
		this.operationNo = operationNo;
	}
	public String getOutOperationNo() {
		return outOperationNo;
	}
	public void setOutOperationNo(String outOperationNo) {
		this.outOperationNo = outOperationNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			if(data==null)
				return;
			Map<String,Object> map = StringUtil.cast(data);
			if(map==null||map.size()<=0)
				return;
			this.setItemUuid(String.valueOf(map.get("item_uuid")));
			this.setAppId(String.valueOf(map.get("app_id")));
			this.setOperationNo(String.valueOf(map.get("operation_no")));
			this.setOutOperationNo(String.valueOf(map.get("out_operation_no")));
			this.setType(String.valueOf(map.get("type")));
			this.setSenderId(String.valueOf(map.get("sender_id")));
			this.setReceiverId(String.valueOf(map.get("receiver_id")));
			this.setStatus(String.valueOf(map.get("status")));
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Object createdAtObj = map.get("created_at");
			if(createdAtObj!=null){
				Date created_at=format.parse(String.valueOf(createdAtObj));
				this.setCreatedAt(created_at);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
