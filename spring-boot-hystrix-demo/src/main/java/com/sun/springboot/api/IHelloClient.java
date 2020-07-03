package com.sun.springboot.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description TODO
 * @date 2020-07-02 16:03
 **/

@FeignClient(name="eureka-client",/*fallback=HelloClientFailImpl.class,*/ fallbackFactory = HelloClientFallbackFactory.class)
public interface IHelloClient
{
	/**
	 * 定义接口
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/hello", method= RequestMethod.GET)
	public String hello(@RequestParam("name") String name);
}
