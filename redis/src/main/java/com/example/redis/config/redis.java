package com.example.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class redis {
	
	@Bean
	public JedisConnectionFactory JedisConnectionFactory() {
		JedisConnectionFactory jedis =new JedisConnectionFactory();
		jedis.setHostName("localhost");
		jedis.setPassword(null);
		jedis.setPort(6379);
		return jedis;
	}
	
	@Bean
	public RedisTemplate<String, Object > redisTemplate(){
		 RedisTemplate<String, Object >template=new RedisTemplate<String, Object>();
		 template.setConnectionFactory(JedisConnectionFactory());
		 return template;
	}

}
