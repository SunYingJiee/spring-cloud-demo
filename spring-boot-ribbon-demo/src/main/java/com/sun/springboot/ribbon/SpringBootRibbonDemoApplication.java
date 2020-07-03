package com.sun.springboot.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootRibbonDemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootRibbonDemoApplication.class, args);
		log.info("SpringBootRibbonDemo 启动-------");
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public IRule ribbonRule() {
		return new RandomRule();
	}
}
