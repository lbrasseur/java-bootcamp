package com.globant.bootcamp;

public class PersonImpl implements Person {
	private final String firstName;
	private final String lastName;
	private final Person father;

	public PersonImpl(String firstName, String lastName, Person father) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.father = father;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public Person getFather() {
		return father;
	}
}
