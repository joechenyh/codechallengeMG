package com.moolahgo.codechallenge;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoData {


	private String owner;
	private String referralcode;
	
	@Override
	public String toString() {
		return "InfoData [owner=" + owner + ", referralcode=" + referralcode + "]";
	}
	


	public InfoData(String owner, String referralcode) {
		super();

		this.owner = owner;
		this.referralcode = referralcode;
	}
	public InfoData() {
		super();
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getReferralcode() {
		return referralcode;
	}
	public void setReferralcode(String referralcode) {
		this.referralcode = referralcode;
	}
	
	


	

}
