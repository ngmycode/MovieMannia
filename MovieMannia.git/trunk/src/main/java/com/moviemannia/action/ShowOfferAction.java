package com.moviemannia.action;

import java.util.List;

import com.moviemannia.model.Offer;
import com.moviemannia.service.OfferService;
import com.moviemannia.service.impl.OfferServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ShowOfferAction extends ActionSupport implements ModelDriven<Offer> {

	private Offer offer;

	public String add() throws Exception {
		OfferServiceImpl service = new OfferServiceImpl();
		service.add(offer);
		List<Offer> offers = service.findAll();
		offer.setOfferList(offers);
		return "SUCCESS";
	}

	public String showOffer() throws Exception {
		OfferService service = new OfferServiceImpl();
		List<Offer> offers = service.findAll();
		offer.setOfferList(offers);
		return "SUCCESS";
	}

	public String deleteOffer() throws Exception {

		OfferService service = new OfferServiceImpl();
		service.delete(offer.getOfferId());
		List<Offer> offers = service.findAll();
		offer.setOfferList(offers);
		return "SUCCESS";
	}

	public Offer getModel() {
		offer = new Offer();
		return offer;
	}

}
