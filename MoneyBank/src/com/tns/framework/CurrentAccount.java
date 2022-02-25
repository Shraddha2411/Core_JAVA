package com.tns.framework;

public abstract class CurrentAccount extends BankAccount {
	
	public CurrentAccount(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}
	private final float creditLimit;
	public static void main(String[] args) {
		
	}
	private synchronized float getCreditLimit() {
		return creditLimit;
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
}