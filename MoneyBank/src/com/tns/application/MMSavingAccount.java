package com.tns.application;

import com.tns.framework.SavingAccount;

public abstract class MMSavingAccount extends SavingAccount {

  private MMSavingAccount(int accNo, String accNm, float accBal, float isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}
	private static final float MINBAL() {
		return accBal;
		
	}
	public static void main(String[] args) {
		

	}
	@Override
	public void withdraw() {
		
		super.withdraw();
	}
	@Override
	public String toString() {
		
		return super.toString();
	}

}
