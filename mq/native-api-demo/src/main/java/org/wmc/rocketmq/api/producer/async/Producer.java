package org.wmc.rocketmq.api.producer.async;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.Scanner;

/*
 * 异步发送消息
 * 使用监听器, 以异步的方式接收服务器的反馈
 */
public class Producer {

  public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException {
    DefaultMQProducer p = new DefaultMQProducer("producer-demo2");
    p.setNamesrvAddr("127.0.0.1:9876;192.168.64.152:9876");
    p.start();

    p.setRetryTimesWhenSendAsyncFailed(0);

    String topic = "Topic2";
    String tag = "TagA";
    String key = "Key-demo2";

    while (true) {
      System.out.print("输入消息,用逗号分隔多条消息: ");
      String[] a = new Scanner(System.in).nextLine().split(",");

      for (String s : a) {
        Message msg = new Message(topic, tag, key, s.getBytes());

        p.send(msg, new SendCallback() {
          @Override
          public void onSuccess(SendResult sendResult) {
            System.out.println("\n\n消息发送成功 : " + sendResult);
          }

          @Override
          public void onException(Throwable throwable) {
            System.out.println("\n\n消息发送失败");
          }
        });

        System.out.println("--------------------消息已送出-----------------------");
      }
    }
  }
}
