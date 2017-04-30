package com.moviemannia.dao;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.model.Screen;

public interface ScreenDao {
	
	public String add(Screen screen);

	public List<Screen> findAll();

	public boolean delete(DBObject screen);

	public DBObject findDocumentById(String id);
	
	public List<Screen> searchScreen(String theaterCode);
	

}
