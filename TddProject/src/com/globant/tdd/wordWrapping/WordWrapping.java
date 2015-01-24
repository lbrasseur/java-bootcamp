package com.globant.tdd.wordWrapping;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrapping {
	
	public String [] getWrappedWords (WrappedWords ww){
		
		if(ww.getLength()<0){
			String strArray []  = {"Negative row length is not allowed."};
			return strArray;
		}
		
		int arraySize = 0;
		if(ww.getStr().length() % ww.getLength() == 0){
			arraySize = ww.getStr().length()/ww.getLength();
		}else{
			arraySize = ww.getStr().length()/ww.getLength()+1;
		}
		String [] strArray = new String [arraySize];
		int index = 0; // For moving position of rows.
		for(int i = 0; i<ww.getStr().length(); i += ww.getLength()){
			if((i+ww.getLength()) > (ww.getStr().length())){
				strArray[index] = ww.getStr().substring(i, i+(ww.getStr().length()-i));
				return strArray;
			}			
			strArray [index] = ww.getStr().substring(i,i+ww.getLength());
			index++;
		}
		return strArray;
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testStringsEqualToLength() {
		String str = "a b c d e f"; 
		WrappedWords wrappedWords = new WrappedWords(str,11);
		getWrappedWords(wrappedWords);
		assertEquals(new String[] {"a b c d e f"}, getWrappedWords(wrappedWords));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testStringsBiggerThanLength() {
		String str = "Hello world!"; 
		WrappedWords wrappedWords = new WrappedWords(str,5);
		assertEquals(new String[] {"Hello", " worl", "d!"}, getWrappedWords(wrappedWords));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testStringsSmallerThanLength() {
		String str = "Excelent";
		WrappedWords wrappedWords = new WrappedWords(str,100);
		assertEquals(new String[] {"Excelent"}, getWrappedWords(wrappedWords));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testNegativeLengths() {
		String str = "Negative length!";
		WrappedWords wrappedWords = new WrappedWords(str,-10);
		assertEquals(new String[] {"Negative row length is not allowed."}, getWrappedWords(wrappedWords));
	}
}
