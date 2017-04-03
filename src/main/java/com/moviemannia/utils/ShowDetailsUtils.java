package com.moviemannia.utils;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.moviemannia.model.ShowDetails;

public class ShowDetailsUtils {

	public static DBObject toDBObject(ShowDetails showDetails) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().append("show_id",showDetails.getShowId())
				.append("show_time", showDetails.getShowTime())
				.append("date", showDetails.getDate())
				.append("price", showDetails.getPrice())
				
				;
    
		BasicDBObjectBuilder moviebuilder = BasicDBObjectBuilder.start().append("movie_id",showDetails.getMovie());
		builder.append("movie", moviebuilder.get());
		return builder.get();
	}

	// convert DBObject Object to Person
	// take special note of converting ObjectId to String
	public static ShowDetails toShowDetails(DBObject doc) {
		ShowDetails showDetails = new ShowDetails();
		
		showDetails.setShowId((String) doc.get("show_id"));
		showDetails.setShowTime((String) doc.get("show_time"));
		showDetails.setDate((String) doc.get("date"));
		showDetails.setPrice((String) doc.get("price"));
		ObjectId id = (ObjectId) doc.get("_id");
		showDetails.setId(id.toString());
		return showDetails;
	}

}
