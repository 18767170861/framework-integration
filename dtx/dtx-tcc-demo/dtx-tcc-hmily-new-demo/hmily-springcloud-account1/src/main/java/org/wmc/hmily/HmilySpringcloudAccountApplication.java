package org.wmc.hmily;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@EnableHystrix
@EnableFeignClients
@MapperScan("org.wmc.hmily.dao")
public class HmilySpringcloudAccountApplication {

  public static void main(String[] args) {
    SpringApplication.run(HmilySpringcloudAccountApplication.class, args);
  }

}
