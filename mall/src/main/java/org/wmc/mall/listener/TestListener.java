package org.wmc.mall.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
@Slf4j
public class TestListener {

	@RabbitHandler
	public void process(String msg) {
		log.info("【接收到消息】=> {}", msg);
	}
}
