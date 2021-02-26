package com.moolahgo.codechallenge;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonItem {
	
	
	  private String type;
	  private InfoData infodata;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public InfoData getInfodata() {
		return infodata;
	}
	public void setInfodata(InfoData infodata) {
		this.infodata = infodata;
	}
	public JsonItem(String type, InfoData infodata) {
		super();
		this.type = type;
		this.infodata = infodata;
	}
	public JsonItem() {
		super();
	}
	  
	  


}
