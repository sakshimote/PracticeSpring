package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.User;


@RestController
public class HomeController {
	
	@RequestMapping("/abc")
	public String hello() {
		return "Hello!!!";
	}
	
	@GetMapping("/user")
	public User getUser() {
		User user=new User();
		user.setId("1");
		user.setEmailId("sakshi2gmail.com");
		user.setName("sakshi");
		return user;
		
	}
	

}
