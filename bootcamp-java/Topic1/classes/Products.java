package classes;

public class Products {
	
	private String description;
	private double price;
	
	public Products () {
		
	}

	public Products(String description, double price) {
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
		return description + " ... $" + price;
	}
}
