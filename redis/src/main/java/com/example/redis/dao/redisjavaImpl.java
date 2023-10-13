package com.example.redis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
@Primary
@Repository
public class redisjavaImpl implements redisjava {
	
	private RedisTemplate<String ,Object> template=new RedisTemplate<>();
	
	public HashOperations hashOperation;
	
	@Autowired(required =true)
	public redisjavaImpl(RedisTemplate<String , Object> template) {
		this.template=template;
	}
	@PostConstruct
	public void Init() {
		hashOperation=template.opsForHash();
	}
	@Override
	public void add(Object data, String key, String hashkey) {
		
		hashOperation.put(key, hashkey, data);
		
	}
	@Override
	public Object get(String key, String hashkey) {
		
		return hashOperation.get(key, hashkey);
	}
	
	
	
	

}
