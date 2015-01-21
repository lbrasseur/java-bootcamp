package classes;

import java.util.ArrayList;
import classes.Products;

public class Offers {
	
	private String description;
	private float discount;
	private Products product;
	private ArrayList<Products> products;
	
	public Offers(){
		
	}
	
	public Offers(ArrayList<Products> products, String description, float discount){
		this.products = products;
		this.description = description;
		this.discount = discount;
	}
	
	
	/**
	 * @param offer
	 * @return The final price of all products in the cart.
	 */
	public float getProductsOfferPrice(Offers offer){
		float price = 0;
		if(offer.getProducts().size()>0){
			for(Products p : offer.getProducts()){
				price += p.getPrice()*offer.getdiscount();
			}
		}
		return price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getdiscount() {
		return discount;
	}

	public void setdiscount(float discount) {
		this.discount = discount;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public ArrayList<Products> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Offers [description=" + description + ", discount=" + discount
				+ ", product=" + product + ", products=" + products + "]";
	}
	
}
