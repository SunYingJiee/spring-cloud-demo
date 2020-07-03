package com.sun.springboot.redis.service.impl;

import com.google.common.collect.Maps;
import com.sun.springboot.redis.entity.User;
import com.sun.springboot.redis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description TODO
 * @date 2020-06-30 17:07
 **/

@Service
@Slf4j
public class UserServiceImpl implements UserService
{
	/**
	 * 模拟数据库
	 */
	private static final Map<Long, User> DATABASES = Maps.newConcurrentMap();

	/**
	 * 初始化数据
	 */
	static {
		DATABASES.put(1L, new User(1L, "user1"));
		DATABASES.put(2L, new User(2L, "user2"));
		DATABASES.put(3L, new User(3L, "user3"));
	}


	/*
	 * @Description 保存或修改用户
	 * @param [user]
	 * @return User
	 */
	@CachePut(value = "user", key = "#user.id")
	@Override
	public User saveOrUpdate(User user)
	{
		DATABASES.put(user.getId(), user);
		log.info("保存用户【user】= {}", user);
		return user;
	}

	/*
	 * @Description 获取用户
	 * @param [id]
	 * @return User
	 */
	@Cacheable(value = "user", key = "#id")
	@Override
	public User get(Long id)
	{
		// 我们假设从数据库读取
		log.info("查询用户【id】= {}", id);
		return DATABASES.get(id);
	}

	/*
	 * @Description  删除
	 * @param [id]
	 * @return void
	 */
	@CacheEvict(value = "user", key = "#id")
	@Override
	public void delete(Long id)
	{
		DATABASES.remove(id);
		log.info("删除用户【id】= {}", id);
	}
}
