package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

public class DisplayDetails{

	@SerializedName("link_type")
	private String linkType;

	@SerializedName("link_slug")
	private String linkSlug;

	public void setLinkType(String linkType){
		this.linkType = linkType;
	}

	public String getLinkType(){
		return linkType;
	}

	public void setLinkSlug(String linkSlug){
		this.linkSlug = linkSlug;
	}

	public String getLinkSlug(){
		return linkSlug;
	}
}