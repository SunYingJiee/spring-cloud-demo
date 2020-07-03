package com.sun.springboot.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServerDemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication
				.run(SpringBootEurekaServerDemoApplication.class, args);
		System.out.println("【【【【【【 Eureka微服务 】】】】】】已启动.");
	}

}
