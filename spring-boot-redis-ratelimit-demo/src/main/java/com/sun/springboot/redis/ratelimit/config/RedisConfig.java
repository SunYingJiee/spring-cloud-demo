package com.sun.springboot.redis.ratelimit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.scripting.support.ResourceScriptSource;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description TODO
 * @date 2020-07-02 11:06
 **/
@Configuration
public class RedisConfig
{
	@Bean
	@SuppressWarnings("unchecked")
	public RedisScript<Long> limitRedisScript()
	{
		DefaultRedisScript redisScript = new DefaultRedisScript<>();
		redisScript.setScriptSource(new ResourceScriptSource(
				new ClassPathResource("scripts/redis/limit.lua")));
		redisScript.setResultType(Long.class);
		return redisScript;
	}
}
