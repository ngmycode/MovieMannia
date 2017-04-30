package com.moviemannia.model;
import java.util.List;
public class Offer {




	
    private String offer_id;
	private String offer_desc;
	private String date_created;
	
	private List<Offer> offerList;
	
	public String getOfferId() {
		return offer_id;
	}
	public void setOfferId(String offer_id) {
		this.offer_id = offer_id;
	}
	public String getOfferDesc() {
		return offer_desc ;
	}
	public void setOfferDesc(String offer_desc) {
		this.offer_desc = offer_desc;
	}
	public String getOfferDateCreated() {
		return date_created;
	}
	public void setOfferDateCreated(String date_created) {
		this.date_created = date_created;
	}
	
	public List<Offer> getOfferList() {
		return offerList;
	}
	public void setOfferList(List<Offer> offerList) {
		this.offerList = offerList;
	}
	//public String getId() {
		//return id;
	//}
	//public void setId(String id) {
		//this.id = id;
	//}
	
	
	
	
}
