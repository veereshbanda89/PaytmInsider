package com.example.paytminsider.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class CategoryId implements Parcelable {

	@SerializedName("name")
	private String name;

	@SerializedName("_id")
	private String id;

	@SerializedName("slug")
	private String slug;

	protected CategoryId(Parcel in) {
		name = in.readString();
		id = in.readString();
		slug = in.readString();
	}

	public static final Creator<CategoryId> CREATOR = new Creator<CategoryId>() {
		@Override
		public CategoryId createFromParcel(Parcel in) {
			return new CategoryId(in);
		}

		@Override
		public CategoryId[] newArray(int size) {
			return new CategoryId[size];
		}
	};

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeString(name);
		parcel.writeString(id);
		parcel.writeString(slug);
	}
}