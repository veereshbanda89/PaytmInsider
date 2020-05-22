package com.example.paytminsider.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GroupwiseList{

	@SerializedName("Travel")
	private List<String> travel;

	@SerializedName("Events")
	private List<String> events;

	@SerializedName("Theatre")
	private List<String> theatre;

	@SerializedName("Digital Events")
	private List<String> digitalEvents;

	@SerializedName("Workshops")
	private List<String> workshops;

	@SerializedName("Food")
	private List<String> food;

	@SerializedName("Sports")
	private List<String> sports;

	public void setTravel(List<String> travel){
		this.travel = travel;
	}

	public List<String> getTravel(){
		return travel;
	}

	public void setEvents(List<String> events){
		this.events = events;
	}

	public List<String> getEvents(){
		return events;
	}

	public void setTheatre(List<String> theatre){
		this.theatre = theatre;
	}

	public List<String> getTheatre(){
		return theatre;
	}

	public void setDigitalEvents(List<String> digitalEvents){
		this.digitalEvents = digitalEvents;
	}

	public List<String> getDigitalEvents(){
		return digitalEvents;
	}

	public void setWorkshops(List<String> workshops){
		this.workshops = workshops;
	}

	public List<String> getWorkshops(){
		return workshops;
	}

	public void setFood(List<String> food){
		this.food = food;
	}

	public List<String> getFood(){
		return food;
	}

	public void setSports(List<String> sports){
		this.sports = sports;
	}

	public List<String> getSports(){
		return sports;
	}
}