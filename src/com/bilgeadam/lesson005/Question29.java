package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("0 ile 100 arası bir sayı giriniz");
		int sayi1 = scanner.nextInt();
		int i = 1;
		int buyukKontrol = 0;
		int kucukKontrol = 0;

		while (i < 5) {
			System.out.println("Tekrar 0 ile 100 arası bir sayı giriniz sayıyı giriniz");
			int sayi2 = scanner.nextInt();
			if (sayi1 < sayi2) {
				buyukKontrol = sayi2;
			} else {
				buyukKontrol = sayi1;
				kucukKontrol = sayi2;
			}
			sayi1 = sayi2;

			i++;

		}
		System.out.println(buyukKontrol);
		System.out.println(kucukKontrol);

	}

}
