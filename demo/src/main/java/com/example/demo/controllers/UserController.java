package com.example.demo.controllers;


import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	private List<User> users = new ArrayList<>();

	@PostMapping
	public String createUser(@RequestBody User user){
		users.add(user);
		return "User created successfully";
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id){
		return users.stream()
				.filter(u -> u.getId().equals(id))
				.findFirst()
				.orElse(null);
	}

	@GetMapping
	public List<User> getAllUsers(){
		return users;
	}
}