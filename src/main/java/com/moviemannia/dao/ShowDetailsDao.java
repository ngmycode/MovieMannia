package com.moviemannia.dao;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.model.ShowDetails;

public interface ShowDetailsDao {
	
	public String add(ShowDetails showDetails);

	public List<ShowDetails> findAll();

	public boolean delete(DBObject showDetails);

	public DBObject findDocumentById(String id);
	
	public List<ShowDetails> searchShowDetails(String movieId);
	

}
