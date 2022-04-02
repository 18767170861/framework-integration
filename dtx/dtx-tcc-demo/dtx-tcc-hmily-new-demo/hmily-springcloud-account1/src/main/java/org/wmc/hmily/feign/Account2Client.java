package org.wmc.hmily.feign;

import org.dromara.hmily.annotation.Hmily;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "account2-server", fallback = Account2ClientFallback.class)
public interface Account2Client {

  //远程调用李四的微服务
  @GetMapping("/account/transfer")
  @Hmily
  Boolean transfer(@RequestParam("amount") Double amount);
}
