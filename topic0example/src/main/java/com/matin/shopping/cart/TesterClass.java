package com.matin.shopping.cart;

import java.io.IOException;
import java.util.Scanner;

public class TesterClass {

	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		int menuOption = 100;
		User newUser = null;		
		while(menuOption != 0){
			
			System.out.println("******Test Menu******");
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
			System.out.println("*********************");
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
						System.out.println("******Enter User******");
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
			}
		}
		

	}
}
