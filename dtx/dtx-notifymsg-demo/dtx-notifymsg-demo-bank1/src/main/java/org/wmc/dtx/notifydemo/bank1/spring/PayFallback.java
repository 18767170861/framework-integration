package org.wmc.dtx.notifydemo.bank1.spring;

import org.springframework.stereotype.Component;
import org.wmc.dtx.notifydemo.bank1.entity.AccountPay;

@Component
public class PayFallback implements PayClient {
    @Override
    public AccountPay payresult(String txNo) {
        AccountPay accountPay = new AccountPay();
        accountPay.setResult("fail");
        return accountPay;
    }
}
