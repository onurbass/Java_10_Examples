package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	System.out.println("1. Sayıyı girin");
	int sayi1 = scanner.nextInt();
	System.out.println("2. sayıyı girin");
	int sayi2 = scanner.nextInt();
	
	
	
	System.out.println("Yapacağınız işlemi giriniz");
	scanner.next();
	
	String islem = scanner.nextLine();
	

	switch (islem) {
	case "+": System.out.println("Toplam sonucu"+ (sayi1+sayi2));
	break;
	case "-": System.out.println("Çıkarma sonucu"+ (sayi1-sayi2));
	break;
	case "*": System.out.println("Çarpım sonucu"+ (sayi1*sayi2));
	break;
	case "/": System.out.println("Bölüm sonucu"+ ((double) sayi1+sayi2));
	break;
	}

	}

}
