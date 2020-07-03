package com.sun.springboot.redis.ratelimit.handler;

import cn.hutool.core.lang.Dict;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description TODO
 * @date 2020-07-03 14:32
 **/
@RestControllerAdvice
public class GlobalExceptionHandler
{
	@ExceptionHandler(RuntimeException.class)
	public Dict handler(RuntimeException ex) {
		return Dict.create().set("msg", ex.getMessage());
	}
}
