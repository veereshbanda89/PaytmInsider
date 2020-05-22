package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

public class PropertyTag{

	@SerializedName("is_primary_interest")
	private boolean isPrimaryInterest;

	@SerializedName("primary_interest_negation_text")
	private String primaryInterestNegationText;

	@SerializedName("is_carousel")
	private boolean isCarousel;

	@SerializedName("tag_id")
	private String tagId;

	@SerializedName("carousel_position")
	private int carouselPosition;

	@SerializedName("_id")
	private String id;

	@SerializedName("is_pick")
	private boolean isPick;

	@SerializedName("priority")
	private int priority;

	@SerializedName("is_featured")
	private boolean isFeatured;

	public void setIsPrimaryInterest(boolean isPrimaryInterest){
		this.isPrimaryInterest = isPrimaryInterest;
	}

	public boolean isIsPrimaryInterest(){
		return isPrimaryInterest;
	}

	public void setPrimaryInterestNegationText(String primaryInterestNegationText){
		this.primaryInterestNegationText = primaryInterestNegationText;
	}

	public String getPrimaryInterestNegationText(){
		return primaryInterestNegationText;
	}

	public void setIsCarousel(boolean isCarousel){
		this.isCarousel = isCarousel;
	}

	public boolean isIsCarousel(){
		return isCarousel;
	}

	public void setTagId(String tagId){
		this.tagId = tagId;
	}

	public String getTagId(){
		return tagId;
	}

	public void setCarouselPosition(int carouselPosition){
		this.carouselPosition = carouselPosition;
	}

	public int getCarouselPosition(){
		return carouselPosition;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setIsPick(boolean isPick){
		this.isPick = isPick;
	}

	public boolean isIsPick(){
		return isPick;
	}

	public void setPriority(int priority){
		this.priority = priority;
	}

	public int getPriority(){
		return priority;
	}

	public void setIsFeatured(boolean isFeatured){
		this.isFeatured = isFeatured;
	}

	public boolean isIsFeatured(){
		return isFeatured;
	}
}