package com.moviemannia.action;

import java.util.List;

import com.moviemannia.model.User;
import com.moviemannia.service.UserService;
import com.moviemannia.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user;

	public String add() throws Exception {
		UserServiceImpl service = new UserServiceImpl();
		service.add(user);
		List<User> users = service.findAll();
		user.setUserList(users);
		return "SUCCESS";
	}

	public String manageUser() throws Exception {
		UserService service = new UserServiceImpl();
		List<User> users = service.findAll();
		user.setUserList(users);
		return "SUCCESS";
	}

	public String deleteUser() throws Exception {

		UserServiceImpl service = new UserServiceImpl();
		service.delete(user.getId());
		List<User> users = service.findAll();
		user.setUserList(users);
		return "SUCCESS";
	}

	public User getModel() {
		user = new User();
		return user;
	}

}
