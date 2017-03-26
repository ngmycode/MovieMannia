package com.moviemannia.service.impl;


import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.dao.CityDao;
import com.moviemannia.dao.impl.CityDaoImpl;

import com.moviemannia.model.City;

import com.moviemannia.service.CityService;
import com.moviemannia.service.UserService;

public class CityServiceImpl implements CityService {
public Long add(City city) {
		
		CityDaoImpl dao = new CityDaoImpl();
		dao.add(city);
		return null;
	}

	@Override
	public List<City> findAll() {
		CityDao dao = new CityDaoImpl();
		return dao.findAll();
	}

	@Override
	public boolean delete(String objectId) {
		CityDaoImpl dao = new CityDaoImpl();
		DBObject city = dao.findDocumentById(objectId);
		return dao.delete(city);
	}
	
	


}
