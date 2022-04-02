package org.wmc.dtx.seatademo.bank1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = {"org.wmc.dtx.seatademo.bank1.spring"})
public class Bank1Server {
	
	public static void main(String[] args) {
		SpringApplication.run(Bank1Server.class, args);

	}

}
