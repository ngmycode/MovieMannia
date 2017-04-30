package com.moviemannia.utils;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.moviemannia.model.Offer;

public class OfferUtils {


	public static DBObject toDBObject(Offer offer) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
		.append("offer_id", offer.getOfferId())
		.append("offer_desc", offer.getOfferDesc())
		.append("date_created", offer.getOfferDateCreated());
		
		/*if (user.getId() != null)
			builder = builder.append("_id", new ObjectId(user.getId()));*/
		return builder.get();
	}

	// convert DBObject Object to Person
	// take special note of converting ObjectId to String
	public static Offer toOffer(DBObject doc) {
		Offer offer = new Offer();
		offer.setOfferId((String) doc.get("offer_id"));
		offer.setOfferDesc((String) doc.get("offer_desc"));
		offer.setOfferDateCreated((String) doc.get("date_created"));
		//ObjectId id = (ObjectId) doc.get("_id");
		//offer.setId(id.toString());
		return offer;

	}
	


}
