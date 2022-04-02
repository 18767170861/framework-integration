package org.wmc.pay.service.impl;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import org.wmc.pay.PayApplicationTests;
import org.wmc.pay.service.IPayService;

public class PayServiceImplTest extends PayApplicationTests {

	@Autowired
	private IPayService payService;

	@Autowired
	private AmqpTemplate amqpTemplate;

	@Test
	public void create() {
		//BigDecimal.valueOf(0.01)
		//new BigDecimal("0.01")  千万不要用 new BigDecimal(0.01)
		payService.create("1234567891232567", "wmc-测试订单", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);
	}

	@Test
	public void queueTest() {
		amqpTemplate.convertAndSend("test", "test");
	}
}