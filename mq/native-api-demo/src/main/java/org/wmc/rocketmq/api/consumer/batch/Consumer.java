package org.wmc.rocketmq.api.consumer.batch;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class Consumer {

  public static void main(String[] args) throws MQClientException {
    DefaultMQPushConsumer c = new DefaultMQPushConsumer("consumer-demo6");
    c.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");
    c.subscribe("Topic6", "*");

    c.registerMessageListener(new MessageListenerConcurrently() {
      @Override
      public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list,
          ConsumeConcurrentlyContext consumeConcurrentlyContext) {
        for (MessageExt msg : list) {
          System.out.println("收到: " + new String(msg.getBody()));
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
      }
    });

    c.start();
    System.out.println("开始消费数据");
  }
}
