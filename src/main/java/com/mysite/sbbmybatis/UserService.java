package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User getUser(String username) {
		return userMapper.getUserByUsername(username);
		//return "Hello World";
	}
}
