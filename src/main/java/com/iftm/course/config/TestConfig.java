package com.iftm.course.config;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.tools.javac.code.Attribute.Array;

public class TestConfig {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRespository orderRepository;
	
	@Override
	prublic void run(String... args) throws Exception {
		
		User u1 = new user(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "98782379", "123456");
		
	
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T19:53:07z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-08-22T19:53:07z"), u1);
		
		userRepository.saveAll(Array.asList(u1, u2));
		orderRepository.saveAll(Array.asList(o1, u2, o3));
		
	}
}
