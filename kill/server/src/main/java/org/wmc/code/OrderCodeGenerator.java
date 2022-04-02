package org.wmc.code;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 订单编号生成器
 */
public class OrderCodeGenerator {

  /** 自增序列  **/
  private int i = 0;

  /**
   * 根据当前时间生成订单编号："yyyy-MM-dd-HH-mm-ss-自增序号"
   * @return
   */
  public String getOrderCode(){
    Date date  = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-");
    return simpleDateFormat.format(date)+ ++i;
  }

}
