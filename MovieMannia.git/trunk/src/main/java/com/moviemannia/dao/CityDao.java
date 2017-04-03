package com.moviemannia.dao;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.model.City;

public interface CityDao {
	public String add(City city);

	public List<City> findAll();

	public boolean delete(DBObject city);

	public DBObject findDocumentById(String _id);


}
