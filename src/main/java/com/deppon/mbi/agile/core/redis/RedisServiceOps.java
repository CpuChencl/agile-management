package com.deppon.mbi.agile.core.redis;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisServiceOps {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	public void set(final String key,final String value,long timeout){
		redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.MILLISECONDS);
	}
	
	public void set(final String key,final String value){
		redisTemplate.opsForValue().set(key, value);
	}
	
	public String get(final String key){
		return redisTemplate.opsForValue().get(key);
	}
	
	public void delete(final String key){
		redisTemplate.delete(key);
	}
}
