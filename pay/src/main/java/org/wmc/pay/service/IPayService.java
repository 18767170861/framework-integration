package org.wmc.pay.service;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;
import org.wmc.pay.pojo.PayInfo;

public interface IPayService {

	/**
	 * 创建/发起支付
	 */
	PayResponse create(String orderId, String orderName, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);

	/**
	 * 异步通知处理
	 * @param notifyData
	 */
	String asyncNotify(String notifyData);

	/**
	 * 查询支付记录(通过订单号)
	 * @param orderId
	 * @return
	 */
	PayInfo queryByOrderId(String orderId);
}
