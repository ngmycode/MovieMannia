
package com.moviemannia.service;

import java.util.List;

import com.moviemannia.model.Movie;

public interface MovieService {

	public Long add(Movie Movie);
    public List<Movie> findAll();
    public boolean delete(String objectId);
    public List<Movie> searchMovie(String cityCode); 
}
