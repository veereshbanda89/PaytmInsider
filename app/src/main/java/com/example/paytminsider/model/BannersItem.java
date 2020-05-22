package com.example.paytminsider.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class BannersItem implements Parcelable {

	@SerializedName("is_internal")
	private boolean isInternal;

	@SerializedName("category_id")
	private CategoryId categoryId;

	@SerializedName("display_details")
	private DisplayDetails displayDetails;

	@SerializedName("group_id")
	private GroupId groupId;

	@SerializedName("map_link")
	private String mapLink;

	@SerializedName("name")
	private String name;

	@SerializedName("vertical_cover_image")
	private String verticalCoverImage;

	@SerializedName("_id")
	private String id;

	@SerializedName("type")
	private String type;

	@SerializedName("priority")
	private int priority;

	@SerializedName("description")
	private String description;

	protected BannersItem(Parcel in) {
		name = in.readString();
		verticalCoverImage = in.readString();
		categoryId = in.readParcelable(CategoryId.class.getClassLoader());
	}

	public static final Creator<BannersItem> CREATOR = new Creator<BannersItem>() {
		@Override
		public BannersItem createFromParcel(Parcel in) {
			return new BannersItem(in);
		}

		@Override
		public BannersItem[] newArray(int size) {
			return new BannersItem[size];
		}
	};

	public void setIsInternal(boolean isInternal){
		this.isInternal = isInternal;
	}

	public boolean isIsInternal(){
		return isInternal;
	}

	public void setCategoryId(CategoryId categoryId){
		this.categoryId = categoryId;
	}

	public CategoryId getCategoryId(){
		return categoryId;
	}

	public void setDisplayDetails(DisplayDetails displayDetails){
		this.displayDetails = displayDetails;
	}

	public DisplayDetails getDisplayDetails(){
		return displayDetails;
	}

	public void setGroupId(GroupId groupId){
		this.groupId = groupId;
	}

	public GroupId getGroupId(){
		return groupId;
	}

	public void setMapLink(String mapLink){
		this.mapLink = mapLink;
	}

	public String getMapLink(){
		return mapLink;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setVerticalCoverImage(String verticalCoverImage){
		this.verticalCoverImage = verticalCoverImage;
	}

	public String getVerticalCoverImage(){
		return verticalCoverImage;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setPriority(int priority){
		this.priority = priority;
	}

	public int getPriority(){
		return priority;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeValue(this.isInternal);
		parcel.writeValue(this.categoryId);
		parcel.writeValue(this.verticalCoverImage);
		parcel.writeString(this.name);
	}
}