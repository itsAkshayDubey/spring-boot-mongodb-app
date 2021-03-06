package com.github.itsAkshayDubey.springbootnosql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.itsAkshayDubey.springbootnosql.entity.User;
import com.github.itsAkshayDubey.springbootnosql.exception.UserNotFoundException;
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
		User user = repo.findUserById(id);
		if(user != null)
			return user;
		throw new UserNotFoundException("User with id "+id+" not found.");
	}

	public User updateUser(User user, int id) {
		User persistUser = this.getUser(id);
		if(persistUser != null) {
			persistUser.setId(id);
			persistUser.setName(user.getName());
			persistUser.setEnabled(user.isEnabled());
			return repo.save(persistUser);
		}
		throw new UserNotFoundException("User with id "+id+" not found.");
		
	}
	
	public void deleteUser(int id) {
		if(this.getUser(id) != null)
			repo.deleteById(id);
		throw new UserNotFoundException("User with id "+id+" not found.");
	}
	
	public long getUserCount() {
		return repo.count();
	}
	
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	
	public List<User> getAllActiveUsers(){
		return repo.findByIsEnabledIsTrue();
	}
	
	public List<User> getAllInactiveUsers(){
		return repo.findByIsEnabledIsFalse();
	}
	
}
