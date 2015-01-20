package classes;
import java.util.ArrayList;
import java.util.Scanner;

import classes.Products;
//import classes.ShoppingCart;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ATTRIBUTES
		boolean appOn=false;
		Scanner sc = new Scanner(System.in);
		int selection;
		ArrayList <Products> carrito = new ArrayList <Products> ();
		ArrayList<Products> products = new ArrayList<Products>();
		products.add(new Products("Item 1", 100));
		products.add(new Products("Item 2", 150));
		products.add(new Products("Item 3", 200));
//		ShoppingCart shoppCart = new ShoppingCart();
//		int transactionNum = 0;
		
		System.out.println("Select an option:\n\t1- Buy something\n\t2- Exit");	// MAIN SYSTEM PAGE
		selection = sc.nextInt();
		switch (selection) {
			case 1: System.out.println("Your selection was Option 1\n");
				appOn = true;
				break;
			case 2: System.out.println("Your selection was Option 2. Good Bye!!!\n");
				appOn = false;
				break;
			default:
				System.out.println("Please select a valid option.\n");
				break;
		}
		
		while (appOn == true){
			System.out.println("What do you want to buy?\n");
			System.out.println("\t1- View our special offers!");
			int i = 2;
			for(Products p : products) {
				System.out.println("\t"+i+"- "+p.toString());
				i++;
			}
			System.out.println("\t5- That is all. List the products in my cart");
			System.out.println("\t6- Exit");
			selection = sc.nextInt();
			switch (selection) {
				case 1:
					System.out.println("We are working on new offers.\nPlease, come back latter and enjoy our special offers!\n");
					break;
				case 2:
					carrito.add(products.get(0));
					System.out.println("The product: '"+products.get(0).getDescription()+"' was added to cart.\n");
					break;
				case 3:
					carrito.add(products.get(1));
					System.out.println("The product: '"+products.get(1).getDescription()+"' was added to cart.\n");
					break;
				case 4:
					carrito.add(products.get(2));
					System.out.println("The product: '"+products.get(2).getDescription()+"' was added to cart.\n");
					break;
				case 5:
					System.out.println("Total products in cart: "+carrito.size());
					for (Products p : carrito){
						System.out.println("\t-> "+p.toString());
					}
					break;
				case 6:
					System.out.println("Thanks for visiting us!");
					appOn = false;
					break;
				default:
					System.out.println("Please select a valid option.");
					break;
			}
		}
		sc.close();
	}
}
