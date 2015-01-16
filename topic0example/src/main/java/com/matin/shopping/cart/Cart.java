package com.matin.shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private final List<Item> items;
	private String paymentForm;
	private boolean isOffer;
	private boolean isDiscount;
	private float finalPrice;
	private int nroTrans;
	private String transDate;

	public Cart() {
		items = new ArrayList<>();
	}

	public List<Item> getItems() {
		return items;
	}

	public String getPaymentForm() {
		return paymentForm;
	}

	public void setPaymentForm(String paymentForm) {
		this.paymentForm = paymentForm;
	}

	public boolean isOffer() {
		return isOffer;
	}

	public void setOffer(boolean isOffer) {
		this.isOffer = isOffer;
	}

	public boolean isDiscount() {
		return isDiscount;
	}

	public void setDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}

	public float getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(float finalPrice) {
		this.finalPrice = finalPrice;
	}

	public int getNroTrans() {
		return nroTrans;
	}

	public void setNroTrans(int nroTrans) {
		this.nroTrans = nroTrans;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

}
