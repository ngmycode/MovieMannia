package com.moviemannia.service;

import java.util.List;

import com.moviemannia.model.Theater;

public interface TheaterService {

	public Long add(Theater theater);
    public List<Theater> findAll();
    public boolean delete(String objectId);
}
