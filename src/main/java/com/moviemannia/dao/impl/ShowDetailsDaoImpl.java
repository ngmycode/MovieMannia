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
import com.moviemannia.dao.ShowDetailsDao;
import com.moviemannia.model.ShowDetails;
import com.moviemannia.utils.ShowDetailsUtils;

public class ShowDetailsDaoImpl implements ShowDetailsDao {

	@Override
	public String add(ShowDetails showDetails) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
		DBCollection collection = db.getCollection("showDetails");
		DBObject basicDBObject = ShowDetailsUtils.toDBObject(showDetails);
		collection.insert(basicDBObject);
		ObjectId id = (ObjectId) basicDBObject.get("_id");
		return id.toString();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ShowDetails> findAll() {
		List<ShowDetails> showDetailsList = new ArrayList<ShowDetails>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("showDetails");
	    DBCursor cursor = collection.find();
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	ShowDetails showDetails=ShowDetailsUtils.toShowDetails(dbObject);     	    	
	    	showDetailsList.add(showDetails);
	    }
	    mongo.close();
		return showDetailsList;
	}

	@Override
	public boolean delete(DBObject showDetails) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		@SuppressWarnings("deprecation")
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("showDetails");
        collection.remove(showDetails);
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
	    DBCollection collection = db.getCollection("showDetails");
	    DBObject dbObj = collection.findOne(query);
	    return dbObj;
	}

	@Override
	public List<ShowDetails> searchShowDetails(String movieCode) {
		List<ShowDetails> showDetailsList = new ArrayList<ShowDetails>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("showDetails");
	    
	    BasicDBObject whereQuery = new BasicDBObject();
	    whereQuery.put("movie.movie_id", movieCode);
	    
	    DBCursor cursor = collection.find(whereQuery);
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	ShowDetails showDetails=ShowDetailsUtils.toShowDetails(dbObject);     	    	
	    	showDetailsList.add(showDetails);
	    }
	    mongo.close();
		return showDetailsList;
		
	}
	
	

}
