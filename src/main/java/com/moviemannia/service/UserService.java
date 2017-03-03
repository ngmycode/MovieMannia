package com.moviemannia.service;

import java.util.List;

import com.moviemannia.model.User;

public interface UserService {
	
	
	public Long add(User user);
    public List<User> findAll();
}
