package com.moviemannia.service.impl;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.dao.ScreenDao;
import com.moviemannia.dao.impl.ScreenDaoImpl;
import com.moviemannia.model.Screen;
import com.moviemannia.service.ScreenService;

public class ScreenServiceImpl implements ScreenService {

	@Override
	public Long add(Screen screen) {
		ScreenDao dao = new ScreenDaoImpl();
		dao.add(screen);
		return null;
	}

	@Override
	public List<Screen> findAll() {
		ScreenDao dao = new ScreenDaoImpl();
		return dao.findAll();
	}

	@Override
	public boolean delete(String objectId) {
	    ScreenDao dao = new ScreenDaoImpl();
		DBObject screen = dao.findDocumentById(objectId);
		return dao.delete(screen);	}

	@Override
	public List<Screen> searchScreen(String theaterCode) {
		ScreenDao dao = new ScreenDaoImpl();
		return dao.searchScreen(theaterCode);//new screencode
	}

}

