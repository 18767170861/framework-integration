package org.wmc.mall.listener;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.wmc.mall.pojo.PayInfo;
import org.wmc.mall.service.IOrderService;

/**
 * 关于PayInfo，正确姿势：pay项目提供client.jar, mall项目引入jar包
 * 《SpringCloud微服务实战》
 */
@Component
@RabbitListener(queues = "payNotify")
@Slf4j
public class PayMsgListener {

	@Autowired
	private IOrderService orderService;

	@RabbitHandler
	public void process(String msg) {
		log.info("【接收到消息】=> {}", msg);

		PayInfo payInfo = new Gson().fromJson(msg, PayInfo.class);
		if (payInfo.getPlatformStatus().equals("SUCCESS")) {
			//修改订单里的状态
			orderService.paid(payInfo.getOrderNo());
		}
	}
}
