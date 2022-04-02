package org.wmc.rocketmq.api.consumer.filter;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.MessageSelector;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;
import java.util.Scanner;

/*
 * 如果使用sql过滤,需要在 broker.properties 中添加配置来启用 sql 过滤：

 * enablePropertyFilter=true
 */
public class Consumer {

  public static void main(String[] args) throws MQClientException {
    System.out.print("使用Tag过滤还是使用Sql过滤(tag/sql): ");
    String ts = new Scanner(System.in).nextLine();

    DefaultMQPushConsumer c = new DefaultMQPushConsumer("consumer-demo7");
    c.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");
    if (ts.equalsIgnoreCase("tag")) {
      System.out.println("使用Tag过滤: TagA || TagB || TagC");
      c.subscribe("Topic7", "TagA || TagB || TagC");
    } else {
      System.out.println("使用Sql过滤: rnd=1 or rnd > 2");
      c.subscribe("Topic7", MessageSelector.bySql("rnd=1 or rnd > 2"));
    }

    c.registerMessageListener(new MessageListenerConcurrently() {
      @Override
      public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list,
          ConsumeConcurrentlyContext consumeConcurrentlyContext) {
        for (MessageExt msg : list) {
          System.out.println(new String(msg.getBody()) + " - " + msg.getUserProperty("rnd"));
        }

        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
      }
    });

    c.start();
    System.out.println("开始消费数据");
  }
}