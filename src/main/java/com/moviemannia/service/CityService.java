package com.moviemannia.service;
import com.moviemannia.model.City;
import java.util.List;



public interface CityService 
{
	

	public Long add(City city);
    public List<City> findAll();
    public boolean delete(String objectId);
}
