package com.moviemannia.dao;

import java.util.List;

import com.moviemannia.model.User;

public interface UserDao {
	
	
	public String add(User user);
	 public List<User> findAll();

}
