package org.wmc.rocketmq.api.producer.delay;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.Scanner;

/*
 * 延时消息

 * 延时消息的使用场景
 * 比如电商里，提交了一个订单就可以发送一个延时消息，1h后去检查这个订单的状态，如果还是未付款就取消订单释放库存。
 */
public class Producer {

  public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
    DefaultMQProducer p = new DefaultMQProducer("producer-demo5");
    p.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");
    p.start();

    while (true) {
      System.out.print("输入消息,用逗号分隔多条消息: ");
      String[] a = new Scanner(System.in).nextLine().split(",");

      for (String s : a) {
        Message msg = new Message("Topic5", s.getBytes());

        /*
         * 设置消息的延迟时间,这里不支持任意的时间,只支持18个固定的延迟时长,
         * 分别用Leven 1到18 来表示:

         * org/apache/rocketmq/store/config/MessageStoreConfig.java
         * this.messageDelayLevel = "1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h";
         */
        msg.setDelayTimeLevel(3);

        p.send(msg);
      }
    }
  }
}
