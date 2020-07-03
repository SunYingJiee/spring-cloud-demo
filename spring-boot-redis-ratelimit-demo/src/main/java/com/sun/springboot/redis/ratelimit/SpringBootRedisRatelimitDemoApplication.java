package com.sun.springboot.redis.ratelimit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j

@SpringBootApplication
public class SpringBootRedisRatelimitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisRatelimitDemoApplication.class, args);
		log.info("SpringBootRedisRatelimitDemo 启动了---------");
	}

}
