package com.globant.bootcamp;

import junit.framework.TestCase;

public class FactoryTest extends TestCase {
	public void testValues() {
		PersonFactory factory = new PersonFactory();
		Person homero = factory.createPerson("Homero", "Simpson", null);
		Person bart = factory.createPerson("Bart", "Simpson", homero);

		assertEquals("Bart", bart.getFirstName());
		assertEquals("Simpson", bart.getLastName());
		assertEquals(homero, bart.getFather());

		assertEquals("Homero", bart.getFather().getFirstName());
		assertEquals("Simpson", bart.getFather().getLastName());
		assertNull(bart.getFather().getFather());
	}
}
