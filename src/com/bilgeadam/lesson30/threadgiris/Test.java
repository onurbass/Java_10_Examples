package com.bilgeadam.lesson30.threadgiris;

public class Test {
public static void main(String[] args) {
	Calisan calisan = new Calisan("Onur");
	Calisan calisan2 = new Calisan("Mustafa");
	calisan.start();
	calisan2.start();
	
	calisan.calis();
	calisan2.calis();
}
}
