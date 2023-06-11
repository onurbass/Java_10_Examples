package com.bilgeadam.lesson003;

import java.util.Iterator;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("sayı gir");
		
		int sayi1 = scanner.nextInt();
		
		int toplam =0;
		
		for (int i = 0; i <= sayi1; i++) {
			
			int a = (i%2==0)?(i):(0);
			
			toplam+=a;
		}
		
System.out.println("Çift toplam= "+toplam);
	}

}
