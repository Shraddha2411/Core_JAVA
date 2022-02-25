package com.tns.framework;

public abstract class BankFactory {
public abstract SavingAccount getNewSavingAccount(int AccNo, String accNm, float accBal, float isSalarised);

public abstract CurrentAccount getNewCurrentAccount(int AccNo, String accNm, float accBal, float CreditLimit);
	public static void main(String[] args) {
		
	}
		
 
	
}