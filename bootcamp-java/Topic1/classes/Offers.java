package classes;

public class Offers {
	
	private String description;
	private double price;
	
	public Offers(){
		
	}

	public Offers(String description, double price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Offers [description=" + description + ", price=" + price + "]";
	}
	
	
}
