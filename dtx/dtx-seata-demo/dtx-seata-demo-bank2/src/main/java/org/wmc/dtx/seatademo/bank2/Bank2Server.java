package org.wmc.dtx.seatademo.bank2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = {"org.wmc.dtx.seatademo.bank2.spring"})
public class Bank2Server {
	
	public static void main(String[] args) {
		SpringApplication.run(Bank2Server.class, args);
	}

}
