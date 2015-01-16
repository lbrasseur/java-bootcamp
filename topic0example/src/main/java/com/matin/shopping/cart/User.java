package com.matin.shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private final String userId;
	private final String userPass;
	private final String userMail;
	private String userFullName;
	
	private final List<Payments> transaccions;
	
	public User(String userId, String userPass, String userMail, String userFullName) {
		this.userId = userId;
		this.userPass = userPass;
		this.userMail = userMail;
		this.userFullName = userFullName;
		transaccions = new ArrayList<>();
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPass() {
		return userPass;
	}

	public String getUserMail() {
		return userMail;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public List<Payments> getTransaccions() {
		return transaccions;
	}

}
