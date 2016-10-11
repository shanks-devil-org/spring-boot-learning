package com.shanks.spring.boot.learning.domain;

import lombok.Data;

@Data
public class UserDomain {
	
	public UserDomain() {
		
	}
	public UserDomain(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	private Long id;
	
	private String name;
	
	
}
