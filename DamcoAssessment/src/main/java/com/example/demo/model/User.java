package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class User {
	
	@Id
	private String userId;
	private String firstName;
	private String sirName;
	private Date dob;
	private String title;
	
	public User(String userId, String firstName, String sirName, Date dob, String title) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.sirName = sirName;
		this.dob = dob;
		this.title = title;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSirName() {
		return sirName;
	}
	public void setSirName(String sirName) {
		this.sirName = sirName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", sirName=");
		builder.append(sirName);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", title=");
		builder.append(title);
		builder.append("]");
		return builder.toString();
	}
	
}
