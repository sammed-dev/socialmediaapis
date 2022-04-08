package com.datagrokr.mediaapi.model;

public class Profile {

	private Long id;
	private String firstName;
	private String lastName;
	private String relationship;
	
	public Profile() {
		
	}
	
	public Profile(String firstName, String lastName, String relationship) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.relationship = relationship;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	
	
}
