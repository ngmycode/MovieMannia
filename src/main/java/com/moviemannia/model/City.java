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
	public String getCityDesc() {
		return city_desc ;
	}
	public void setCityDesc(String city_desc) {
		this.city_desc = city_desc;
	}
	public String getCityDateCreated() {
		return date_created;
	}
	public void setCityDateCreated(String date_created) {
		this.date_created = date_created;
	}
	
	public List<City> getCityList() {
		return cityList;
	}
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	//public String getId() {
		//return id;
	//}
	//public void setId(String id) {
		//this.id = id;
	//}
	
	
	
	
}
