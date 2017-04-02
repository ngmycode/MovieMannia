package com.moviemannia.model;

import java.util.List;

public class movie {
	
	private String id;
	private String movieCode;
	private String movieName;
	private String movieAddress;
	private String movieEmail;
	private String moviePhone;
	private List<movie> movieList;
	private List<City> cityList;
	private String city;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getmovieCode() {
		return movieCode;
	}
	public void setmovieCode(String movieCode) {
		this.movieCode = movieCode;
	}
	public String getmovieName() {
		return movieName;
	}
	public void setmovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getmovieAddress() {
		return movieAddress;
	}
	public void setmovieAddress(String movieAddress) {
		this.movieAddress = movieAddress;
	}
	public String getmovieEmail() {
		return movieEmail;
	}
	public void setmovieEmail(String movieEmail) {
		this.movieEmail = movieEmail;
	}
	public String getmoviePhone() {
		return moviePhone;
	}
	public void setmoviePhone(String moviePhone) {
		this.moviePhone = moviePhone;
	}
	public List<movie> getmovieList() {
		return movieList;
	}
	public void setmovieList(List<movie> movieList) {
		this.movieList = movieList;
	}
	public List<City> getCityList() {
		return cityList;
	}
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
