package org.wmc.dtx.txmsgdemo.bank2.service;

import org.wmc.dtx.txmsgdemo.bank2.model.AccountChangeEvent;

public interface AccountInfoService {

    //更新账户，增加金额
    public void addAccountInfoBalance(AccountChangeEvent accountChangeEvent);
}
