package org.wmc.hmily.feign;

public class Account2ClientFallback implements Account2Client {

    @Override
    public Boolean transfer(Double amount) {
        return false;
    }
}
