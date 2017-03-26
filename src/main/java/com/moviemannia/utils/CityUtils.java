package com.moviemannia.utils;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.moviemannia.model.City;

public class CityUtils {


	public static DBObject toDBObject(City city) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
		.append("city_id", city.getCityId())
		.append("city_desc", city.getCityDesc())
		.append("date_created", city.getCityDateCreated());
		
		/*if (user.getId() != null)
			builder = builder.append("_id", new ObjectId(user.getId()));*/
		return builder.get();
	}

	// convert DBObject Object to Person
	// take special note of converting ObjectId to String
	public static City toCity(DBObject doc) {
		City city = new City();
		city.setCityId((String) doc.get("city_id"));
		city.setCityDesc((String) doc.get("city_desc"));
		city.setCityDateCreated((String) doc.get("date_created"));
		//ObjectId id = (ObjectId) doc.get("_id");
		//city.setId(id.toString());
		return city;

	}
	


}
