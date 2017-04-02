package com.moviemannia.action;

import java.util.List;

import com.moviemannia.model.City;
import com.moviemannia.model.Movie;
import com.moviemannia.model.User;
import com.moviemannia.service.CityService;
import com.moviemannia.service.MovieService;
import com.moviemannia.service.UserService;
import com.moviemannia.service.impl.CityServiceImpl;
import com.moviemannia.service.impl.MovieServiceImpl;
import com.moviemannia.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MovieAction extends ActionSupport implements ModelDriven<Movie> {

	private static final long serialVersionUID = -2025967890517108542L;
	private Movie Movie;
	
	public String addMovie() throws Exception {
		MovieService service = new MovieServiceImpl();
		System.out.println(Movie.getCity());
		service.add(Movie);
		List<Movie> Movies = service.findAll();
		Movie.setMovieList(Movies);
		CityService cityService = new CityServiceImpl();
		List<City> cityList = cityService.findAll();
		Movie.setCityList(cityList);
		return "SUCCESS";
	}

	public String manageMovie() throws Exception {
		MovieService service = new MovieServiceImpl();
		List<Movie> Movies = service.findAll();
		Movie.setMovieList(Movies);
		CityService cityService = new CityServiceImpl();
		List<City> cityList = cityService.findAll();
		Movie.setCityList(cityList);
		return "SUCCESS";
		}

	public String deleteMovie() throws Exception {

		MovieService service = new MovieServiceImpl();
		service.delete(Movie.getId());
		List<Movie> Movies = service.findAll();
		Movie.setMovieList(Movies);
		return "SUCCESS";
	}
	
	public String searchMovie() throws Exception {
		MovieService service = new MovieServiceImpl();
		List<Movie> Movies = service.searchMovie(Movie.getCity());
		Movie.setMovieList(Movies);
		CityService cityService = new CityServiceImpl();
		List<City> cityList = cityService.findAll();
		Movie.setCityList(cityList);
		return "SUCCESS";
		}


	@Override
	public Movie getModel() {
		Movie = new Movie();
		return Movie;
	}

}
