package com.moviemannia.service.impl;


import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.dao.OfferDao;
import com.moviemannia.dao.impl.OfferDaoImpl;

import com.moviemannia.model.Offer;

import com.moviemannia.service.OfferService;
import com.moviemannia.service.UserService;

public class OfferServiceImpl implements OfferService {
public Long add(Offer offer) {
		
		OfferDaoImpl dao = new OfferDaoImpl();
		dao.add(offer);
		return null;
	}

	@Override
	public List<Offer> findAll() {
		OfferDao dao = new OfferDaoImpl();
		return dao.findAll();
	}

	@Override
	public boolean delete(String objectId) {
		OfferDaoImpl dao = new OfferDaoImpl();
		DBObject offer = dao.findDocumentById(objectId);
		return dao.delete(offer);
	}
	
	


}
