package org.wmc.rocketmq.api.producer.transaction;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.client.producer.TransactionSendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

public class Producer {

  public static void main(String[] args) throws MQClientException {
    TransactionMQProducer p = new TransactionMQProducer("producer-demo8");
    p.setNamesrvAddr("127.0.0.1:9876;127.0.0.1:9876");

    p.setExecutorService(Executors.newFixedThreadPool(5));

    p.setTransactionListener(new TransactionListener() {

      ConcurrentHashMap<String, LocalTransactionState> localTx = new ConcurrentHashMap<>();

      /*
       * 在这里执行本地事务
       */
      @Override
      public LocalTransactionState executeLocalTransaction(Message message, Object o) {
        System.out.println("执行本地事务");
        if (Math.random() < 0.333) {
          System.out.println("本地事务执行成功, 按回车提交事务消息");
          new Scanner(System.in).nextLine();

          localTx.put(message.getTransactionId(), LocalTransactionState.COMMIT_MESSAGE);
          return LocalTransactionState.COMMIT_MESSAGE;
        } else if (Math.random() < 0.666) {
          System.out.println("本地事务执行失败, 按回车回滚事务消息");
          new Scanner(System.in).nextLine();

          localTx.put(message.getTransactionId(), LocalTransactionState.ROLLBACK_MESSAGE);
          return LocalTransactionState.ROLLBACK_MESSAGE;
        } else {
          System.out.println("本地事务执行情况未知, 按回车继续");
          new Scanner(System.in).nextLine();

          localTx.put(message.getTransactionId(), LocalTransactionState.UNKNOW);
          return LocalTransactionState.UNKNOW;
        }
      }

      /*
       * 回查方法
       * 检测频率默认1分钟，可通过在broker.conf文件中设置transactionCheckInterval的值来改变默认值，单位为毫秒。
       */
      @Override
      public LocalTransactionState checkLocalTransaction(MessageExt messageExt) {
        System.out.println("服务器正在回查消息状态：" + messageExt.getTransactionId());

        LocalTransactionState s = localTx.get(messageExt.getTransactionId());
        if (s == null || s == LocalTransactionState.UNKNOW) {
          s = LocalTransactionState.ROLLBACK_MESSAGE;
        }
        return s;
      }
    });

    p.start();

    String topic = "Topic8";

    while (true) {
      System.out.print("输入消息,用逗号分隔多条消息: ");
      String[] a = new Scanner(System.in).nextLine().split(",");

      for (String s : a) {
        Message msg = new Message(topic, s.getBytes());
        System.out.println("---------发送半消息-----------");
        TransactionSendResult r = p.sendMessageInTransaction(msg, null);
        System.out.println("事务消息发送结果: " + r.getLocalTransactionState().name());
      }
    }
  }
}