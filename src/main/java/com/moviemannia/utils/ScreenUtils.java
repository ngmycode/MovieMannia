package com.moviemannia.utils;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.moviemannia.model.Screen;

public class ScreenUtils {

	public static DBObject toDBObject(Screen screen) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().append("screen_id",screen.getScreenCode())
				.append("screen_code", screen.getScreenCode())
				.append("total_seat", screen.getTotalSeat())
				
				;
    
		BasicDBObjectBuilder theaterbuilder = BasicDBObjectBuilder.start().append("theater_id",screen.getTheater());
		builder.append("theater", theaterbuilder.get());//
		return builder.get();
	}

	// convert DBObject Object to Person
	// take special note of converting ObjectId to String
	public static Screen toScreen(DBObject doc) {
		Screen screen = new Screen();
		
		screen.setScreenId((String) doc.get("screen_id"));
		screen.setScreenCode((String) doc.get("screen_code"));
		screen.setTotalSeat((String) doc.get("total_seat"));
		
		ObjectId id = (ObjectId) doc.get("_id");//
		screen.setId(id.toString());
		return screen;
	}

}
