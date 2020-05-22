package com.example.paytminsider.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Sorters{

	@SerializedName("Travel")
	private List<TravelItem> travel;

	@SerializedName("Events")
	private List<EventsItem> events;

	@SerializedName("Digital Events")
	private List<Object> digitalEvents;

	@SerializedName("Theatre")
	private List<TheatreItem> theatre;

	@SerializedName("Workshops")
	private List<WorkshopsItem> workshops;

	@SerializedName("Food")
	private List<FoodItem> food;

	@SerializedName("Sports")
	private List<Object> sports;

	public void setTravel(List<TravelItem> travel){
		this.travel = travel;
	}

	public List<TravelItem> getTravel(){
		return travel;
	}

	public void setEvents(List<EventsItem> events){
		this.events = events;
	}

	public List<EventsItem> getEvents(){
		return events;
	}

	public void setDigitalEvents(List<Object> digitalEvents){
		this.digitalEvents = digitalEvents;
	}

	public List<Object> getDigitalEvents(){
		return digitalEvents;
	}

	public void setTheatre(List<TheatreItem> theatre){
		this.theatre = theatre;
	}

	public List<TheatreItem> getTheatre(){
		return theatre;
	}

	public void setWorkshops(List<WorkshopsItem> workshops){
		this.workshops = workshops;
	}

	public List<WorkshopsItem> getWorkshops(){
		return workshops;
	}

	public void setFood(List<FoodItem> food){
		this.food = food;
	}

	public List<FoodItem> getFood(){
		return food;
	}

	public void setSports(List<Object> sports){
		this.sports = sports;
	}

	public List<Object> getSports(){
		return sports;
	}
}