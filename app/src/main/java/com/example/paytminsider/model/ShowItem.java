package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

public class ShowItem{

	@SerializedName("display")
	private String display;

	@SerializedName("key")
	private String key;

	public void setDisplay(String display){
		this.display = display;
	}

	public String getDisplay(){
		return display;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}
}