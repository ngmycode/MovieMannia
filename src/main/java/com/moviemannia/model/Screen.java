package com.moviemannia.model;

import java.util.List;

public class Screen {
	
	private String id;
	private String screenId;
	private String screenCode;
	private String totalSeat;
	private List<Screen> screenList;
	private List<Theater> theaterList;
	private String theater;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getScreenId() {
		return screenId;
	}
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public String getScreenCode() {
		return screenCode;
	}
	public void setScreenCode(String screenCode) {
		this.screenCode = screenCode;
	}//
	
	public String getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(String totalSeat) {
		this.totalSeat = totalSeat;
	}
	
		public List<Screen> getScreenList() {
		return screenList;
	}
	public void setScreenList(List<Screen> screenList) {
		this.screenList = screenList;
	}
	public List<Theater> getTheaterList() {
		return theaterList;
	}
	public void setTheaterList(List<Theater> theaterList) {
		this.theaterList = theaterList;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	

}
