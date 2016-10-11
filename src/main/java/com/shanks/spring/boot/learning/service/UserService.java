package com.shanks.spring.boot.learning.service;

import org.springframework.stereotype.Service;

import com.shanks.spring.boot.learning.domain.UserDomain;

@Service
public class UserService {

	public UserDomain findUserById(Long userId) {
		return new UserDomain(userId, "张三");
	}
	
}
