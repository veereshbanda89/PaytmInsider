package com.example.paytminsider.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class EventsResponse implements Parcelable {

	@SerializedName("featured")
	private List<FeaturedItem> featured;

	@SerializedName("groups")
	private List<String> groups;

	@SerializedName("picks")
	private Picks picks;

	@SerializedName("dates")
	private Dates dates;

	@SerializedName("filters")
	private Filters filters;

	@SerializedName("sorters")
	private Sorters sorters;

	@SerializedName("text")
	private Text text;

	@SerializedName("list")
	private EventsList list;

	@SerializedName("popular")
	private List<PopularItem> popular;

	@SerializedName("banners")
	private ArrayList<BannersItem> banners;

	@SerializedName("tags")
	private List<String> tags;

	protected EventsResponse(Parcel in) {
//		Bundle b = in.readBundle(BannersItem.class.getClassLoader());
//		banners = b.getParcelableArrayList("banners");
		this.banners = new ArrayList<BannersItem>();
		in.readList(this.banners, BannersItem.class.getClassLoader());
		groups = in.createStringArrayList();
//		this.banners = new ArrayList<BannersItem>();
//		banners = new ArrayList<BannersItem>();
//		banners = in.createTypedArrayList(BannersItem.CREATOR);
//		in.readList(this.banners, BannersItem.class.getClassLoader());
//		banners = in.readTypedList(banners,BannersItem.CREATOR);
		tags = in.createStringArrayList();
	}

	public static final Creator<EventsResponse> CREATOR = new Creator<EventsResponse>() {
		@Override
		public EventsResponse createFromParcel(Parcel in) {

			/*EventsResponse eventsResponse = new EventsResponse();
			Bundle b = in.readBundle(BannersItem.class.getClassLoader());
			eventsResponse.banners = b.getParcelableArrayList("banners");*/
			return new EventsResponse(in);
		}

		@Override
		public EventsResponse[] newArray(int size) {
			return new EventsResponse[size];
		}
	};

	public void setFeatured(List<FeaturedItem> featured){
		this.featured = featured;
	}

	public List<FeaturedItem> getFeatured(){
		return featured;
	}

	public void setGroups(List<String> groups){
		this.groups = groups;
	}

	public List<String> getGroups(){
		return groups;
	}

	public void setPicks(Picks picks){
		this.picks = picks;
	}

	public Picks getPicks(){
		return picks;
	}

	public void setDates(Dates dates){
		this.dates = dates;
	}

	public Dates getDates(){
		return dates;
	}

	public void setFilters(Filters filters){
		this.filters = filters;
	}

	public Filters getFilters(){
		return filters;
	}

	public void setSorters(Sorters sorters){
		this.sorters = sorters;
	}

	public Sorters getSorters(){
		return sorters;
	}

	public void setText(Text text){
		this.text = text;
	}

	public Text getText(){
		return text;
	}

	public void setList(EventsList list){
		this.list = list;
	}

	public EventsList getList(){
		return list;
	}

	public void setPopular(List<PopularItem> popular){
		this.popular = popular;
	}

	public List<PopularItem> getPopular(){
		return popular;
	}

	public void setBanners(ArrayList<BannersItem> banners){
		this.banners = banners;
	}

	public ArrayList<BannersItem> getBanners(){
		return banners;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		/*Bundle b = new Bundle();
		b.putParcelableArrayList("banners", banners);
		parcel.writeBundle(b);*/
		parcel.writeList(this.banners);
		parcel.writeList(groups);
		parcel.writeList(tags);
	}
}