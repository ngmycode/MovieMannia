package com.moviemannia.model;
import java.util.List;
public class City {




	
    private String city_id;
	private String city_desc;
	private String date_created;
	
	private List<City> cityList;
	
	public String getCityId() {
		return city_id;
	}
	public void setCityId(String city_id) {
		this.city_id = city_id;
	}
	public String getCityName() {
		return city_name ;
	}
	public void setCityName(String city_name) {
		this.city_desc = city_name;
	}
	
	
	public List<City> getCityList() {
		return cityList;
	}
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	public String getId() {
		return id;
	}
public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
