package com.ankit.dailycodebuffer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.dailycodebuffer.VO.ResponseTemplateVO;
import com.ankit.dailycodebuffer.entity.User;
import com.ankit.dailycodebuffer.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/{Id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("Id") Long userId) {
		return userService.getUserWithDepartment(userId);
	}
	
}
