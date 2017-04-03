package com.moviemannia.action;

import java.util.List;

import com.moviemannia.model.City;
import com.moviemannia.service.CityService;
import com.moviemannia.service.impl.CityServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CityAction extends ActionSupport implements ModelDriven<City> {
	
	
	private static final long serialVersionUID = 9105098898038747545L;
	private City city;

	
	public String manageCity() throws Exception {
		CityService service = new CityServiceImpl();
		List<City> cities = service.findAll();
		city.setCityList(cities);
		return "SUCCESS";
	}

	public String addCity() throws Exception {
		CityService service = new CityServiceImpl();
		service.add(city);
		List<City> cities = service.findAll();
		city.setCityList(cities);
		return "SUCCESS";
	}
	
	@Override
	public City getModel() {
     city = new City();
		return city;
	}

}
