package com.sun.springboot.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description TODO
 * @date 2020-07-02 16:05
 **/

@Component("fallback")
@Slf4j
public class HelloClientFailImpl implements IHelloClient
{

	@Override
	public String hello(String name)
	{
		log.error("restTemplate调用[hello]服务发生熔断，参数name:{}", name);
		return "restTemplate调用[hello]服务发生熔断，参数name:" + name;
	}
}
