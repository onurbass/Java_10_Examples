package com.bilgeadam.lesson005;

import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class Question28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı giriniz");
		int sayi1 = scanner.nextInt();
		int toplam = 0;

		for (int i = 1; i <= sayi1 / 2; i++) {
			if (sayi1 % i == 0) {
				toplam += i;
			}
		}
		if (toplam == sayi1)
			System.out.println("Mükemmel Sayıdır");
		else
			System.out.println("Mükemmel Sayı Değildir");
	}

}
