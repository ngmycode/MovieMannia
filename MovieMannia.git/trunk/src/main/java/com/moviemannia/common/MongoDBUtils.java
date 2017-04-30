package com.moviemannia.common;
import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
public class MongoDBUtils {

	    Mongo  mongo = null;
	    DB     database = null;
	    String databaseName;

	    public DBCollection getCollection( String collection )
	    {
	        return this.getCollection( this.databaseName, collection );
	    }

	    public DBCollection getCollection( String database, String collection )
	    {
	        this.database = mongo.getDB( database );
	        return this.database.getCollection( collection );
	    }

	
	
}
