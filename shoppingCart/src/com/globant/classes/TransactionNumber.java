package com.globant.classes;

public class TransactionNumber {
	private static int TRANSACTIONNUMBER;
	
	public TransactionNumber(){
		TRANSACTIONNUMBER++;
	}
	public static int getTransactionNumber(){
		return TRANSACTIONNUMBER;
	}
}
