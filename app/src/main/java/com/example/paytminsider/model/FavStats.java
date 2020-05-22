package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

public class FavStats{

	@SerializedName("prettyCount")
	private int prettyCount;

	@SerializedName("actualCount")
	private int actualCount;

	@SerializedName("target_id")
	private String targetId;

	public void setPrettyCount(int prettyCount){
		this.prettyCount = prettyCount;
	}

	public int getPrettyCount(){
		return prettyCount;
	}

	public void setActualCount(int actualCount){
		this.actualCount = actualCount;
	}

	public int getActualCount(){
		return actualCount;
	}

	public void setTargetId(String targetId){
		this.targetId = targetId;
	}

	public String getTargetId(){
		return targetId;
	}
}