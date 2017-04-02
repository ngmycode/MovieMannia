package com.moviemannia.service.impl;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.dao.movieDao;
import com.moviemannia.dao.impl.movieDaoImpl;
import com.moviemannia.model.movie;
import com.moviemannia.service.movieService;

public class movieServiceImpl implements movieService {

	@Override
	public Long add(movie movie) {
		movieDao dao = new movieDaoImpl();
		dao.add(movie);
		return null;
	}

	@Override
	public List<movie> findAll() {
		movieDao dao = new movieDaoImpl();
		return dao.findAll();
	}

	@Override
	public boolean delete(String objectId) {
	    movieDao dao = new movieDaoImpl();
		DBObject movie = dao.findDocumentById(objectId);
		return dao.delete(movie);	}

	@Override
	public List<movie> searchmovie(String cityCode) {
		movieDao dao = new movieDaoImpl();
		return dao.searchmovie(cityCode);
	}

}
