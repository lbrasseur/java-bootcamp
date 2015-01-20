package com.tdd.tests;

import org.junit.Test;

import junit.framework.TestCase;

public class _Test1 extends TestCase {
	@Test
	  public void ConverssionTest() {
		  	assertEquals("zero", NumberToWords.convert(0));
		    assertEquals("one", NumberToWords.convert(1));
		    assertEquals("sixteen", NumberToWords.convert(16));
		    assertEquals("one hundred", NumberToWords.convert(100));
		    assertEquals("one hundred eighteen", NumberToWords.convert(118));
		    assertEquals("two hundred", NumberToWords.convert(200));
		    assertEquals("two hundred nineteen", NumberToWords.convert(219));
		    assertEquals("eight hundred", NumberToWords.convert(800));
		    assertEquals("eight hundred one", NumberToWords.convert(801));
		    assertEquals("one thousand three hundred sixteen", NumberToWords.convert(1316));
		    assertEquals("one million", NumberToWords.convert(1000000));;
		    assertEquals("two millions", NumberToWords.convert(2000000));
		    assertEquals("three millions two hundred", NumberToWords.convert(3000200));
		    assertEquals("seven hundred thousand", NumberToWords.convert(700000));
		    assertEquals("nine millions", NumberToWords.convert(9000000));
		    assertEquals("nine millions one thousand", NumberToWords.convert(9001000));
		    assertEquals("one hundred twenty three millions four hundred", NumberToWords.convert(123456789));
		    assertEquals("two billion one hundred forty seven millions", NumberToWords.convert(2147483647));
		    assertEquals("three billion ten", NumberToWords.convert(3000000010L));
	  }
}
