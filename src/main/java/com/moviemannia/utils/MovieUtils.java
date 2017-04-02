package com.moviemannia.utils;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.moviemannia.model.Movie;

public class MovieUtils {

	public static DBObject toDBObject(Movie movie) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().append("movie_id",movie.getMovieCode())
				.append("movie_name", movie.getMovieName())
				.append("th_address", movie.getMovieAddress())
				.append("th_mail", movie.getMovieEmail())
				.append("th_phone", movie.getMoviePhone())
				;
    
		BasicDBObjectBuilder citybuilder = BasicDBObjectBuilder.start().append("city_id",movie.getCity());
		builder.append("city", citybuilder.get());
		return builder.get();
	}

	// convert DBObject Object to Person
	// take special note of converting ObjectId to String
	public static Movie toMovie(DBObject doc) {
		Movie movie = new Movie();
		
		movie.setMovieCode((String) doc.get("movie_id"));
		movie.setMovieName((String) doc.get("movie_name"));
		movie.setMovieAddress((String) doc.get("th_address"));
		movie.setMovieEmail((String) doc.get("th_mail"));
		movie.setMoviePhone((String) doc.get("th_phone"));
		ObjectId id = (ObjectId) doc.get("_id");
		movie.setId(id.toString());
		return movie;
	}

}
