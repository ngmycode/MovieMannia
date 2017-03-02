package com.moviemannia.service.impl;

import com.moviemannia.dao.impl.UserDaoImpl;
import com.moviemannia.model.User;
import com.moviemannia.service.UserService;

public class UserServiceImpl implements UserService{

	public Long add(User user) {
		
		UserDaoImpl dao = new UserDaoImpl();
		dao.add(user);
		return null;
	}
	
	

}
