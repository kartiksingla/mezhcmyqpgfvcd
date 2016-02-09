package com.poc.server.model;

public enum UserProfileType {
	ADMIN("ADMIN"),
	DBA("DBA"), 
	USER("USER");
	
	private String profileType;
	
	private UserProfileType(final String profileType){
		this.profileType = profileType;
	}
	
	public String getUserProfileType(){
		return this.profileType;
	}
}
