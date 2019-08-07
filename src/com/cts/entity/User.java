package com.cts.entity;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message="UserId can not be blank")
	private String userid;
	
	private String username;
	
	@Size(min=3,max=8)
	private String password;
	
	private String usertype;
	
	@Email
	private String email;
	private String mobileNumber;
	private String Status;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", usertype=" + usertype
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", Status=" + Status + "]";
	}
	
	

}
