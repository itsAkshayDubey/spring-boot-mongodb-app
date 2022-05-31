package com.github.itsAkshayDubey.springbootnosql.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.itsAkshayDubey.springbootnosql.entity.User;
import com.github.itsAkshayDubey.springbootnosql.service.UserService;

@RestController
@RequestMapping(path = "/api")
public class UserController {
	
	@Autowired
	private UserService service;

	@PostMapping("/user")
	@ResponseStatus(code = HttpStatus.CREATED)
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id) {
		return service.getUser(id);
	}
	
	@PutMapping("/user/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public User updateUser(@RequestBody User user, @PathVariable int id) {
		return service.updateUser(user,id);
	}
	
	@DeleteMapping("/user/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
	}
	
	@GetMapping("/users/count")
	@ResponseStatus(code = HttpStatus.OK)
	public long getUserCount() {
		return service.getUserCount();
	}
	
	@GetMapping("/users")
	@ResponseStatus(code = HttpStatus.OK)
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	@GetMapping("/users/active")
	@ResponseStatus(code = HttpStatus.OK)
	public List<User> getAllActiveUsers(){
		return service.getAllActiveUsers();
	}	
	
	@GetMapping("/users/inactive")
	@ResponseStatus(code = HttpStatus.OK)
	public List<User> getAllInactiveUsers(){
		return service.getAllInactiveUsers();
	}	
	
}
