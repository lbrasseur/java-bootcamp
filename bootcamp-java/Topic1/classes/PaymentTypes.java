package classes;

public class PaymentTypes {
	
	private String description;
	private float discount;
	
	public PaymentTypes(){
		
	}

	public PaymentTypes(String description, float discount) {
		super();
		this.description = description;
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "PaymentTypes [description=" + description + ", discount="
				+ discount + "]";
	}
	
	
}
