package com.example.demo.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document("user")
public class User {
	
	@Id
	@NotNull
	@NotEmpty
	@NotBlank
	private String userId;
	
	@NotNull
	@NotEmpty
	private String firstName;
	@NotNull
	@NotEmpty
	private String sirName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	@NotNull
	@NotEmpty
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
