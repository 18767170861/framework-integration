package org.wmc.rocketmq.api.producer.batch;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 批量发送消息能显著提高传递小消息的性能。限制是：
 * - 这些批量消息应该有相同的topic，
 * - 相同的waitStoreMsgOK，
 * - 而且不能是延时消息。
 * - 这一批消息的总大小不应超过4MB。

 * 如果超出4M需要进行数据分割, 请参考官方代码样例https://github.com/apache/rocketmq/blob/master/docs/cn/RocketMQ_Example.md
 */
public class Producer {

  public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
    DefaultMQProducer p = new DefaultMQProducer("producer-demo6");
    p.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");
    p.start();

    String topic = "Topic6";

    while (true) {
      System.out.print("输入消息,用逗号分隔多条消息: ");
      String[] a = new Scanner(System.in).nextLine().split(",");

      ArrayList<Message> messages = new ArrayList<>();
      for (String s : a) {
        messages.add(new Message(topic, s.getBytes()));
      }

      p.send(messages);
      System.out.println("批量消息已发送");
    }
  }
}