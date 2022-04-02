package org.wmc.rocketmq.api.consumer.transaction;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/*
 * 如果返回 RECONSUME_LATER, 服务器会等待一会再重试发送消息
 * 消息属性默认设置 DELAY=6, 等待时间为 2 分钟,
 * org/apache/rocketmq/store/config/MessageStoreConfig.java
 * this.messageDelayLevel = "1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h";
 */
public class Consumer {

  public static void main(String[] args) throws Exception {
    DefaultMQPushConsumer c = new DefaultMQPushConsumer("consumer-demo8");
    c.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");

    c.subscribe("Topic8", "*");

    c.registerMessageListener(new MessageListenerConcurrently() {
      @Override
      public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list,
          ConsumeConcurrentlyContext ctx) {
        String transactionId = null;
        for (MessageExt msg : list) {
          System.out.println(new String(msg.getBody()) + " - " + msg);
          transactionId = msg.getTransactionId();
        }
        if (Math.random() < 0.5) {
          System.out.println("消息处理完成");
          return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        } else {
          System.out.println("消息处理失败, 要求服务器稍后重试发送消息" + transactionId);
          return ConsumeConcurrentlyStatus.RECONSUME_LATER;
        }
      }
    });

    c.start();
    System.out.println("开始消费数据");
  }
}
