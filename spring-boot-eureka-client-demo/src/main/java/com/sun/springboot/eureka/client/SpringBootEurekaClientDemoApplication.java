package com.sun.springboot.eureka.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootEurekaClientDemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication
				.run(SpringBootEurekaClientDemoApplication.class, args);
		log.info("SpringBootEurekaClient启动---------");
	}

}
