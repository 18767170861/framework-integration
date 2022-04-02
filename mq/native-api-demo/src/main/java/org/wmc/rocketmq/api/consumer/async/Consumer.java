package org.wmc.rocketmq.api.consumer.async;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/*
 * 与 demo1.Consumer 完全相同
 */
public class Consumer {

  public static void main(String[] args) throws MQClientException {
    DefaultMQPushConsumer c = new DefaultMQPushConsumer("consumer-demo2");
    c.setNamesrvAddr("127.0.0.1:9876;192.168.64.152:9876");

    c.subscribe("Topic2", "TagA");

    c.registerMessageListener(new MessageListenerConcurrently() {
      @Override
      public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list,
          ConsumeConcurrentlyContext consumeConcurrentlyContext) {
        for (MessageExt msg : list) {
          System.out.println(new String(msg.getBody()) + " - " + msg);
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
      }
    });
    c.start();
    System.out.println("开始消费数据");
  }
}
