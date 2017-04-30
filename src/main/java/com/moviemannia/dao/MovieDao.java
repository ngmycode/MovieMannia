package com.moviemannia.dao;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.model.Movie;

public interface MovieDao {
	
	public String add(Movie movie);

	public List<Movie> findAll();

	public boolean delete(DBObject movie);

	public DBObject findDocumentById(String id);
	
	public List<Movie> searchMovie(String screenCode);//
	

}

