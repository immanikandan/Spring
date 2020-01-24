package com.example.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class UserResource {
	@Autowired
	private UserDaoServices service;
	@GetMapping("/path")
	public List<User> retriveallusers(){
		return service.findAll();
	}
	//@RequestMapping("/param")
	@PutMapping("/param/{i}")
	public User getone(@PathVariable int i){
		return service.fineone(i);
	}
	@PostMapping("/user")
	void createuser(@RequestBody User user) {
		User SavedUser=service.save(user);
	}
	@DeleteMapping("/delete/{id}")
			public User deleteuser(@PathVariable int id) {
		return service.deleteone(id);
	}
}
