package org.wmc.rocketmq.api.producer.order;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.List;
import java.util.Scanner;

/*
 * 以下消息, 相同id的消息按顺序发送到同一个队列,
 * 消费时也从同一个队列按顺序消费
 * topic

 * ======================= queue1
 * ======================= queue2
 * 111,消息1 111,消息2 111,消息3 ------->======================= queue3
 * ======================= queue4
 * 222,消息1 222,消息2 222,消息3 ------->======================= queue5
 * ======================= queue6
 * 333,消息1 333,消息2 333,消息3 ------->======================= queue7
 * ======================= queue8
 * ......
 */
public class Producer {

  static String[] msgs = {
      "15103111039,创建",
      "15103111065,创建",
      "15103111039,付款",
      "15103117235,创建",
      "15103111065,付款",
      "15103117235,付款",
      "15103111065,完成",
      "15103111039,推送",
      "15103117235,完成",
      "15103111039,完成"
  };

  public static void main(String[] args)
      throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
    DefaultMQProducer p = new DefaultMQProducer("producer-demo4");
    p.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");
    p.start();

    String topic = "Topic4";
    String tag = "TagA";

    for (String s : msgs) {
      System.out.println("按回车发送此消息: " + s);
      new Scanner(System.in).nextLine();

      Message msg = new Message(topic, tag, s.getBytes());

      String[] a = s.split(",");
      long orderId = Long.parseLong(a[0]);

      /*
       * MessageQueueSelector用来选择发送的队列,
       * 这里用订单的id对队列数量取余来计算队列索引

       * send(msg, queueSelector, obj)
       * 第三个参数会传递到queueSelector, 作为它的第三个参数
       */
      SendResult r = p.send(msg, new MessageQueueSelector() {
        /*
         * 三个参数的含义:
         * queueList: 当前Topic中所有队列的列表
         * message: 消息
         * o: send()方法传入的orderId
         */
        @Override
        public MessageQueue select(List<MessageQueue> queueList, Message message, Object o) {
          Long orderId = (Long) o;
          //订单id对队列数量取余, 相同订单id得到相同的队列索引
          long index = orderId % queueList.size();
          System.out.println("消息已发送到: " + queueList.get((int) index));
          return queueList.get((int) index);
        }
      }, orderId);

      System.out.println(r + "\n\n");
    }
  }
}
