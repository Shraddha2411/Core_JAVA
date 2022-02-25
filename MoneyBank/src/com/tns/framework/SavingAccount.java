package com.tns.framework;

public abstract class SavingAccount extends BankAccount {
	
	private int isSalaried;



	public SavingAccount( int AccNo, String accNm, float accBal, float isSalaried) {
		super(AccNo, accNm, isSalaried);
	}
	
	private static boolean isSalary() {
		return isSalary();
		
	}
	private int getIsSalaried() {
		return isSalaried;
	}

	

	private static final float MINBAL(){
	return MINBAL();
		
	}
		
	
	@Override
	public void withdraw() {
		
		super.withdraw();
	}

	public static void main(String[] args) {
		

	}



	public SavingAccount(int accNo, int accNm, int accBal, int isSalaried) {
		super(accNo, null, isSalaried);
		int AccNo = accNo;
		BankAccount.accBal = accBal;
		this.isSalaried = isSalaried;
	}
	
	
	



	@Override
	public String toString() {
		
		return super.toString();
		
		
	}

}
