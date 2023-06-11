package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz");
		int sayi1 = scanner.nextInt();
		
		int toplam =0;
		int i=0;
		int a = 0;
		
		do {
		a=sayi1%10;
		toplam+=a;
		sayi1/=10;
		i++;
		
		
			
		} while (sayi1>=1);
		
		System.out.println("basamak toplam = "+toplam+"\nBasamak Sayısı = "+i);
	}

}
