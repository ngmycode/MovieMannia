package com.moviemannia.dao.impl;

import java.util.Set;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.moviemannia.dao.UserDao;
import com.moviemannia.model.User;

public class UserDaoImpl implements UserDao {

	public Long add(User user) {
        
		
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("journaldev");
				
		Set<String> collections = db.getCollectionNames();
		System.out.println(collections);
		
		System.out.println("++++++++++name+++"+user.getUserId());
		System.out.println("++++++++++password+++"+user.getPassword());
		System.out.println("++++++++++email+++"+user.getEmail());
		System.out.println("++++++++++phone+++"+user.getMobile());
		
		return null;
	}

}
