package org.wmc.rocketmq.api.consumer.order;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

public class Consumer {

  public static void main(String[] args) throws MQClientException {
    DefaultMQPushConsumer c = new DefaultMQPushConsumer("consumer-demo4");
    c.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");
    c.subscribe("Topic4", "*");

    c.registerMessageListener(new MessageListenerOrderly() {
      @Override
      public ConsumeOrderlyStatus consumeMessage(List<MessageExt> list,
          ConsumeOrderlyContext consumeOrderlyContext) {
        String t = Thread.currentThread().getName();

        for (MessageExt msg : list) {
          System.out.println(t + " - " + msg.getQueueId() + " - " + new String(msg.getBody()));
        }

        return ConsumeOrderlyStatus.SUCCESS;
      }
    });

    c.start();
    System.out.println("开始消费数据");
  }
}