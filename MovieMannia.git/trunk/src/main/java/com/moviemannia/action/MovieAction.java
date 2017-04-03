package com.moviemannia.action;

import java.util.List;

import com.moviemannia.model.Screen;
import com.moviemannia.model.Movie;
import com.moviemannia.model.User;
import com.moviemannia.service.ScreenService;
import com.moviemannia.service.MovieService;
import com.moviemannia.service.UserService;
import com.moviemannia.service.impl.ScreenServiceImpl;
import com.moviemannia.service.impl.MovieServiceImpl;
import com.moviemannia.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MovieAction extends ActionSupport implements ModelDriven<Movie> {

	private static final long serialVersionUID = -2025967890517108542L;
	private Movie Movie;
	
	public String addMovie() throws Exception {
		MovieService service = new MovieServiceImpl();
		System.out.println(Movie.getScreen());
		service.add(Movie);
		List<Movie> Movies = service.findAll();
		Movie.setMovieList(Movies);
		ScreenService ScreenService = new ScreenServiceImpl();
		List<Screen> ScreenList = ScreenService.findAll();
		Movie.setScreenList(ScreenList);
		return "SUCCESS";
	}

	public String manageMovie() throws Exception {
		MovieService service = new MovieServiceImpl();
		List<Movie> Movies = service.findAll();
		Movie.setMovieList(Movies);
		ScreenService ScreenService = new ScreenServiceImpl();
		List<Screen> ScreenList = ScreenService.findAll();
		Movie.setScreenList(ScreenList);
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
		List<Movie> Movies = service.searchMovie(Movie.getScreen());
		Movie.setMovieList(Movies);
		ScreenService ScreenService = new ScreenServiceImpl();
		List<Screen> ScreenList = ScreenService.findAll();
		Movie.setScreenList(ScreenList);
		return "SUCCESS";
		}


	@Override
	public Movie getModel() {
		Movie = new Movie();
		return Movie;
	}

}
