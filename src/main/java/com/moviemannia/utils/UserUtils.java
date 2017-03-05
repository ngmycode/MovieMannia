package com.moviemannia.utils;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.moviemannia.model.User;

public class UserUtils {
	
	
	public static DBObject toDBObject(User user) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
		.append("userId", user.getUserId())
		.append("password", user.getPassword())
		.append("email", user.getEmail())
		.append("mobile", user.getMobile());
		/*if (user.getId() != null)
			builder = builder.append("_id", new ObjectId(user.getId()));*/
		return builder.get();
	}

	// convert DBObject Object to Person
	// take special note of converting ObjectId to String
	public static User toUser(DBObject doc) {
		User user = new User();
		user.setUserId((String) doc.get("userId"));
		user.setPassword((String) doc.get("password"));
		user.setEmail((String) doc.get("email"));
		user.setMobile((String) doc.get("mobile"));
		ObjectId id = (ObjectId) doc.get("_id");
		user.setId(id.toString());
		return user;

	}
	

}
