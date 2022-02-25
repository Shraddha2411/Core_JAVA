package com.tns.application;

import com.tns.framework.CurrentAccount;

public abstract class MMCurrentAccount extends CurrentAccount{

	public MMCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		
	}

	@Override
	public void withdraw() {
		
		super.withdraw();
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	public static void main(String[] args) {
		
	}

}
