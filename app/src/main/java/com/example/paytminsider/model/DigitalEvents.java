package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DigitalEvents{

	@SerializedName("seo_description")
	private String seoDescription;

	@SerializedName("seo_title")
	private String seoTitle;

	@SerializedName("show")
	private ArrayList<ShowItem> show;

	public void setSeoDescription(String seoDescription){
		this.seoDescription = seoDescription;
	}

	public String getSeoDescription(){
		return seoDescription;
	}

	public void setSeoTitle(String seoTitle){
		this.seoTitle = seoTitle;
	}

	public String getSeoTitle(){
		return seoTitle;
	}

	public void setShow(ArrayList<ShowItem> show){
		this.show = show;
	}

	public ArrayList<ShowItem> getShow(){
		return show;
	}
}