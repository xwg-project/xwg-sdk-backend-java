package com.sdk.entities.results;

import java.util.ArrayList;
import java.util.List;

import com.sdk.utils.StringUtil;

public class OrderList implements IResults {
	private List<Order> data;
	public List<Order> getData() {
		return data;
	}
	public void setData(List<Order> data) {
		this.data = data;
	}
	@Override
	public void assignment(Object data) {
		// TODO Auto-generated method stub
		try{
			//[{order_no=471040013539213312, symbol=XWG, payer_paid_amount=0.0, discount_amount=0.0, operator_id=null, subject=xx, payee_received_amount=0.0, created_at=2019-08-21T22:56:12+08:00, out_order_no=T00000001, remark=null, payee_id=1163283543638970082, body=null, type=TRADE, paid_at=null, fee_amount=0.0, fee_symbol=null, total_amount=1.0, payer_id=1163283543638970082, app_id=1561527878813, status=WAIT_PAY}, {order_no=471056367986147328, symbol=XWG, payer_paid_amount=0.0, discount_amount=5.0, operator_id=null, subject=XX, payee_received_amount=0.0, created_at=2019-08-21T23:12:27+08:00, out_order_no=J12345678, remark=null, payee_id=1163283543638970082, body=null, type=TRADE, paid_at=null, fee_amount=1.0, fee_symbol=XWG, total_amount=20.0, payer_id=1163283543638970082, app_id=1561527878813, status=WAIT_PAY}, {order_no=471060755312017408, symbol=XWG, payer_paid_amount=0.0, discount_amount=0.0, operator_id=null, subject=提现, payee_received_amount=0.0, created_at=2019-08-21T23:16:48+08:00, out_order_no=t123456, remark=null, payee_id=1163283543638970082, body=null, type=CASHOUT, paid_at=null, fee_amount=1.0, fee_symbol=XWG, total_amount=5.0, payer_id=1163283543638970082, app_id=1561527878813, status=WAIT_PAY}, {order_no=471076072239136768, symbol=XWG, payer_paid_amount=0.0, discount_amount=0.0, operator_id=null, subject=提现, payee_received_amount=0.0, created_at=2019-08-21T23:32:01+08:00, out_order_no=t1234567, remark=null, payee_id=1163283543638970082, body=null, type=CASHOUT, paid_at=null, fee_amount=1.0, fee_symbol=XWG, total_amount=5.0, payer_id=1163283543638970082, app_id=1561527878813, status=WAIT_PAY}, {order_no=471091812354752512, symbol=XWG, payer_paid_amount=10.0, discount_amount=0.0, operator_id=null, subject=转账, payee_received_amount=10.0, created_at=2019-08-21T23:47:40+08:00, out_order_no=Z123456987, remark=null, payee_id=1164055565700333569, body=null, type=TRANS, paid_at=2019-08-21T23:47:40+08:00, fee_amount=0.0, fee_symbol=null, total_amount=10.0, payer_id=1163283543638970082, app_id=1561527878813, status=SUCCESS}, {order_no=471097338350272512, symbol=XWG, payer_paid_amount=5.0, discount_amount=5.0, operator_id=null, subject=XX, payee_received_amount=5.0, created_at=2019-08-21T23:53:09+08:00, out_order_no=JJA12345678, remark=null, payee_id=1163283543638970082, body=null, type=TRADE, paid_at=null, fee_amount=1.0, fee_symbol=XWG, total_amount=10.0, payer_id=1164055565700333569, app_id=1561527878813, status=SUCCESS}, {order_no=471130430066655232, symbol=XWG, payer_paid_amount=1.0, discount_amount=0.0, operator_id=null, subject=退款 -XX, payee_received_amount=1.0, created_at=2019-08-22T00:26:01+08:00, out_order_no=TK887765, remark=null, payee_id=1164055565700333569, body=null, type=REFUND, paid_at=2019-08-22T00:26:01+08:00, fee_amount=0.0, fee_symbol=null, total_amount=1.0, payer_id=1163283543638970082, app_id=1561527878813, status=SUCCESS}, {order_no=472589115733311488, symbol=XWG, payer_paid_amount=0.0, discount_amount=5.0, operator_id=null, subject=XX, payee_received_amount=0.0, created_at=2019-08-23T00:35:06+08:00, out_order_no=JJA12345678f, remark=null, payee_id=1163283543638970082, body=null, type=TRADE, paid_at=null, fee_amount=1.0, fee_symbol=XWG, total_amount=10.0, payer_id=1164055565700333569, app_id=1561527878813, status=WAIT_PAY}, {order_no=473146896408379392, symbol=XWG, payer_paid_amount=0.0, discount_amount=0.0, operator_id=null, subject=提现, payee_received_amount=0.0, created_at=2019-08-23T09:49:12+08:00, out_order_no=t12345678, remark=null, payee_id=1163283543638970082, body=null, type=CASHOUT, paid_at=null, fee_amount=1.0, fee_symbol=XWG, total_amount=5.0, payer_id=1164055565700333569, app_id=1561527878813, status=WAIT_PAY}, {order_no=473164466180063232, symbol=XWG, payer_paid_amount=0.0, discount_amount=0.0, operator_id=null, subject=提现, payee_received_amount=0.0, created_at=2019-08-23T10:06:39+08:00, out_order_no=t123456788, remark=null, payee_id=1163283543638970082, body=null, type=CASHOUT, paid_at=null, fee_amount=1.0, fee_symbol=XWG, total_amount=5.0, payer_id=1164055565700333569, app_id=1561527878813, status=WAIT_PAY}]
			if(data==null)
				return;
			List<Object> list = StringUtil.cast(data);
			if(list==null)
				return;
			List<Order> abList = new ArrayList<Order>();
			for(int i=0,lengthI=list.size();i<lengthI;i++){
			    Object obj = list.get(i);
			    if(obj==null)
			    	continue;
			    
			    Order o = new Order();
			    o.assignment(obj);
			    
			    abList.add(o);
			}
			this.setData(abList);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
