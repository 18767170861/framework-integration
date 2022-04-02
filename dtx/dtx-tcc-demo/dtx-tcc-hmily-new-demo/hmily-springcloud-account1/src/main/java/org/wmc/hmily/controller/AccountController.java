package org.wmc.hmily.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.wmc.hmily.dao.AccountMapper;
import org.wmc.hmily.entity.AccountInfo;
import org.wmc.hmily.service.AccountInfoService;

/**
 * @ClassName AccountController
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    AccountInfoService accountInfoService;

    @GetMapping("/test")
    public List<AccountInfo> test() {
        return accountMapper.selectAll();
    }

    @RequestMapping("/transfer")
    public Boolean transfer(@RequestParam("amount") Double amount) {
        this.accountInfoService.updateAccountBalance("1", amount);
        return true;
    }
}
