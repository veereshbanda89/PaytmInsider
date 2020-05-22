package com.example.paytminsider.model;

import com.google.gson.annotations.SerializedName;

public class Picks{

	@SerializedName("masterList")
	private MasterList masterList;

	@SerializedName("categorywiseList")
	private CategorywiseList categorywiseList;

	@SerializedName("groupwiseList")
	private GroupwiseList groupwiseList;

	public void setMasterList(MasterList masterList){
		this.masterList = masterList;
	}

	public MasterList getMasterList(){
		return masterList;
	}

	public void setCategorywiseList(CategorywiseList categorywiseList){
		this.categorywiseList = categorywiseList;
	}

	public CategorywiseList getCategorywiseList(){
		return categorywiseList;
	}

	public void setGroupwiseList(GroupwiseList groupwiseList){
		this.groupwiseList = groupwiseList;
	}

	public GroupwiseList getGroupwiseList(){
		return groupwiseList;
	}
}