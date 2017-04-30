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
import com.moviemannia.dao.OfferDao;
import com.moviemannia.model.Offer;
import com.moviemannia.utils.OfferUtils;
public class OfferDaoImpl implements OfferDao {
	public String add(Offer offer) {
		@SuppressWarnings("resource")
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	      DBCollection collection = db.getCollection("offer");
	      DBObject basicDBObject = OfferUtils.toDBObject(offer);
	      collection.insert(basicDBObject);
	      ObjectId id = (ObjectId) basicDBObject.get("_id");
		
		return id.toString();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Offer> findAll() {
		List<Offer> offerList = new ArrayList<Offer>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("offer");
	    DBCursor cursor = collection.find();
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	Offer offer=OfferUtils.toOffer(dbObject);     	    	
	    	offerList.add(offer);
	    }
		return offerList;
	}

	@Override
	public boolean delete(DBObject offer) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("offer");
	    BasicDBObject document = new BasicDBObject();
        collection.remove(offer);
		return false;
	}
	
	public DBObject findDocumentById(String id) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    BasicDBObject query = new BasicDBObject();
	    query.put("_id", new ObjectId(id));
	    DBCollection collection = db.getCollection("offer");
	    DBObject dbObj = collection.findOne(query);
	    return dbObj;
	}



}
