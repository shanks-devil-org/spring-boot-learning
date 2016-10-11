package com.shanks.spring.boot.learning.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Profile(value = "test")
public class UserServiceTest {

	@Autowired
	private UserService UserService;
	
	@Test
	public void findUserById() {
		Long userId = 1l;
		Assert.assertNotNull(UserService.findUserById(userId));
	}
	
}
