package com.matin.shopping.cart;

import java.util.Scanner;

public class PaymentManager {
	Scanner keyboard = new Scanner(System.in);
	private String paypalId;
	private String paypalPass;
	private final String paymentMethods[];
	private final String discountType[];
	
	public PaymentManager(){
		paymentMethods = new String[] {"Cash","Credit Card","Paypal"};
		discountType = new String[] {"90% expensive by cash","10% by Credit Card","Cheapest is free"};
	}

	public String[] getPaymentMethods() {
		return paymentMethods;
	}

	public String[] getDiscountType() {
		return discountType;
	}
	
	public void Payment(int paymentype, float total){
		switch (paymentype){
			case 1:
					System.out.println("Total: " + total);
					System.out.println("Payment Method: Cash");
					System.out.println("Print this, and go to the store for checkout");
					break;
					
			case 2:
					System.out.println("Total: " + total);
					System.out.println("10% Discount: " + ((total*90)/100));
					System.out.println("Payment Method: Credit Card");
					System.out.println("Enter your Credit Card number");
					CreditCard.setCcNumber(keyboard.nextLine());
					System.out.println("Enter your Credit Card exp Date");
					CreditCard.setCcDate(keyboard.nextLine());
					System.out.println("Enter your Credit Card Code");
					CreditCard.setCcCode(keyboard.nextInt());
					System.out.println("Print this, and go to the store for checkout");
					break;
				
			case 3:
					System.out.println("Total: " + total);
					System.out.println("Payment Method: Paypal");
					System.out.println("Enter your Paypal ID");
					paypalId = keyboard.nextLine();
					System.out.println("Enter your PayPal Password");
					paypalPass = keyboard.nextLine();
					System.out.println("Print this, and go to the store for checkout");
					break;
		}
	}
}
