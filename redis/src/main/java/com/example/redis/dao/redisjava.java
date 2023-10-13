package com.example.redis.dao;

public interface redisjava {
	
	public void add(Object data,String key,String hashkey);
	
	public Object get(String key,String hashkey);

}
