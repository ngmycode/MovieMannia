package com.moviemannia.service;
import com.moviemannia.model.Offer;
import java.util.List;



public interface OfferService 
{
	

	public Long add(Offer offer);
    public List<Offer> findAll();
    public boolean delete(String objectId);
}
