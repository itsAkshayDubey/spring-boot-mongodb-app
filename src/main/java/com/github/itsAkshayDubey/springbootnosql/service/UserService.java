package com.github.itsAkshayDubey.springbootnosql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.itsAkshayDubey.springbootnosql.entity.User;

@Service
public class UserService {

	List<User> list = new ArrayList<>();
	
	public User addUser(User user) {
		user.setId(list.size());
		list.add(user);
		
		return user;
	}
	
}
