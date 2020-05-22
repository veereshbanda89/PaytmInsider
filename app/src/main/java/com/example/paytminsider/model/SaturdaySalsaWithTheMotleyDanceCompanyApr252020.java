package com.example.paytminsider.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SaturdaySalsaWithTheMotleyDanceCompanyApr252020{

	@SerializedName("venue_name")
	private String venueName;

	@SerializedName("city")
	private String city;

	@SerializedName("type")
	private String type;

	@SerializedName("applicable_filters")
	private List<String> applicableFilters;

	@SerializedName("venue_date_string")
	private String venueDateString;

	@SerializedName("category_id")
	private CategoryId categoryId;

	@SerializedName("model")
	private String model;

	@SerializedName("favStats")
	private FavStats favStats;

	@SerializedName("horizontal_cover_image")
	private String horizontalCoverImage;

	@SerializedName("slug")
	private String slug;

	@SerializedName("venue_id")
	private String venueId;

	@SerializedName("venue_geolocation")
	private VenueGeolocation venueGeolocation;

	@SerializedName("price_display_string")
	private String priceDisplayString;

	@SerializedName("event_state")
	private String eventState;

	@SerializedName("purchase_visibility")
	private String purchaseVisibility;

	@SerializedName("is_rsvp")
	private boolean isRsvp;

	@SerializedName("tags")
	private List<TagsItem> tags;

	@SerializedName("min_price")
	private int minPrice;

	@SerializedName("group_id")
	private GroupId groupId;

	@SerializedName("min_show_start_time")
	private int minShowStartTime;

	@SerializedName("name")
	private String name;

	@SerializedName("vertical_cover_image")
	private String verticalCoverImage;

	@SerializedName("_id")
	private String id;

	@SerializedName("communication_strategy")
	private String communicationStrategy;

	@SerializedName("popularity_score")
	private double popularityScore;

	public void setVenueName(String venueName){
		this.venueName = venueName;
	}

	public String getVenueName(){
		return venueName;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setApplicableFilters(List<String> applicableFilters){
		this.applicableFilters = applicableFilters;
	}

	public List<String> getApplicableFilters(){
		return applicableFilters;
	}

	public void setVenueDateString(String venueDateString){
		this.venueDateString = venueDateString;
	}

	public String getVenueDateString(){
		return venueDateString;
	}

	public void setCategoryId(CategoryId categoryId){
		this.categoryId = categoryId;
	}

	public CategoryId getCategoryId(){
		return categoryId;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getModel(){
		return model;
	}

	public void setFavStats(FavStats favStats){
		this.favStats = favStats;
	}

	public FavStats getFavStats(){
		return favStats;
	}

	public void setHorizontalCoverImage(String horizontalCoverImage){
		this.horizontalCoverImage = horizontalCoverImage;
	}

	public String getHorizontalCoverImage(){
		return horizontalCoverImage;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setVenueId(String venueId){
		this.venueId = venueId;
	}

	public String getVenueId(){
		return venueId;
	}

	public void setVenueGeolocation(VenueGeolocation venueGeolocation){
		this.venueGeolocation = venueGeolocation;
	}

	public VenueGeolocation getVenueGeolocation(){
		return venueGeolocation;
	}

	public void setPriceDisplayString(String priceDisplayString){
		this.priceDisplayString = priceDisplayString;
	}

	public String getPriceDisplayString(){
		return priceDisplayString;
	}

	public void setEventState(String eventState){
		this.eventState = eventState;
	}

	public String getEventState(){
		return eventState;
	}

	public void setPurchaseVisibility(String purchaseVisibility){
		this.purchaseVisibility = purchaseVisibility;
	}

	public String getPurchaseVisibility(){
		return purchaseVisibility;
	}

	public void setIsRsvp(boolean isRsvp){
		this.isRsvp = isRsvp;
	}

	public boolean isIsRsvp(){
		return isRsvp;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	public void setMinPrice(int minPrice){
		this.minPrice = minPrice;
	}

	public int getMinPrice(){
		return minPrice;
	}

	public void setGroupId(GroupId groupId){
		this.groupId = groupId;
	}

	public GroupId getGroupId(){
		return groupId;
	}

	public void setMinShowStartTime(int minShowStartTime){
		this.minShowStartTime = minShowStartTime;
	}

	public int getMinShowStartTime(){
		return minShowStartTime;
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

	public void setCommunicationStrategy(String communicationStrategy){
		this.communicationStrategy = communicationStrategy;
	}

	public String getCommunicationStrategy(){
		return communicationStrategy;
	}

	public void setPopularityScore(double popularityScore){
		this.popularityScore = popularityScore;
	}

	public double popularityScore(){
		return popularityScore;
	}
}