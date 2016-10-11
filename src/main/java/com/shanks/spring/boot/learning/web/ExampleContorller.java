package com.shanks.spring.boot.learning.web;

import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shanks.spring.boot.learning.domain.UserDomain;
import com.shanks.spring.boot.learning.service.UserService;

@RestController
@RequestMapping("/example")
public class ExampleContorller {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	@ApiOperation(value = "get user by user's Id", notes = "return user's name")
	public UserDomain getUser(@PathVariable Long userId) {
		return userService.findUserById(userId);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ApiOperation(value = "获取所有用户信息", notes = "return all of users info")
	public List<UserDomain> getUsers() {
		return Arrays.asList(new UserDomain(1l, "张三"), new UserDomain(2l, "Tony"));
	}

}
