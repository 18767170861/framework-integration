package org.wmc.dtx.tccdemo.bank1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wmc.dtx.tccdemo.bank1.service.AccountInfoService;

@RestController
public class Bank1Controller {

  @Autowired
  AccountInfoService accountInfoService;

  @RequestMapping("/transfer")
  public Boolean transfer(@RequestParam("amount") Double amount) {
    this.accountInfoService.updateAccountBalance("1", amount);
    return true;
  }

}
