package com.moviemannia.service.impl;

import java.util.List;

import com.mongodb.DBObject;
import com.moviemannia.dao.ShowDetailsDao;
import com.moviemannia.dao.impl.ShowDetailsDaoImpl;
import com.moviemannia.model.ShowDetails;
import com.moviemannia.service.ShowDetailsService;

public class ShowDetailsServiceImpl implements ShowDetailsService {

	@Override
	public Long add(ShowDetails showDetails) {
		ShowDetailsDao dao = new ShowDetailsDaoImpl();
		dao.add(showDetails);
		return null;
	}

	@Override
	public List<ShowDetails> findAll() {
		ShowDetailsDao dao = new ShowDetailsDaoImpl();
		return dao.findAll();
	}

	@Override
	public boolean delete(String objectId) {
	    ShowDetailsDao dao = new ShowDetailsDaoImpl();
		DBObject showDetails = dao.findDocumentById(objectId);
		return dao.delete(showDetails);	}

	@Override
	public List<ShowDetails> searchShowDetails(String movieId) {
		ShowDetailsDao dao = new ShowDetailsDaoImpl();
		return dao.searchShowDetails(movieId);
	}

}

