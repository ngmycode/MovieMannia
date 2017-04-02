package com.moviemannia.action;

import java.util.List;

import com.moviemannia.model.Theater;
import com.moviemannia.model.User;
import com.moviemannia.service.TheaterService;
import com.moviemannia.service.UserService;
import com.moviemannia.service.impl.TheaterServiceImpl;
import com.moviemannia.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TheaterAction extends ActionSupport implements ModelDriven<Theater> {

	private static final long serialVersionUID = -2025967890517108542L;
	private Theater theater;
	
	public String add() throws Exception {
		TheaterService service = new TheaterServiceImpl();
		service.add(theater);
		List<Theater> theaters = service.findAll();
		theater.setTheaterList(theaters);
		return "SUCCESS";
	}

	public String manageTheater() throws Exception {
		TheaterService service = new TheaterServiceImpl();
		List<Theater> theaters = service.findAll();
		theater.setTheaterList(theaters);
		return "SUCCESS";
		}

	public String deleteUser() throws Exception {

		TheaterService service = new TheaterServiceImpl();
		service.delete(theater.getId());
		List<Theater> theaters = service.findAll();
		theater.setTheaterList(theaters);
		return "SUCCESS";
	}

	@Override
	public Theater getModel() {
		theater = new Theater();
		return theater;
	}

}
