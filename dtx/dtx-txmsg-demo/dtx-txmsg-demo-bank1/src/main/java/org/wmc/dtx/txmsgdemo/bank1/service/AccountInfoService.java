package org.wmc.dtx.txmsgdemo.bank1.service;

import org.wmc.dtx.txmsgdemo.bank1.model.AccountChangeEvent;

public interface AccountInfoService {

    //向mq发送转账消息
    void sendUpdateAccountBalance(AccountChangeEvent accountChangeEvent);
    //更新账户，扣减金额
    void doUpdateAccountBalance(AccountChangeEvent accountChangeEvent);

}
