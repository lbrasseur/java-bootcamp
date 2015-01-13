package com.globant.bootcamp;

import junit.framework.TestCase;

public class BuilderTest extends TestCase {
	public void testValues() {
		PersonBuilder builder = new PersonBuilder();
		Person homero = builder
				.withFirstName("Homero")
				.withLastName("Simpson")
				.withFather(null)
				.build();
		Person bart = builder
				.withFirstName("Bart")
				.withLastName("Simpson")
				.withFather(homero)
				.build();

		assertEquals("Bart", bart.getFirstName());
		assertEquals("Simpson", bart.getLastName());
		assertEquals(homero, bart.getFather());

		assertEquals("Homero", bart.getFather().getFirstName());
		assertEquals("Simpson", bart.getFather().getLastName());
		assertNull(bart.getFather().getFather());
	}
}
