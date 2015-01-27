package com.globant.classes;

public class Clients implements Person {
	
	private final String name, surname;
	private String shippingAddress, telephone, email;
	private boolean mailist = false;
	
	public Clients(String name, String surname, String shippingAddress,
			String telephone, String email, boolean mailist) {
		super();
		this.name = name;
		this.surname = surname;
		this.shippingAddress = shippingAddress;
		this.telephone = telephone;
		this.email = email;
		this.mailist = mailist;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public String getShippingAddress() {
		return shippingAddress;
	}

	@Override
	public String getTelephone() {
		return telephone;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public boolean getMailist() {
		return mailist;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMailist(boolean mailist) {
		this.mailist = mailist;
	}

	@Override
	public String toString() {
		return "Client\n\tName: " + name + "\n\tSurname: " + surname
				+ "\n\tShipping Address: " + shippingAddress + "\n\tTelephone: "
				+ telephone + "\n\tE-mail: " + email + "\n\tMailist: " + mailist;
	}
	
}
