package com.moviemannia.utils;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.moviemannia.model.Movie;

public class MovieUtils {

	public static DBObject toDBObject(Movie movie) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().append("movie_id",movie.getMovieId())
				.append("movie_name", movie.getMovieName())
				.append("language", movie.getLanguage())
				.append("certificate", movie.getCertificate())
				.append("releaseDate", movie.getReleaseDate())
				.append("length", movie.getLength())
				.append("actor", movie.getActor())
				;
    
		BasicDBObjectBuilder screenbuilder = BasicDBObjectBuilder.start().append("screen_id",movie.getScreen());
		builder.append("screen", screenbuilder.get());
		return builder.get();
	}

	// convert DBObject Object to Person
	// take special note of converting ObjectId to String
	public static Movie toMovie(DBObject doc) {
		Movie movie = new Movie();
		
		movie.setMovieId((String) doc.get("movie_id"));
		movie.setMovieName((String) doc.get("movie_name"));
		movie.setLanguage((String) doc.get("language"));
		movie.setCertificate((String) doc.get("certificate"));
		movie.setReleaseDate((String) doc.get("releaseDate"));
		movie.setLength((String) doc.get("length"));
		movie.setActor((String) doc.get("actor"));
		ObjectId id = (ObjectId) doc.get("_id");
		movie.setId(id.toString());
		return movie;
	}

}
