package com.example.login;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class UserDaoServices {
	public static int userCount=5;
	private static List<User> list=new ArrayList<>();
	static {
		list.add(new User(1,"Manikandan",new Date()));
		list.add(new User(2, "Jack", new Date()));  
		list.add(new User(3,"Frank",new Date()));
	}
	public List<User> findAll(){
		return list;
	}
	public User save(User user)
	{
		if(user.getId()==null);{
			user.setId(++userCount);
		}
		list.add(user);
		return user;
	}
	public User fineone(int id) {
		for(User user:list) {
			if(user.getId()==id) 
				return user;
		}
			return null;
		}
	public User deleteone(int id) {
		for(User user:list) {
			if(user.getId()==id) 
				return list.remove(id);
				return user;
		}
			return null;
		}
	
}
