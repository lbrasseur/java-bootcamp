package com.matin.shopping.cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		int menuOption = 100;
		User newUser = null;
		Item newItem = null;
		List<Item> itemList;
		itemList = new ArrayList<>();
		
		Cart cart = new Cart();
		PaymentManager paymentManager = new PaymentManager();
		
		
		while(menuOption != 0){
			
			System.out.println("****** Test Menu ******");
			System.out.println("");
			System.out.println("1- Enter User");
			System.out.println("2- Show User Info");
			System.out.println("3- Add Item");
			System.out.println("4- List of Items");
			System.out.println("5- Add Offer");
			System.out.println("6- Show Offers");
			System.out.println("7- Show Cart");
			System.out.println("0- Exit");
			System.out.println("");
			System.out.println("***********************");
			System.out.println("");
			System.out.println("Chose an option");
			menuOption = keyboard.nextInt();
			System.out.println("");
			
			switch(menuOption){
			
				case 1: 
						String fullName;
						String userMail;
						String userId;
						String userPass;
						System.out.println("****** Enter User ******");
						System.out.println("Type the full Name");
						fullName = keyboard.nextLine();
						System.out.println("Type the user ID");
						userId = keyboard.nextLine();
						System.out.println("Type the user Password");
						userPass = keyboard.nextLine();
						System.out.println("Type the user E-Mail");
						userMail = keyboard.nextLine();
						newUser = new User(userId, userPass, userMail, fullName);
						menuOption = 100;
						break;
				
				case 2: 
						if (newUser != null){
							System.out.println("User Name is: " + newUser.getUserFullName());
							System.out.println("User Id is: " + newUser.getUserId());
							System.out.println("User Password is: " + newUser.getUserPass());
							System.out.println("User Mail is: " + newUser.getUserMail());
						}
						menuOption = 100;
						break;
						
				case 3:
						String itemName;
						float itemPrice;
						int itemQuant;
						String offerAnswer;
						boolean itemOffer;
						int itemId;
						System.out.println("****** Enter Item Info ******");
						System.out.println("Enter Item Description");
						itemName = keyboard.nextLine();
						System.out.println("Enter the item price");
						itemPrice = keyboard.nextFloat();
						System.out.println("Enter the item quantity");
						itemQuant = keyboard.nextInt();
						System.out.println("Is this item in offer? (s/n)");
						offerAnswer = keyboard.nextLine();
						if (offerAnswer == "s"){
							itemOffer = true;
						}
						else{
							itemOffer = false;
						}
						itemId = 1+itemList.size();
						newItem = new Item(itemName, itemPrice, itemQuant, itemOffer, itemId);
						itemList.add(newItem);
						menuOption = 100;
						break;
						
				case 4:
						for (int i = 0; i < itemList.size(); i++){
							System.out.println("Item "+itemList.get(i).getItemName()+"....... $ "+itemList.get(i).getItemPrice());
						}
						menuOption = 100;
						break;
						
				case 5:
						
				
				case 7:
						String checkoutAnswer;
						int paymentOption;
						System.out.println("****** Cart ******");
						for (int i = 0; i < cart.getItems().size(); i++){
							System.out.println("Item "+cart.getItems().get(i).getItemName()+"....... $ "+cart.getItems().get(i).getItemPrice());
						}
						System.out.println("Subtotal: "+cart.getFinalPrice());
						System.out.println("******************");
						System.out.println("Proced check out? (s/n)");
						checkoutAnswer = keyboard.nextLine();
						if (checkoutAnswer == "s"){
							System.out.println("****** Payment ******");
							System.out.println("1- Cash");
							System.out.println("2- Credit Card");
							System.out.println("3- Paypal");
							System.out.println("");
							System.out.println("Select a Payment method");
							paymentOption = keyboard.nextInt();
							paymentManager.Payment(paymentOption, cart.getFinalPrice());
						}
						else{
							menuOption = 100;
							break;
						}
						menuOption = 100;
						break;
			}
		}
	}
}
