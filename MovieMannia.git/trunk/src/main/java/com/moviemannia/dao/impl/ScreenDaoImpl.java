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
import com.moviemannia.dao.ScreenDao;
import com.moviemannia.model.Screen;
import com.moviemannia.utils.ScreenUtils;

public class ScreenDaoImpl implements ScreenDao {

	@Override
	public String add(Screen screen) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
		DBCollection collection = db.getCollection("screen");
		DBObject basicDBObject = ScreenUtils.toDBObject(screen);
		collection.insert(basicDBObject);
		ObjectId id = (ObjectId) basicDBObject.get("_id");
		return id.toString();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Screen> findAll() {
		List<Screen> screenList = new ArrayList<Screen>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("screen");
	    DBCursor cursor = collection.find();
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	Screen screen=ScreenUtils.toScreen(dbObject);     	    	
	    	screenList.add(screen);
	    }
	    mongo.close();
		return screenList;
	}

	@Override
	public boolean delete(DBObject screen) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		@SuppressWarnings("deprecation")
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("screen");
        collection.remove(screen);
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
	    DBCollection collection = db.getCollection("screen");
	    DBObject dbObj = collection.findOne(query);
	    return dbObj;
	}

	@Override
	public List<Screen> searchScreen(String theaterCode) {
		List<Screen> screenList = new ArrayList<Screen>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("screen");
	    
	    BasicDBObject whereQuery = new BasicDBObject();
	    whereQuery.put("theater.theater_id", theaterCode);
	    
	    DBCursor cursor = collection.find(whereQuery);
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	Screen screen=ScreenUtils.toScreen(dbObject);     	    	
	    	screenList.add(screen);
	    }
	    mongo.close();
		return screenList;
		
	}
	
	

}
