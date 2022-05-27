package com.github.itsAkshayDubey.springbootnosql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.itsAkshayDubey.springbootnosql.entity.User;
import com.github.itsAkshayDubey.springbootnosql.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	List<User> list = new ArrayList<>();
	
	public User addUser(User user) {
		return repo.save(user);
	}
	
	public User getUser(int id) {
		return repo.findItemById(id);
	}
	
}
