package com.moviemannia.dao;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.model.movie;

public interface movieDao {
	
	public String add(movie movie);

	public List<movie> findAll();

	public boolean delete(DBObject movie);

	public DBObject findDocumentById(String id);
	
	public List<movie> searchmovie(String cityCode);
	

}

