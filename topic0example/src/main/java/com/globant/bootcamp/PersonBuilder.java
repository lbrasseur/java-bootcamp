package com.globant.bootcamp;

public class PersonBuilder {
	private String firstName;
	private String lastName;
	private Person father;

	public PersonBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public PersonBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public PersonBuilder withFather(Person father) {
		this.father = father;
		return this;
	}

	public Person build() {
		return new PersonFactory().createPerson(firstName, lastName, father);
	}
}
