package org.wmc.dtx.seatademo.bank1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wmc.dtx.seatademo.bank1.service.AccountInfoService;

@RestController
public class Bank1Controller {

    @Autowired
    AccountInfoService accountInfoService;

    //张三转账
    @GetMapping("/transfer")
    public String transfer(Double amount){
        accountInfoService.updateAccountBalance("1",amount);
        return "bank1"+amount;
    }
}
