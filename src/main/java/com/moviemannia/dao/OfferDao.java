package com.moviemannia.dao;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.model.Offer;

public interface OfferDao {
	public String add(Offer offer);

	public List<Offer> findAll();

	public boolean delete(DBObject offer);

	public DBObject findDocumentById(String _id);


}
