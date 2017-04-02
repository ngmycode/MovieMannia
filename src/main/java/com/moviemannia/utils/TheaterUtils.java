package com.moviemannia.utils;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.moviemannia.model.Theater;

public class TheaterUtils {

	public static DBObject toDBObject(Theater theater) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().append("theater_id",theater.getTheaterCode())
				.append("theater_name", theater.getTheaterName())
				.append("th_address", theater.getTheaterAddress())
				.append("th_mail", theater.getTheaterEmail())
				.append("th_phone", theater.getTheaterPhone())
				;
    
		BasicDBObjectBuilder citybuilder = BasicDBObjectBuilder.start().append("city_id",theater.getCity());
		builder.append("city", citybuilder.get());
		return builder.get();
	}

	// convert DBObject Object to Person
	// take special note of converting ObjectId to String
	public static Theater toTheater(DBObject doc) {
		Theater theater = new Theater();
		
		theater.setTheaterCode((String) doc.get("theater_id"));
		theater.setTheaterName((String) doc.get("theater_name"));
		theater.setTheaterAddress((String) doc.get("th_address"));
		theater.setTheaterEmail((String) doc.get("th_mail"));
		theater.setTheaterPhone((String) doc.get("th_phone"));
		ObjectId id = (ObjectId) doc.get("_id");
		theater.setId(id.toString());
		return theater;
	}

}
