package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
System.out.println("Sayı giriniz");

	int sayi1= scanner.nextInt();
	int fakt=1;
	
	for (int i = 1; i <= sayi1; i++) {
		
		fakt*=i;
		
	}
	System.out.println("Fakt = "+fakt);
	}

}
