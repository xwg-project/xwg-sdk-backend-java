package com.sdk.entities.results;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.sdk.utils.StringUtil;

public class OrderReceipt implements IResults{
	private String appId;
    private String orderNo;
    private String outOrderNo;
    private String type;
    private String payerId;
    private String payeeId;
    private String symbol;
    private String payableAmount;
    private String feeSymbol;
    private String feeAmount;
    private String status;
    private Date createdAt;
    
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOutOrderNo() {
		return outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPayerId() {
		return payerId;
	}
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	public String getPayeeId() {
		return payeeId;
	}
	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getPayableAmount() {
		return payableAmount;
	}
	public void setPayableAmount(String payableAmount) {
		this.payableAmount = payableAmount;
	}
	public String getFeeSymbol() {
		return feeSymbol;
	}
	public void setFeeSymbol(String feeSymbol) {
		this.feeSymbol = feeSymbol;
	}
	public String getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
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
			this.setOrderNo(String.valueOf(map.get("order_no")));
			this.setSymbol(String.valueOf(map.get("symbol")));
			this.setFeeAmount(StringUtil.getPlainString(String.valueOf(map.get("fee_amount"))));
			this.setFeeSymbol(String.valueOf(map.get("fee_symbol")));
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Object createdAtObj = map.get("created_at");
			if(createdAtObj!=null){
				Date created_at=format.parse(String.valueOf(createdAtObj));
				this.setCreatedAt(created_at);
			}
			this.setOutOrderNo(String.valueOf(map.get("out_order_no")));
			this.setPayerId(String.valueOf(map.get("payer_id")));
			this.setPayeeId(String.valueOf(map.get("payee_id")));
			this.setPayableAmount(StringUtil.getPlainString(String.valueOf(map.get("payable_amount"))));
			this.setType(String.valueOf(map.get("type")));
			this.setAppId(String.valueOf(map.get("app_id")));
			this.setStatus(String.valueOf(map.get("status")));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
