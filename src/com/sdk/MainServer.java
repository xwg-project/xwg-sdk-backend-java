package com.sdk;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.sdk.requests.CreateTradeOrder;
import com.sdk.requests.GetCollectible;
import com.sdk.requests.GetCollectibleItem;
import com.sdk.requests.GetLoginAuthCode;
import com.sdk.requests.GetOrder;
import com.sdk.requests.ListAccounts;
import com.sdk.requests.ListCollectibleCategories;
import com.sdk.requests.ListCollectibleItems;
import com.sdk.requests.ListCollectibles;
import com.sdk.requests.ListOrders;
import com.sdk.requests.ListOwnedCollectibleItems;
import com.sdk.requests.ListTokenExchangeRates;
import com.sdk.requests.ListTokens;
import com.sdk.requests.RefundTradeOrder;
import com.sdk.requests.RequestCollectibleItemTrusteeship;
import com.sdk.requests.ReturnCollectibleItemTrusteeship;
import com.sdk.requests.TransferCollectibleItem;
import com.sdk.requests.TransferTransOrder;

public class MainServer {
	
	public static void main(String[] args) {
		Map<String, Object> initMap = new HashMap<String, Object>();
		initMap.put("host", "http://192.168.1.121:8888");
		//WB
//		initMap.put("appId", "1564023364057");
//		initMap.put("appSecret", "093f846b6c564d659f45d8c88607bf9e");
		//XWG
		initMap.put("appId", "1561527878813");
		initMap.put("appSecret", "e31ac1bb84934aaa9e46d5daf08301d9");
		ClientOption.getInstance().init(initMap);
//		
		Client client = new Client();
		Map<String, Object> param = new HashMap<String, Object>();
		
//		获得登录授权码
//		param.put("username", "15201896968");		//	*用户账户名
//		Object obj = client.request(new GetLoginAuthCode(param));
//		System.out.print(obj);
		
//		merchant.order.trade.create
//		商户创建交易订单
//		param.put("payerId", "1165894364849938433");			//	*付款用户 ID
//		param.put("outOrderNo", MainServer.getOredrNoByTime());	//	*商户订单号	
//		param.put("symbol", "XWG");								//	*通证符号
//		BigDecimal bd = new BigDecimal(100000000);
//		param.put("totalAmount", bd+"");						//	*提现金额
//		param.put("discountAmount", "0");						//	优惠金额
//		param.put("returnUrl", "http://www.baidu.com");			//	支付完成后跳转 URL
//		param.put("notifyUrl", "http://www.baidu.com");			//	*回调 URL，保障商户在网络异常下能够获取支付结果	
//		param.put("subject", "xx");								//	*交易主题
//		param.put("body", "XX");								//	交易详细描述
//		param.put("operatorId", "0");							//	商户操作员 ID
//		param.put("feeSymbol", "XWG");							//	手续费通证符号
//		param.put("feeAmount", "0");							//	手续费金额
//		Object obj = client.request(new CreateTradeOrder(param));
		
//		collectible.info.query
//		获取指定藏品信息
		param.put("collectibleId", "1");		//	*藏品 ID
		Object obj = client.request(new GetCollectible(param));
		
//		collectible.item.info.query
//		获取指定藏品道具信息
//		param.put("collectibleItemId", "105");	//	*藏品道具 ID
//		Object obj = client.request(new GetCollectibleItem(param));
		
//		person.token.list.query
//		获取用户通证列表
//		param.put("symbols", "XWG");//param.put("symbols", "");		//	*通证符号，多值以逗号分隔，不指定则返回全部
//		param.put("performerUserId", "1170939526797991938");		//	*[网关注入] 当前登录用户 ID
//		param.put("token", "e4a274b4-3ad3-4327-a49d-e6eea855f2c2");	//	*[网关注入] 请求用户token
//		Object obj = client.request(new ListAccounts(param));
		
//		collectible.item.category.list.query
//		获取藏品道具分类列表
//		param.put("pageNum", 1);			//	*页数
//		param.put("pageSize", 10);			//	*每页结果数
//		param.put("collectibleIds", "1");	//	*藏品ID，多值以逗号分隔，不指定则返回全部
//		Object obj = client.request(new ListCollectibleCategories(param));
		
//		collectible.item.list.query
//		获取指定藏品下的道具列表
//		param.put("pageNum", 1);			//	*页数
//		param.put("pageSize", 100);			//	*每页结果数
//		param.put("collectibleIds", "1");	//	*藏品ID，多值以逗号分隔，不指定则返回全部
//		Object obj = client.request(new ListCollectibleItems(param));
		
		//————新增pageNum pageSize
//		collectible.list.query
//		获取藏品列表
//		param.put("pageNum", 1);		//	*页数
//		param.put("pageSize", 10);		//	*每页结果数
//		Object obj = client.request(new ListCollectibles(param));

//		merchant.order.list.query
//		获取订单列表
//		param.put("pageNum", 1);		//	*页数
//		param.put("pageSize", 10);		//	*每页结果数
//		Object obj = client.request(new ListOrders(param));
		
//		token.exchange_rate.query
//		获取通证汇率
//		param.put("pairs", "");	//	*货币对，多值用逗号分隔，留空返回全部 XWG/BTC
//		Object obj = client.request(new ListTokenExchangeRates(param));
		
//		token.list.query
//		获取通证列表
//		Object obj = client.request(new ListTokens(param));
		
//		merchant.order.trans.transfer
//		商户实时转账
//		param.put("payeeId", "1170939526797991938");		//	*收款用户 ID
//		param.put("outOrderNo", "OS12231746028394");	//	*商户订单号
//		param.put("symbol", "XWG");		//	*通证符号
//		BigDecimal bd = new BigDecimal(100000000);
//		param.put("totalAmount", bd+"");	//	*转账金额
//		param.put("notifyUrl", "http://www.baidu.com");		//	*回调 URL，保障商户在网络异常下能够获取支付结果
//		param.put("remark", "测试");		//	备注
//		param.put("operatorId", "");	//	商户操作员 ID
//		Object obj = client.request(new TransferTransOrder(param));
		
//		merchant.order.trade.refund
//		商户实时退款
//		param.put("originalOrderNo", "651513957953044480");	//	*原始平台订单号
//		param.put("outOrderNo", "TR12231746028395");		//	*商户退款订单号
//		BigDecimal bd = new BigDecimal(100000000);
//		param.put("totalAmount", bd+"");		//	*退款金额，不能大于原始订单实收金额
//		param.put("notifyUrl", "http://www.baidu.com");			//	*回调 URL，保障商户在网络异常下能够获取支付结果
//		param.put("operatorId", "");		//	商户操作员 ID
//		Object obj = client.request(new RefundTradeOrder(param));
		
		
		//!!!使用outOrderNo传值会报200005参数错误  outOrderNo 和 orderNo 你爱传哪个传哪个 out是商户的，没out的是平台的  
		//————新增outOrderNo
//		merchant.order.info.query
//		获取指定订单
//		param.put("outOrderNo", "");//CS12231151159740	//	*商户订单号
//		param.put("orderNo", "650115479708368896");//650115479708368896	//	*平台订单号
//		Object obj = client.request(new GetOrder(param));
		
		//!!!200001 资源不存在 collectibleIds不知道传啥
//		merchant.collectible.item.query
//		获取商户藏品道具列表
//		param.put("pageNum", 1);			//	*页数
//		param.put("pageSize", 10);			//	*每页结果数
//		param.put("collectibleIds", "");	//	*藏品ID，多值以逗号分隔，不指定则返回全部
//		Object obj = client.request(new ListOwnedCollectibleItems(param));
		
		//!!!可以无限托管 WAIT_CONFIRM
		//————新增operatorId
//		merchant.collectible.item.operation.trusteeship.request
//		商户创建用户道具托管请求
//		param.put("outOperationNo", "CS12231746028398");//MainServer.getOredrNoByTime());	//	*商户操作流水号
//		param.put("itemUuid", "e2470a64-8776-4795-8f5f-326a19438c97");			//	*道具唯一标识
//		param.put("notifyUrl", "http://www.baidu.com");			//	*回调 URL，保障商户在网络异常下能够获取结果
//		param.put("returnUrl", "http://www.baidu.com");			//	用户批准后跳转 URL
//		param.put("operatorId", "");		//	商户操作员 ID
//		Object obj = client.request(new RequestCollectibleItemTrusteeship(param));
		
		//!!!200005 参数无效
		//————新增operatorId
//		merchant.collectible.item.operation.trusteeship.return
//		商户请求实时返还托管用户道具
//		param.put("originalOperationNo", "651454562967748608");	//	*原始平台操作流水号
//		param.put("outOperationNo", "CS12231746028398");		//	*商户操作流水号
//		param.put("notifyUrl", "http://www.baidu.com");			//	*回调 URL，保障商户在网络异常下能够获取结果
//		param.put("operatorId", "");			//	商户操作员 ID	
//		Object obj = client.request(new ReturnCollectibleItemTrusteeship(param));
		
		//!!!待测试139 1190171169219022850  300003 藏品道具不存在
		//————新增operatorId
//		merchant.collectible.item.operation.trans.transfer
//		商户将所持道具所有权实时转移给指定用户
//		param.put("outOperationNo","TS12231746028392");		//	*商户操作流水号
//		param.put("itemUuid", "e2470a64-8776-4795-8f5f-326a19438c97");				//	*道具唯一标识
//		param.put("receiverId", "1165894364849938433");			//	*接收人用户 ID
//		param.put("notifyUrl", "http://www.baidu.com");				//	*回调 URL，保障商户在网络异常下能够获取结果
//		param.put("operatorId", "");			//	商户操作员 ID
//		Object obj = client.request(new TransferCollectibleItem(param));
		
//		System.out.print(obj);
    }
	
	//根据时间随机数生成唯一订单编号
	public static String getOredrNoByTime() {
		SimpleDateFormat sdf=new SimpleDateFormat("MMddHHmmss");
		String newDate=sdf.format(new Date());
		String result="";
		Random random=new Random();
		for(int i=0;i<4;i++){
			result+=random.nextInt(10);
		}
		return "CS"+newDate+result;
	}
}
