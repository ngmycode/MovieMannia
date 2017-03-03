package com.moviemannia.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.moviemannia.dao.UserDao;
import com.moviemannia.model.User;
import com.moviemannia.utils.UserUtils;

public class UserDaoImpl implements UserDao {

	public String add(User user) {
        
		
		@SuppressWarnings("resource")
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
				
	      DBCollection collection = db.getCollection("user");
		
	      DBObject basicDBObject = UserUtils.toDBObject(user);
	      collection.insert(basicDBObject);
	      ObjectId id = (ObjectId) basicDBObject.get("_id");
		
		return id.toString();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<User> findAll() {
		List<User> userList = new ArrayList<User>();
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("moviemannia");
	    DBCollection collection = db.getCollection("user");
	    DBCursor cursor = collection.find();
	    while (cursor.hasNext()) {
	    	DBObject dbObject = cursor.next();
	    	
	    	System.out.println(cursor.next());
	    }
		
		
		return null;
	}

}
