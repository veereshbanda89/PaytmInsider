package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

public class Dates{

	@SerializedName("tomorrow_date_string")
	private String tomorrowDateString;

	@SerializedName("weekend_date_string")
	private String weekendDateString;

	@SerializedName("next_weekend")
	private String nextWeekend;

	@SerializedName("next_weekend_date_string")
	private String nextWeekendDateString;

	@SerializedName("today")
	private String today;

	@SerializedName("weekend")
	private String weekend;

	@SerializedName("tomorrow")
	private String tomorrow;

	@SerializedName("today_date_string")
	private String todayDateString;

	public void setTomorrowDateString(String tomorrowDateString){
		this.tomorrowDateString = tomorrowDateString;
	}

	public String getTomorrowDateString(){
		return tomorrowDateString;
	}

	public void setWeekendDateString(String weekendDateString){
		this.weekendDateString = weekendDateString;
	}

	public String getWeekendDateString(){
		return weekendDateString;
	}

	public void setNextWeekend(String nextWeekend){
		this.nextWeekend = nextWeekend;
	}

	public String getNextWeekend(){
		return nextWeekend;
	}

	public void setNextWeekendDateString(String nextWeekendDateString){
		this.nextWeekendDateString = nextWeekendDateString;
	}

	public String getNextWeekendDateString(){
		return nextWeekendDateString;
	}

	public void setToday(String today){
		this.today = today;
	}

	public String getToday(){
		return today;
	}

	public void setWeekend(String weekend){
		this.weekend = weekend;
	}

	public String getWeekend(){
		return weekend;
	}

	public void setTomorrow(String tomorrow){
		this.tomorrow = tomorrow;
	}

	public String getTomorrow(){
		return tomorrow;
	}

	public void setTodayDateString(String todayDateString){
		this.todayDateString = todayDateString;
	}

	public String getTodayDateString(){
		return todayDateString;
	}
}