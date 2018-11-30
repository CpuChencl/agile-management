package com.deppon.mbi.agile.core.redis;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisServiceExecute {

	private Logger log = Logger.getLogger(RedisServiceExecute.class);
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	public void setValue(final String key,final String value){
		redisTemplate.execute(new RedisCallback<String>() {

			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				connection.set(redisTemplate.getStringSerializer().serialize(key), redisTemplate.getStringSerializer().serialize(value));
				return null;
			}
		});
	}
	
	public void setValue(final String key,final String value,final Long timeOut){
		redisTemplate.execute(new RedisCallback<String>() {

			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				connection.setEx(redisTemplate.getStringSerializer().serialize(key), timeOut, redisTemplate.getStringSerializer().serialize(value));
				return null;
			}
		});
	}
	
	public String getValue(final String key){
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyBytes = redisTemplate.getStringSerializer().serialize(key);
				if(connection.exists(keyBytes)){
					byte[] valueByte = connection.get(keyBytes);
					if(valueByte != null && valueByte.length > 0){
						return redisTemplate.getStringSerializer().deserialize(valueByte);
					}
				}
				return "";
			}
		});
	}
	
	public void deleteKey(final String key){
		redisTemplate.delete(key);
	}
	
	public void deleteKeys(final List<String> keys){
		redisTemplate.delete(keys);
	}
}
