package com.moviemannia.model;

import java.util.List;

public class ShowDetails {
	
	private String id;
	private String showId;
	private String showTime;
	private String date;
	private String price;
	private List<ShowDetails> showDetailsList;
	private List<Movie> movieList;
	private String movie;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShowId() {
		return showId;
	}
	public void setShowId(String showId) {
		this.showId = showId;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
		public List<ShowDetails> getShowDetailsList() {
		return showDetailsList;
	}
	public void setShowDetailsList(List<ShowDetails> showDetailsList) {
		this.showDetailsList = showDetailsList;
	}
	public List<Movie> getMovieList() {
		return movieList;
	}
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	

}
