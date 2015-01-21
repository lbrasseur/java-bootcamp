package classes;

import java.util.Date;
import java.util.ArrayList;
import classes.Products;

public class ShoppingCart {
	
	private int userCode, productCode, offerCode, trasNum;
	private Date date;
	private float prodQty;
	private boolean state = true;
	private ArrayList <Products> cart;
	
	public ShoppingCart(){
		
	}

	public ShoppingCart(int userCode, int productCode, int offerCode,
			int trasNum, Date date, float prodQty, boolean state, ArrayList<Products> cart) {
		super();
		this.userCode = userCode;
		this.productCode = productCode;
		this.offerCode = offerCode;
		this.trasNum = trasNum;
		this.date = date;
		this.prodQty = prodQty;
		this.state = state;
		this.setCart(cart);
	}
	
	

	public int getUserCode() {
		return userCode;
	}

	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public int getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(int offerCode) {
		this.offerCode = offerCode;
	}

	public int getTrasNum() {
		return trasNum;
	}

	public void setTrasNum(int trasNum) {
		this.trasNum = trasNum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getProdQty() {
		return prodQty;
	}

	public void setProdQty(float prodQty) {
		this.prodQty = prodQty;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public ArrayList <Products> getCart() {
		return cart;
	}

	public void setCart(ArrayList <Products> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "ShoppingCart [userCode=" + userCode + ", productCode="
				+ productCode + ", offerCode=" + offerCode + ", trasNum="
				+ trasNum + ", date=" + date + ", prodQty=" + prodQty
				+ ", state=" + state + ", cart=" + cart + "]";
	}
	
}
