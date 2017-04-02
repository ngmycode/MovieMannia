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
import com.moviemannia.dao.TheaterDao;
import com.moviemannia.model.Theater;
import com.moviemannia.utils.TheaterUtils;

public class TheaterDaoImpl implements TheaterDao {

	@Override
	public String add(Theater theater) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
		DBCollection collection = db.getCollection("theater");
		DBObject basicDBObject = TheaterUtils.toDBObject(theater);
		collection.insert(basicDBObject);
		ObjectId id = (ObjectId) basicDBObject.get("_id");
		return id.toString();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Theater> findAll() {
		List<Theater> theaterList = new ArrayList<Theater>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("theater");
	    DBCursor cursor = collection.find();
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	Theater theater=TheaterUtils.toTheater(dbObject);     	    	
	    	theaterList.add(theater);
	    }
	    mongo.close();
		return theaterList;
	}

	@Override
	public boolean delete(DBObject theater) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		@SuppressWarnings("deprecation")
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("theater");
        collection.remove(theater);
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
	    DBCollection collection = db.getCollection("theater");
	    DBObject dbObj = collection.findOne(query);
	    return dbObj;
	}

	@Override
	public List<Theater> searchTheater(String cityCode) {
		List<Theater> theaterList = new ArrayList<Theater>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("theater");
	    
	    BasicDBObject whereQuery = new BasicDBObject();
	    whereQuery.put("city.city_id", cityCode);
	    
	    DBCursor cursor = collection.find(whereQuery);
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	Theater theater=TheaterUtils.toTheater(dbObject);     	    	
	    	theaterList.add(theater);
	    }
	    mongo.close();
		return theaterList;
		
	}
	
	

}
