package com.sdk.entities.results;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.sdk.utils.StringUtil;

public class Order implements IResults {
	private String appId;
	private String orderNo;
	private String outOrderNo;
	private String type;
	private String payerId;
	private String payeeId;
	private String subject;
	private String body;
	private String remark;
	private String operatorId;
	private String symbol;
	private String totalAmount;
	private String discountAmount;
	private String feeSymbol;
	private String feeAmount;
	private String payerPaidAmount;
	private String payeeReceivedAmount;
	private String status;
	private Date createdAt;
	private Date paidAt;
	
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
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
	public String getPayerPaidAmount() {
		return payerPaidAmount;
	}
	public void setPayerPaidAmount(String payerPaidAmount) {
		this.payerPaidAmount = payerPaidAmount;
	}
	public String getPayeeReceivedAmount() {
		return payeeReceivedAmount;
	}
	public void setPayeeReceivedAmount(String payeeReceivedAmount) {
		this.payeeReceivedAmount = payeeReceivedAmount;
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
	public Date getPaidAt() {
		return paidAt;
	}
	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//{order_no=471040013539213312, symbol=XWG, payer_paid_amount=0.0, discount_amount=0.0, operator_id=null, subject=xx, payee_received_amount=0.0, created_at=2019-08-21T22:56:12+08:00, out_order_no=T00000001, remark=null, payee_id=1163283543638970082, body=null, type=TRADE, paid_at=null, fee_amount=0.0, fee_symbol=null, total_amount=1.0, payer_id=1163283543638970082, app_id=1561527878813, status=WAIT_PAY}
			if(data==null)
				return;
			Map<String,Object> map = StringUtil.cast(data);
			if(map==null||map.size()<=0)
				return;
			
			this.setAppId(String.valueOf(map.get("app_id")));
			this.setOrderNo(String.valueOf(map.get("order_no")));
			this.setOutOrderNo(String.valueOf(map.get("out_order_no")));
			this.setType(String.valueOf(map.get("type")));
			this.setPayerId(String.valueOf(map.get("payer_id")));
			this.setPayeeId(String.valueOf(map.get("payee_id")));
			this.setSubject(String.valueOf(map.get("subject")));
			this.setBody(String.valueOf(map.get("body")));
			this.setRemark(String.valueOf(map.get("remark")));
			this.setOperatorId(String.valueOf(map.get("operator_id")));
			this.setSymbol(String.valueOf(map.get("symbol")));
			this.setTotalAmount(StringUtil.getPlainString(String.valueOf(map.get("total_amount"))));
			this.setDiscountAmount(StringUtil.getPlainString(String.valueOf(map.get("discount_amount"))));
			this.setFeeAmount(StringUtil.getPlainString(String.valueOf(map.get("fee_amount"))));
			this.setFeeSymbol(String.valueOf(map.get("fee_symbol")));
			this.setPayeeReceivedAmount(StringUtil.getPlainString(String.valueOf(map.get("payee_received_amount"))));
			this.setPayerPaidAmount(StringUtil.getPlainString(String.valueOf(map.get("payer_paid_amount"))));
			this.setStatus(String.valueOf(map.get("status")));
			
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Object createdAtObj = map.get("created_at");
			if(createdAtObj!=null){
				Date created_at=format.parse(String.valueOf(createdAtObj));
				this.setCreatedAt(created_at);
			}
			Object paidAtObj = map.get("paid_at");
			if(paidAtObj!=null){
				Date paid_at=format.parse(String.valueOf(paidAtObj));
				this.setPaidAt(paid_at);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
