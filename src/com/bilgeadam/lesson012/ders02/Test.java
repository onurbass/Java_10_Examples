package com.bilgeadam.lesson012.ders02;

public class Test {
	double balance;
	static double intRate = 0.05;
	int no;

	public double getInterestRate() {

		return balance * intRate;
	}

	public void getAccountInformation() {
		
		System.out.println(no + " numaralı faiz hesabının faiz getirisi = " + getInterestRate());

	}
}
