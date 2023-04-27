package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Sayıyı giriniz");
		
		int sayi1 = scanner.nextInt();
		
		System.out.println("2. sayıyı giriniz");
		int sayi2= scanner.nextInt();
		
		int toplam = sayi1+sayi2;
		
		System.out.println((toplam %2==0) ? "Çift sayıdır" : "Tek Sayıdır");
		
		

	}

}
