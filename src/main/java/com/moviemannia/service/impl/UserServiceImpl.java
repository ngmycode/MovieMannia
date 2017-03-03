package com.moviemannia.service.impl;

import java.util.List;

import com.moviemannia.dao.impl.UserDaoImpl;
import com.moviemannia.model.User;
import com.moviemannia.service.UserService;

public class UserServiceImpl implements UserService{

	public Long add(User user) {
		
		UserDaoImpl dao = new UserDaoImpl();
		dao.add(user);
		return null;
	}

	@Override
	public List<User> findAll() {
		UserDaoImpl dao = new UserDaoImpl();
		return dao.findAll();
	}
	
	

}
