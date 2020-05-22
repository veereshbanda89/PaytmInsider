package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

public class Text{

	@SerializedName("Travel")
	private Travel travel;

	@SerializedName("Events")
	private Events events;

	@SerializedName("Theatre")
	private Theatre theatre;

	@SerializedName("Digital Events")
	private DigitalEvents digitalEvents;

	@SerializedName("Workshops")
	private Workshops workshops;

	@SerializedName("Food")
	private Food food;

	@SerializedName("Sports")
	private Sports sports;

	public void setTravel(Travel travel){
		this.travel = travel;
	}

	public Travel getTravel(){
		return travel;
	}

	public void setEvents(Events events){
		this.events = events;
	}

	public Events getEvents(){
		return events;
	}

	public void setTheatre(Theatre theatre){
		this.theatre = theatre;
	}

	public Theatre getTheatre(){
		return theatre;
	}

	public void setDigitalEvents(DigitalEvents digitalEvents){
		this.digitalEvents = digitalEvents;
	}

	public DigitalEvents getDigitalEvents(){
		return digitalEvents;
	}

	public void setWorkshops(Workshops workshops){
		this.workshops = workshops;
	}

	public Workshops getWorkshops(){
		return workshops;
	}

	public void setFood(Food food){
		this.food = food;
	}

	public Food getFood(){
		return food;
	}

	public void setSports(Sports sports){
		this.sports = sports;
	}

	public Sports getSports(){
		return sports;
	}
}