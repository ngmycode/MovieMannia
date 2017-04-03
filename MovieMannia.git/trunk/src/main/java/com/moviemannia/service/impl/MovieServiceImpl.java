package com.moviemannia.service.impl;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.dao.MovieDao;
import com.moviemannia.dao.impl.MovieDaoImpl;
import com.moviemannia.model.Movie;
import com.moviemannia.service.MovieService;

public class MovieServiceImpl implements MovieService {

	@Override
	public Long add(Movie movie) {
		MovieDao dao = new MovieDaoImpl();
		dao.add(movie);
		return null;
	}

	@Override
	public List<Movie> findAll() {
		MovieDao dao = new MovieDaoImpl();
		return dao.findAll();
	}

	@Override
	public boolean delete(String objectId) {
	    MovieDao dao = new MovieDaoImpl();
		DBObject movie = dao.findDocumentById(objectId);
		return dao.delete(movie);	}

	@Override
	public List<Movie> searchMovie(String screenCode) {
		MovieDao dao = new MovieDaoImpl();
		return dao.searchMovie(screenCode);
	}

}
