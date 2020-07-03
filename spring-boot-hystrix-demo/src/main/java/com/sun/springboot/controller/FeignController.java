package com.sun.springboot.controller;

import com.sun.springboot.api.IHelloClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description feign 熔断器示例
 * @date 2020-07-02 16:10
 **/
@RestController
@Slf4j
public class FeignController
{
	@Autowired
	public IHelloClient helloClient;

	@GetMapping("/feign")
	public String feign(String name) {
		log.info("使用feign调用服务，参数name:{}", name);
		return helloClient.hello(name);
	}
}
