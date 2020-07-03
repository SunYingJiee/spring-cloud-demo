package com.sun.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
public class SpringBootHystrixDemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootHystrixDemoApplication.class, args);
		log.info("Hystrix 启动 ----------");
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplat() {
		return new RestTemplate();
	}
}
