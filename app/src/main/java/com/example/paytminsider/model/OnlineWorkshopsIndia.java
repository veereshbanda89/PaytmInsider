package com.example.paytminsider.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class OnlineWorkshopsIndia{

	@SerializedName("summary")
	private String summary;

	@SerializedName("action_button_text")
	private String actionButtonText;

	@SerializedName("horizontalImageCover")
	private String horizontalImageCover;

	@SerializedName("timestamp_added")
	private String timestampAdded;

	@SerializedName("timestamp_modified")
	private String timestampModified;

	@SerializedName("title")
	private String title;

	@SerializedName("created_by")
	private String createdBy;

	@SerializedName("seo_title")
	private String seoTitle;

	@SerializedName("action_button_link")
	private String actionButtonLink;

	@SerializedName("propertyTag")
	private PropertyTag propertyTag;

	@SerializedName("tags")
	private List<TagsItem> tags;

	@SerializedName("category_id")
	private CategoryId categoryId;

	@SerializedName("headerImage")
	private String headerImage;

	@SerializedName("group_id")
	private GroupId groupId;

	@SerializedName("__v")
	private int V;

	@SerializedName("seo_description")
	private String seoDescription;

	@SerializedName("header_type")
	private String headerType;

	@SerializedName("orderIndex")
	private int orderIndex;

	@SerializedName("model")
	private String model;

	@SerializedName("_id")
	private String id;

	@SerializedName("publish_date")
	private String publishDate;

	@SerializedName("horizontal_cover_image")
	private String horizontalCoverImage;

	@SerializedName("slug")
	private String slug;

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setActionButtonText(String actionButtonText){
		this.actionButtonText = actionButtonText;
	}

	public String getActionButtonText(){
		return actionButtonText;
	}

	public void setHorizontalImageCover(String horizontalImageCover){
		this.horizontalImageCover = horizontalImageCover;
	}

	public String getHorizontalImageCover(){
		return horizontalImageCover;
	}

	public void setTimestampAdded(String timestampAdded){
		this.timestampAdded = timestampAdded;
	}

	public String getTimestampAdded(){
		return timestampAdded;
	}

	public void setTimestampModified(String timestampModified){
		this.timestampModified = timestampModified;
	}

	public String getTimestampModified(){
		return timestampModified;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setSeoTitle(String seoTitle){
		this.seoTitle = seoTitle;
	}

	public String getSeoTitle(){
		return seoTitle;
	}

	public void setActionButtonLink(String actionButtonLink){
		this.actionButtonLink = actionButtonLink;
	}

	public String getActionButtonLink(){
		return actionButtonLink;
	}

	public void setPropertyTag(PropertyTag propertyTag){
		this.propertyTag = propertyTag;
	}

	public PropertyTag getPropertyTag(){
		return propertyTag;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	public void setCategoryId(CategoryId categoryId){
		this.categoryId = categoryId;
	}

	public CategoryId getCategoryId(){
		return categoryId;
	}

	public void setHeaderImage(String headerImage){
		this.headerImage = headerImage;
	}

	public String getHeaderImage(){
		return headerImage;
	}

	public void setGroupId(GroupId groupId){
		this.groupId = groupId;
	}

	public GroupId getGroupId(){
		return groupId;
	}

	public void setV(int V){
		this.V = V;
	}

	public int getV(){
		return V;
	}

	public void setSeoDescription(String seoDescription){
		this.seoDescription = seoDescription;
	}

	public String getSeoDescription(){
		return seoDescription;
	}

	public void setHeaderType(String headerType){
		this.headerType = headerType;
	}

	public String getHeaderType(){
		return headerType;
	}

	public void setOrderIndex(int orderIndex){
		this.orderIndex = orderIndex;
	}

	public int getOrderIndex(){
		return orderIndex;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getModel(){
		return model;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPublishDate(String publishDate){
		this.publishDate = publishDate;
	}

	public String getPublishDate(){
		return publishDate;
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
}