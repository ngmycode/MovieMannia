package com.moviemannia.model;

import java.util.List;

public class Theater {
	
	private String id;
	private String theaterCode;
	private String theaterName;
	private String theaterAddress;
	private String theaterEmail;
	private String theaterPhone;
	private List<Theater> theaterList;
	private List<City> cityList;
	private String city;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTheaterCode() {
		return theaterCode;
	}
	public void setTheaterCode(String theaterCode) {
		this.theaterCode = theaterCode;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterAddress() {
		return theaterAddress;
	}
	public void setTheaterAddress(String theaterAddress) {
		this.theaterAddress = theaterAddress;
	}
	public String getTheaterEmail() {
		return theaterEmail;
	}
	public void setTheaterEmail(String theaterEmail) {
		this.theaterEmail = theaterEmail;
	}
	public String getTheaterPhone() {
		return theaterPhone;
	}
	public void setTheaterPhone(String theaterPhone) {
		this.theaterPhone = theaterPhone;
	}
	public List<Theater> getTheaterList() {
		return theaterList;
	}
	public void setTheaterList(List<Theater> theaterList) {
		this.theaterList = theaterList;
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
