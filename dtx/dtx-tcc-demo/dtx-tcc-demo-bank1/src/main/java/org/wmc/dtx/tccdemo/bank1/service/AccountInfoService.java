package org.wmc.dtx.tccdemo.bank1.service;

public interface AccountInfoService {

    //账户扣款
    void updateAccountBalance(String accountNo, Double amount);
}
