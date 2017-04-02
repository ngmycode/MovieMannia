package com.moviemannia.service.impl;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.dao.TheaterDao;
import com.moviemannia.dao.impl.TheaterDaoImpl;
import com.moviemannia.model.Theater;
import com.moviemannia.service.TheaterService;

public class TheaterServiceImpl implements TheaterService {

	@Override
	public Long add(Theater theater) {
		TheaterDao dao = new TheaterDaoImpl();
		dao.add(theater);
		return null;
	}

	@Override
	public List<Theater> findAll() {
		TheaterDao dao = new TheaterDaoImpl();
		return dao.findAll();
	}

	@Override
	public boolean delete(String objectId) {
	    TheaterDao dao = new TheaterDaoImpl();
		DBObject theater = dao.findDocumentById(objectId);
		return dao.delete(theater);	}

}
