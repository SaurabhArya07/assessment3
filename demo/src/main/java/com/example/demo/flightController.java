package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class flightController {
	ArrayList<User> users = new ArrayList<>();
	@PostMapping("/airline/register")
	String register(@RequestBody User user) {
		users.add(user);
		return "Registered Successfully!!";
	}	
	
	@PostMapping
	
	@GetMapping("/booking/history/{emailId}")
	User History(@PathVariable String email) {
		for(User usr:users) {
			if(usr.getEmail().equals(email)) {
				return usr;
			}
		}
		return null;
		
	}
	
	@GetMapping("/")
	ArrayList getDetails() {
		return users;
	}
	
	
}
