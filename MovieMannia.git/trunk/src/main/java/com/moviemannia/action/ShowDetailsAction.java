
package com.moviemannia.action;
import java.util.List;
import com.moviemannia.model.Movie;
import com.moviemannia.model.ShowDetails;
import com.moviemannia.model.User;
import com.moviemannia.service.MovieService;
import com.moviemannia.service.ShowDetailsService;
import com.moviemannia.service.UserService;
import com.moviemannia.service.impl.MovieServiceImpl;
import com.moviemannia.service.impl.ShowDetailsServiceImpl;
import com.moviemannia.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ShowDetailsAction extends ActionSupport implements ModelDriven<ShowDetails> {

	private static final long serialVersionUID = -2025967890517108542L;
	private ShowDetails showDetails;
	
	public String addShowDetails() throws Exception {
		ShowDetailsService service = new ShowDetailsServiceImpl();
		System.out.println(showDetails.getMovie());
		service.add(showDetails);
		List<ShowDetails> showDetailss = service.findAll();
		showDetails.setShowDetailsList(showDetailss);
		MovieService movieService = new MovieServiceImpl();
		List<Movie> movieList = movieService.findAll();
		showDetails.setMovieList(movieList);
		return "SUCCESS";
	}

	public String manageShowDetails() throws Exception {
		ShowDetailsService service = new ShowDetailsServiceImpl();
		List<ShowDetails> showDetailss = service.findAll();
		showDetails.setShowDetailsList(showDetailss);
		MovieService movieService = new MovieServiceImpl();
		List<Movie> movieList = movieService.findAll();
		showDetails.setMovieList(movieList);
		return "SUCCESS";
		}

	public String deleteShowDetails() throws Exception {

		ShowDetailsService service = new ShowDetailsServiceImpl();
		service.delete(showDetails.getId());
		List<ShowDetails> showDetailss = service.findAll();
		showDetails.setShowDetailsList(showDetailss);
		return "SUCCESS";
	}
	
	public String searchShowDetails() throws Exception {
		ShowDetailsService service = new ShowDetailsServiceImpl();
		List<ShowDetails> showDetailss = service.searchShowDetails(showDetails.getMovie());
		showDetails.setShowDetailsList(showDetailss);
		MovieService movieService = new MovieServiceImpl();
		List<Movie> movieList = movieService.findAll();
		showDetails.setMovieList(movieList);
		return "SUCCESS";
		}


	@Override
	public ShowDetails getModel() {
		showDetails = new ShowDetails();
		return showDetails;
	}
}
