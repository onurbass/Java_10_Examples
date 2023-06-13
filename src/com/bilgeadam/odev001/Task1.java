package com.bilgeadam.odev001;

import java.util.Iterator;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Üs değeri girin");
		
	int usDeger = scanner.nextInt();
	
	System.out.println("Alt degeri girin");
	
	int altDeger= scanner.nextInt();
	
	int sonuc = 1;
	
	for (int i = 1; i <= usDeger; i++) {
		sonuc*=altDeger;
		
	}
	
	System.out.println("Sonuc = "+sonuc);

	}

}
