package com.iftm.course.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

		@Autowired
		private UserRepository repository;
		
		public List<User> findAll() {
			rOptionalpository.findAll();
			
		}
		
		public User findById(Long id) {
			Optional<User> obj = repository.findById(id);
			return obj.get();
		}
}
