package com.poc.server.model;

public enum AccountState {
	ACTIVE("Active"),
	INACTIVE("Inactive"),
	LOCKED("Locked"),
	DELETED("Deleted");
	
	private String state;
	
	private AccountState(final String state){
		System.err.println(state);
		this.state = state;
	}
	
	public String getState(){
		return this.state;
	}
	
	public String getName(){
		return this.name();
	}
	
	public String toString(){
		return this.state;
	}
}

