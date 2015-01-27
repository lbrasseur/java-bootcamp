package com.globant.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import com.globant.classes.Clients;
import com.globant.classes.Items;
import com.globant.classes.Offers;
import com.globant.classes.PaymentTypes;
import com.globant.classes.ShoppingCarts;

import java.util.Date;
import java.util.ArrayList;

public class TestBuySomething {

	Clients client = new Clients("Marcos", "Dalmasso", "Mendoza 849", "4212173","mdalmasso@net-geo.com.ar",true);
	Items item1 = new Items("Item 1",100.55);
	Items item2 = new Items("Item 2",200.55);
	Items item3 = new Items("Item 3",300.55);

	@Test
	public void testBuyingWithCreditCard() {
		PaymentTypes paymentType1 = new PaymentTypes("Credit card", 0.1);

		ShoppingCarts sp1 = new ShoppingCarts(client,new Date(),new ArrayList<Items>(),new ArrayList<Offers>(),
				0,paymentType1);
		
		System.out.println("\n**** ITEMS SP1 ****");
		sp1.addItem(item2);
		sp1.addItem(item1);
		sp1.addItem(item1);
		sp1.addItem(item1);
		sp1.addItem(item3);
		System.out.println("<<<<<< MUESTRA SP1 >>>>>\n"+sp1);
		assertEquals("ShoppingCarts\n\tClient\n\tName: Marcos\n\tSurname: Dalmasso\n\t"
				+ "Shipping Address: Mendoza 849\n\tTelephone: 4212173\n\tE-mail: mdalmasso@net-geo.com.ar"
				+ "\n\tMailist: true\n\tDate: 27/01/2015\n\t"
				+ "Items: [Item 1 ....... $ 100.55, Item 1 ....... $ 100.55, Item 1 ....... $ 100.55, Item 2 ....... $ 200.55, Item 3 ....... $ 300.55]\n\t"
				+ "Offers: []\n\tCart Price: 722.475\n\tPayment Type\n\tDescription: Credit card"
				+ "\n\tDiscount: 10%\n\tTransaction Number: 2", sp1);
	}
	
	@Test
	public void testBuyingWithPaypal() {
		PaymentTypes paymentType2 = new PaymentTypes("Paypal", 1);
		
		ShoppingCarts sp2 = new ShoppingCarts(client,new Date(),new ArrayList<Items>(),null,
				0,paymentType2);
		
		System.out.println("\n**** ITEMS SP2 ****");
		sp2.addItem(item2);
		sp2.addItem(item1);
		sp2.addItem(item1);
		sp2.addItem(item1);
		sp2.addItem(item3);
		sp2.removeItem(item2);
		
		
	}
	
	@Test
	public void testBuyingWithCash() {
		PaymentTypes paymentType3 = new PaymentTypes("Cash", 0.9);
		
		ShoppingCarts sp3 = new ShoppingCarts(client,new Date(),new ArrayList<Items>(),null,
				0,paymentType3);

		System.out.println("\n**** ITEMS SP3 ****");
		sp3.addItem(item2);
		sp3.addItem(item1);
		sp3.addItem(item1);
		sp3.addItem(item1);
		sp3.addItem(item3);
		sp3.removeItem(item2);
	}
}