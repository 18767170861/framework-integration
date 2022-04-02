package org.wmc.rocketmq.api.consumer.sync;

import java.util.List;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;

public class Consumer1 {

  public static void main(String[] args) throws Exception {
    /*
     * 标识一类Consumer的集合名称，

     * 这类Consumer通常消费一类消息，且消费逻辑一致。
     * 同一个Consumer Group下的各个实例将共同消费
     * topic的消息，起到负载均衡的作用。

     * 消费进度以Consumer Group为粒度管理，不同
     * Consumer Group之间消费进度彼此不受影响，
     * 即消息A被Consumer Group1消费过，也会再
     * 给Consumer Group2消费。

     * 注： RocketMQ要求同一个Consumer Group的
     * 消费者必须要拥有相同的注册信息，即必须要听一样
     * 的topic(并且tag也一样)。
     */
    DefaultMQPushConsumer c = new DefaultMQPushConsumer("consumer-demo1");
    c.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");

    c.subscribe("Topic1", "TagA");

    c.registerMessageListener(new MessageListenerConcurrently() {
      @Override
      public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list,
          ConsumeConcurrentlyContext ctx) {
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