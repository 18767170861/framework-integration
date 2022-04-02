package org.wmc.hmily.config;

import org.dromara.hmily.spring.HmilyApplicationContextAware;
import org.dromara.hmily.spring.aop.SpringHmilyTransactionAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfiguration {

    @Bean
    public HmilyApplicationContextAware hmilyApplicationContextAware() {
        return new HmilyApplicationContextAware();
    }

    @Bean
    public SpringHmilyTransactionAspect springHmilyTransactionAspect() {
        return new SpringHmilyTransactionAspect();
    }
}
