package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Sports{

	@SerializedName("all_description")
	private String allDescription;

	@SerializedName("all_title")
	private String allTitle;

	@SerializedName("pick_description")
	private String pickDescription;

	@SerializedName("seo_description")
	private String seoDescription;

	@SerializedName("pick_title")
	private String pickTitle;

	@SerializedName("seo_title")
	private String seoTitle;

	@SerializedName("show")
	private ArrayList<ShowItem> show;

	public void setAllDescription(String allDescription){
		this.allDescription = allDescription;
	}

	public String getAllDescription(){
		return allDescription;
	}

	public void setAllTitle(String allTitle){
		this.allTitle = allTitle;
	}

	public String getAllTitle(){
		return allTitle;
	}

	public void setPickDescription(String pickDescription){
		this.pickDescription = pickDescription;
	}

	public String getPickDescription(){
		return pickDescription;
	}

	public void setSeoDescription(String seoDescription){
		this.seoDescription = seoDescription;
	}

	public String getSeoDescription(){
		return seoDescription;
	}

	public void setPickTitle(String pickTitle){
		this.pickTitle = pickTitle;
	}

	public String getPickTitle(){
		return pickTitle;
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