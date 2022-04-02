package org.wmc.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcurrentTest {

  public static void main(String[] args) {
    OrderCodeGenerator codeGenerator = new OrderCodeGenerator();
    // 并发线程数
    int currentCount = 40;
    // 循环屏障
    CyclicBarrier cb = new CyclicBarrier(currentCount);
    // 模拟高并发场景，创建订单号
    List<String> codeList = new ArrayList<>();
    Set<String> codeSet = new HashSet<>();
    for (int i = 0; i < currentCount; i++) {
      Thread thread = new Thread(() -> {
        log.info(Thread.currentThread().getName() + "--我已经准备好了");
        try {
          // 等待所有线程启动准备好，才一起往下执行
          cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
          e.printStackTrace();
        }
        // 创建订单号
        String orderCode = codeGenerator.getOrderCode();
        log.info(Thread.currentThread().getName() + "-->生成订单编号：{}", orderCode);
        codeList.add(orderCode);
        codeSet.add(orderCode);
      });
      thread.start();
    }
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(cb.getNumberWaiting());
    System.out.println(cb.getParties());
    System.out.println(cb.isBroken());
    log.info(Thread.currentThread().getName() + "-->生成订单编号列表数量：{}", codeList.size());
    log.info(Thread.currentThread().getName() + "-->生成订单编号集合数量：{}", codeSet.size());
  }
}
