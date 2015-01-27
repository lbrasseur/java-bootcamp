package com.globant.classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ShoppingCarts {

	private final Clients client;
	private final String date;
	private List <Items> items;
	private List <Offers> offers;
	private double cartPrice;
	private final int transactionNumber;
	private PaymentTypes paymentType;
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public ShoppingCarts(Clients client, Date date) {
		this.client = client;
		this.date = dateFormat.format(date);
		this.items = new ArrayList<Items>();
		this.offers = new ArrayList<Offers>();
		new TransactionNumber();
		this.transactionNumber = TransactionNumber.getTransactionNumber();
	}
	
	public ShoppingCarts(Clients client, Date date, List <Items> items, List <Offers> offers,
			double cartPrice, PaymentTypes paymentType) {
		this.client = client;
		this.date = dateFormat.format(date);
		this.items = items;
		this.offers = offers;
		this.cartPrice = cartPrice;
		this.paymentType = paymentType;
		new TransactionNumber();
		this.transactionNumber = TransactionNumber.getTransactionNumber();
	}

	/**
	 * Add items to cart shop.
	 * @param item
	 */
	public void addItem(Items item){
		this.items.add(item);
		sortItemsList();
		updateCartPrice();
	}
	
	/**
	 * Remove items from cart shop.
	 * @param item
	 */
	public void removeItem(Items item){
		if(items.contains(item)){
			this.items.remove(item);
			sortItemsList();
			updateCartPrice();
		}
	}
	
	/**
	 * IMPORTANT: THIS METHOD IS STILL UNDER CUNSTRUCTION
	 * Add offer to cart
	 * @param offer
	 */
	public void addOffer(Offers offer){
		this.offers.add(offer);
	}
	
	/**
	 * IMPORTANT: THIS METHOD IS STILL UNDER CUNSTRUCTION
	 * Remoe offer from cart
	 * @param offer
	 */
	public void removeOffer(Offers offer){
		this.offers.remove(offer);
	}
	
	
	/**
	 * Update cart price when a transaction is executed.
	 */
	private void updateCartPrice(){
		
	//If payment type is credit card and cart has 5 or more items, then apply discount. Else do not apply discount.
		if(this.paymentType.getDescription().equalsIgnoreCase("Credit Card") && this.items.size() >= 5){ 
			cartPrice =  getTotalItemsPrice()*(1-paymentType.getDiscount());
			System.out.println("Final cart price with discount by paying by credit card: $"+this.cartPrice);
		}else if(this.paymentType.getDescription().equalsIgnoreCase("Credit Card")){
			this.cartPrice = getTotalItemsPrice();
			System.out.println("By credit card Cart price: $"+getTotalItemsPrice());
		}
		
	//If payment type is Paypal and cart has 5 or more items, then apply discount. Else do not apply discount.
		if(this.paymentType.getDescription().equalsIgnoreCase("Paypal") && this.items.size() >= 5){
			this.cartPrice = getTotalItemsPrice()-this.items.get(0).getPrice();
			System.out.println("Final cart price with discount by paying by paypal: $"+ this.cartPrice);
		}else if(this.paymentType.getDescription().equalsIgnoreCase("Paypal") ){
			this.cartPrice = getTotalItemsPrice();
			System.out.println("By Paypal Cart price: $"+getTotalItemsPrice());
		}
		
	//If payment type is Cash and cart has 5 or more items, then apply discount. Else do not apply discount.
		if(this.paymentType.getDescription().equalsIgnoreCase("Cash") && this.items.size() >= 5){
			this.cartPrice = getTotalItemsPrice()-((1-paymentType.getDiscount())*this.items.get(items.size()-1).getPrice());
			System.out.println("Final cart price with discount by paying by cash: $"+ this.cartPrice);
		}else if(this.paymentType.getDescription().equalsIgnoreCase("Cash") ){
			this.cartPrice = getTotalItemsPrice();
			System.out.println("By Cash Cart price: $"+getTotalItemsPrice());
		}
	}
	
	/**
	 * Sorts the items in the shopping cart from cheapest to most expensive.
	 */
	private void sortItemsList(){
		Collections.sort(this.items, new Comparator<Items>(){ // Order list by price from lower to upper
			@Override
			public int compare(Items i1, Items i2){
				return new Double(i1.getPrice()).compareTo(new Double(i2.getPrice()));
			}
		});
	}
	
	/**
	 * Get sum of all the items on the cart
	 * @param List of items
	 * @return itemsPrice
	 */
	private double getTotalItemsPrice(){
		double itemsPrice=0;
		for(Items item : this.items){
			itemsPrice += item.getPrice();
		}
		return itemsPrice;
	}
	
	
	public Clients getClient() {
		return client;
	}
	
	public String getDate() {
		return date;
	}

	public List <Items> getItems() {
		return items;
	}

	public List <Offers> getOffers() {
		return offers;
	}

	public double getCartPrice() {
		return cartPrice;
	}

	public int getTransactionNumber() {
		return transactionNumber;
	}

	public PaymentTypes getPaymentType() {
		return paymentType;
	}

	public void setItems(ArrayList<Items> items) {
		this.items = items;
	}

	public void setOffers(ArrayList<Offers> offers) {
		this.offers = offers;
	}

	public void setCartPrice(double cartPrice) {
		this.cartPrice = cartPrice;
	}

	public void setPaymentType(PaymentTypes paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "ShoppingCarts\n\t" + client + "\n\tDate: " + date
				+ "\n\tItems: " + items + "\n\tOffers: " + offers + "\n\tCart Price: "
				+ cartPrice + "\n\t" + paymentType+"\n\tTransaction Number: "+transactionNumber;
	}
}
