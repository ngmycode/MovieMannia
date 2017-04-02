package com.moviemannia.dao;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.model.Theater;

public interface TheaterDao {
	
	public String add(Theater theater);

	public List<Theater> findAll();

	public boolean delete(DBObject theater);

	public DBObject findDocumentById(String id);
	
	public List<Theater> searchTheater(String cityCode);
	

}
