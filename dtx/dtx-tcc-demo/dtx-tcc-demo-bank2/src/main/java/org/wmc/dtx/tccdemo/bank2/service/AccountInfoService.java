package org.wmc.dtx.tccdemo.bank2.service;

public interface AccountInfoService {

  //账户扣款
  void updateAccountBalance(String accountNo, Double amount);
}
