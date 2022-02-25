package com.tns.framework;

public abstract class BankAccount  {

	private static int accNo;
	private static String accNm;
	protected static float accBal;
	
		
		public void  withdraw() {
		
		}
		public BankAccount(int accNo, String accNm, float accBal) {
			
			BankAccount.accNo = accNo;
			BankAccount.accNm = accNm;
			BankAccount.accBal = accBal;
		
		}
		
		
		public int getAccNo() {
			return accNo;
		}
		
		
		public void setAccNm(String accNm) {
			BankAccount.accNm = accNm;
		}
		public float getAccBal() {
			return accBal;
		}
		
		public float deposite() {
			return 0;
			
		}
		
		
		
		@Override
		public String toString() {
			return "BankAccount [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
		}

}
