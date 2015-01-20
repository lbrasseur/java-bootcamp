package com.matin.shopping.cart;

public class CreditCard {
	
	private String ccNumber;
	private String ccDate;
	private int ccCode;
	
	public String getCcNumber() {
		return ccNumber;
	}
	public static void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	
	public String getCcDate() {
		return ccDate;
	}
	public static void setCcDate(String ccDate) {
		this.ccDate = ccDate;
	}
	
	public int getCcCode() {
		return ccCode;
	}
	public static void setCcCode(int ccCode) {
		this.ccCode = ccCode;
	}
}
