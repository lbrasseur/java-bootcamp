package com.globant.tdd.amountToText;

import static org.junit.Assert.*;
import org.junit.Test;

public class CheckAmountToText {

	@Test
	public void checkNumbersWithDecimalToText() {
		Checks check = new Checks(2523.04);
		assertEquals("Check amount: ", "Two thousand five hundred twenty-three and 04/100 dollars",
				EnglishNumberToWords.convertToText(check.getAmount()));
	}
	
	@Test
	public void checkBigNumbersToText() {
		Checks check = new Checks(52192523.24);
		assertEquals("Check amount: ", "Fifty-two million one hundred ninety-two thousand five hundred twenty-three and 24/100 dollars",
				EnglishNumberToWords.convertToText(check.getAmount()));
	}
}