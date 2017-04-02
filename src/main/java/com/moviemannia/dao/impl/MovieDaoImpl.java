package com.moviemannia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.moviemannia.dao.MovieDao;
import com.moviemannia.model.Movie;
import com.moviemannia.utils.MovieUtils;

public class MovieDaoImpl implements MovieDao {

	@Override
	public String add(Movie Movie) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
		DBCollection collection = db.getCollection("Movie");
		DBObject basicDBObject = MovieUtils.toDBObject(Movie);
		collection.insert(basicDBObject);
		ObjectId id = (ObjectId) basicDBObject.get("_id");
		return id.toString();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Movie> findAll() {
		List<Movie> MovieList = new ArrayList<Movie>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("Movie");
	    DBCursor cursor = collection.find();
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	Movie Movie=MovieUtils.toMovie(dbObject);     	    	
	    	MovieList.add(Movie);
	    }
	    mongo.close();
		return MovieList;
	}

	@Override
	public boolean delete(DBObject Movie) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		@SuppressWarnings("deprecation")
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("Movie");
        collection.remove(Movie);
        mongo.close();
		return false;

	}

	@SuppressWarnings("resource")
	@Override
	public DBObject findDocumentById(String id) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		@SuppressWarnings("deprecation")
		DB db = mongo.getDB("moviemannia");
	    BasicDBObject query = new BasicDBObject();
	    query.put("_id", new ObjectId(id));
	    DBCollection collection = db.getCollection("Movie");
	    DBObject dbObj = collection.findOne(query);
	    return dbObj;
	}

	@Override
	public List<Movie> searchMovie(String cityCode) {
		List<Movie> MovieList = new ArrayList<Movie>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("Movie");
	    
	    BasicDBObject whereQuery = new BasicDBObject();
	    whereQuery.put("city.city_id", cityCode);
	    
	    DBCursor cursor = collection.find(whereQuery);
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	Movie Movie=MovieUtils.toMovie(dbObject);     	    	
	    	MovieList.add(Movie);
	    }
	    mongo.close();
		return MovieList;
		
	}
	
	

}
