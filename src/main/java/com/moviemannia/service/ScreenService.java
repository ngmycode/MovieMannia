package com.moviemannia.service;

import java.util.List;

import com.moviemannia.model.Screen;

public interface ScreenService {

	public Long add(Screen screen);
    public List<Screen> findAll();
    public boolean delete(String objectId);
    public List<Screen> searchScreen(String theaterCode); //
}
