package com.moviemannia.model;

import java.util.List;

public class Movie {
	
	private String id;
	private String movieId;
	private String movieName;
	private String language;
	private String certificate;
	private String releaseDate;
	private String length;
	private String actor;
	private List<Movie> movieList;
	private List<Screen> screenList;
	private String screen;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {//
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public List<Movie> getMovieList() {
		return movieList;
	}
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	public List<Screen> getScreenList() {
		return screenList;
	}
	public void setScreenList(List<Screen> screenList) {
		this.screenList = screenList;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	

}
