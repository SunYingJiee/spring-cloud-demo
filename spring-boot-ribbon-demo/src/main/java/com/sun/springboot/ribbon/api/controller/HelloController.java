package com.sun.springboot.ribbon.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description TODO
 * @date 2020-07-03 09:58
 **/
@RestController
public class HelloController
{

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/hello")
	public String sayHello(String name){
		String url = "http://eureka-client/hello?name=" + name;
		return restTemplate.getForObject(url , String.class);
	}


}
