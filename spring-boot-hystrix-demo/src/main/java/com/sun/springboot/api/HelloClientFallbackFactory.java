package com.sun.springboot.api;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description TODO
 * @date 2020-07-02 16:06
 **/
@Component
@Slf4j
public class HelloClientFallbackFactory implements FallbackFactory<IHelloClient>
{
	@Autowired
	@Qualifier("fallback")
	IHelloClient helloClient;

	@Override
	public IHelloClient create(Throwable throwable)
	{
		log.error("feign调用发生异常，触发熔断", throwable);
		return helloClient;
	}
}
