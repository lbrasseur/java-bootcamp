package com.globant.bootcamp;

public class PersonFactory {
	public Person createPerson(String firstName, String lastName, Person father) {
		return new PersonImpl(firstName, lastName, father);
	}
}
