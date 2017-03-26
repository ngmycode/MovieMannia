package com.moviemannia.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.moviemannia.dao.CityDao;
import com.moviemannia.model.City;
import com.moviemannia.utils.CityUtils;
public class CityDaoImpl implements CityDao {
	public String add(City city) {
		@SuppressWarnings("resource")
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	      DBCollection collection = db.getCollection("city");
	      DBObject basicDBObject = CityUtils.toDBObject(city);
	      collection.insert(basicDBObject);
	      ObjectId id = (ObjectId) basicDBObject.get("_id");
		
		return id.toString();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<City> findAll() {
		List<City> cityList = new ArrayList<City>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("city");
	    DBCursor cursor = collection.find();
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	City city=CityUtils.toCity(dbObject);     	    	
	    	cityList.add(city);
	    }
		return cityList;
	}

	@Override
	public boolean delete(DBObject city) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("city");
	    BasicDBObject document = new BasicDBObject();
        collection.remove(city);
		return false;
	}
	
	public DBObject findDocumentById(String id) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    BasicDBObject query = new BasicDBObject();
	    query.put("_id", new ObjectId(id));
	    DBCollection collection = db.getCollection("city");
	    DBObject dbObj = collection.findOne(query);
	    return dbObj;
	}



}
