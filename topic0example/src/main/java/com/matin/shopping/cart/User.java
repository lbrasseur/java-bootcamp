package com.matin.shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private final String userId;
	private final String userPass;
	private final String userMail;
	private final String userFullName;
	
	private final List<Payments> transaccions;
	
	public User(){
		transaccions = new ArrayList<>();
	}

}
