package com.example.redis.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redis.dao.redisjava;

@RestController
public class Mycontroller {
	
	@Autowired
	redisjava red;
	
	@GetMapping("/test")
	public Object data() {
		
//		 List<Map<String, Object>> dataList = new ArrayList<>();
//
//	        // Initialize data using a loop or other data source
//	        for (int i = 0; i < 5; i++) {
//	            Map<String, Object> data = new HashMap<>();
//
//	            data.put("name", "Person " + (i + 1));
//	            data.put("age", 25 + i);
//	            data.put("isEmployed", i % 2 == 0);
//	            data.put("salary", 30000.0 + i * 5000);
//
//	            dataList.add(data);
//	        }
		return red.get("farm", "name");
		
	}

}
