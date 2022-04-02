package org.wmc.rocketmq.api.producer.oneway;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.Scanner;

/*
 * 单向消息
 * 消息发出后, 服务器不会返回结果
 */
public class Producer {

  public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException {
    DefaultMQProducer p = new DefaultMQProducer("producer-demo3");
    p.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");
    p.start();

    String topic = "Topic3";
    String tag = "TagA";

    while (true) {
      System.out.print("输入消息,用逗号分隔多条消息: ");
      String[] a = new Scanner(System.in).nextLine().split(",");
      for (String s : a) {
        Message msg = new Message(topic, tag, s.getBytes());
        p.sendOneway(msg);
      }
      System.out.println("--------------------消息已送出-----------------------");
    }
  }
}