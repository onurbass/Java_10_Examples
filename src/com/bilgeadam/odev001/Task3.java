package com.bilgeadam.odev001;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz");
		
		int i =scanner.nextInt();
		int sayac=0;
		int toplam =0;
		
		
		while (i!=0) {
			toplam+=i;
			sayac++;
			System.out.println("Sayı giriniz");
			i=scanner.nextInt();
			
		}
		
		int ort = toplam/sayac;
		System.out.println("Toplam = "+toplam+"\nOrtalama = "+ort);
		

	}

}
