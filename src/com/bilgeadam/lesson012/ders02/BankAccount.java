package com.bilgeadam.lesson012.ders02;

public class BankAccount {

	
	
	public static void main(String[] args) {
		
		Test acc1=new Test();
		acc1.balance=100;
		acc1.no=1;
		Test acc2=new Test();
		acc2.balance=550;
		acc2.no=2;
		
		acc1.getAccountInformation();
		acc2.getAccountInformation();
		
	}
}
