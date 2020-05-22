package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

public class TheatreItem{

	@SerializedName("display")
	private String display;

	@SerializedName("type")
	private String type;

	@SerializedName("key")
	private String key;

	public void setDisplay(String display){
		this.display = display;
	}

	public String getDisplay(){
		return display;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}
}