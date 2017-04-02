package com.moviemannia.action;

import java.util.List;

import com.moviemannia.model.City;
import com.moviemannia.model.Theater;
import com.moviemannia.model.User;
import com.moviemannia.service.CityService;
import com.moviemannia.service.TheaterService;
import com.moviemannia.service.UserService;
import com.moviemannia.service.impl.CityServiceImpl;
import com.moviemannia.service.impl.TheaterServiceImpl;
import com.moviemannia.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TheaterAction extends ActionSupport implements ModelDriven<Theater> {

	private static final long serialVersionUID = -2025967890517108542L;
	private Theater theater;
	
	public String addTheater() throws Exception {
		TheaterService service = new TheaterServiceImpl();
		System.out.println(theater.getCity());
		service.add(theater);
		List<Theater> theaters = service.findAll();
		theater.setTheaterList(theaters);
		CityService cityService = new CityServiceImpl();
		List<City> cityList = cityService.findAll();
		theater.setCityList(cityList);
		return "SUCCESS";
	}

	public String manageTheater() throws Exception {
		TheaterService service = new TheaterServiceImpl();
		List<Theater> theaters = service.findAll();
		theater.setTheaterList(theaters);
		CityService cityService = new CityServiceImpl();
		List<City> cityList = cityService.findAll();
		theater.setCityList(cityList);
		return "SUCCESS";
		}

	public String deleteTheater() throws Exception {

		TheaterService service = new TheaterServiceImpl();
		service.delete(theater.getId());
		List<Theater> theaters = service.findAll();
		theater.setTheaterList(theaters);
		return "SUCCESS";
	}
	
	public String searchTheater() throws Exception {
		TheaterService service = new TheaterServiceImpl();
		List<Theater> theaters = service.searchTheater(theater.getCity());
		theater.setTheaterList(theaters);
		CityService cityService = new CityServiceImpl();
		List<City> cityList = cityService.findAll();
		theater.setCityList(cityList);
		return "SUCCESS";
		}


	@Override
	public Theater getModel() {
		theater = new Theater();
		return theater;
	}

}
