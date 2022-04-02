package org.wmc.rocketmq.api.producer.filter;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.Random;
import java.util.Scanner;

/*
 * 发送的消息中包含 tag 和 userProperty

 * 消费者接收时，可以选择用 tag 或 userProperty 进行过滤
 */
public class Producer {

  public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
    DefaultMQProducer p = new DefaultMQProducer("producer-demo7");
    p.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");
    p.start();

    String topic = "Topic7";

    while (true) {
      System.out.print("输入消息,用逗号分隔多条消息: ");
      String[] a = new Scanner(System.in).nextLine().split(",");
      System.out.print("输入Tag: ");
      String tag = new Scanner(System.in).nextLine();

      for (String s : a) {
        Message msg = new Message(topic, tag, s.getBytes());
        msg.putUserProperty("rnd", "" + new Random().nextInt(4));
        p.send(msg);
      }

    }
  }
}