package com.sun.springboot.zuul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@Slf4j
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootZuulDemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootZuulDemoApplication.class, args);
		log.info("SpringBootZuulDemo 启动了-------------");
	}

}
