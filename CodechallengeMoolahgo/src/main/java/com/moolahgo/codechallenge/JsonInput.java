package com.moolahgo.codechallenge;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonInput {
	
	
	  private String rcode;
	  
	public JsonInput(String  rcode) {
		super();
		
		this.rcode =  rcode;
	}
	public JsonInput() {
		super();
	}
	
	public String getRcode() {
		return rcode;
	}
	public void setRcode(String rcode) {
		this.rcode =  rcode;
	} 
	  
	
	  
	  


}
