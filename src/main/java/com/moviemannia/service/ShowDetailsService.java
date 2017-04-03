package com.moviemannia.service;

import java.util.List;

import com.moviemannia.model.ShowDetails;

public interface ShowDetailsService {

	public Long add(ShowDetails showDetails);
    public List<ShowDetails> findAll();
    public boolean delete(String objectId);
    public List<ShowDetails> searchShowDetails(String movieId); 
}
