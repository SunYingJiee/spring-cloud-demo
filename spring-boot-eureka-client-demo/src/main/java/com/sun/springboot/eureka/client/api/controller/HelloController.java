package com.sun.springboot.eureka.client.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description TODO
 * @date 2020-07-02 16:18
 **/

@RequestMapping("/hello")
@RestController
@Slf4j
public class HelloController
{

	@GetMapping
	public String helloApi(@RequestParam("name") String name,
			HttpServletRequest request)
	{
		log.info("[spring-cloud-eureka-client]服务[helloApi]被调用，参数name值为：{}",
				name);
		return "From port:" + request.getServerPort() + ", name:" + name
				+ ",helloApi调用!";
	}
}
