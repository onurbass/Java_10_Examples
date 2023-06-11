package com.bilgeadam.lesson022;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			bolme();
		} catch (InfinityException e) {
			e.printStackTrace();
		}
		System.out.println("Program hala çalışıyor");
	}
	public static void bolme() throws InfinityException {
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = false;
		double sonuc = 0;
		do {
			try {
				System.out.println("1. sayi gir");
				int sayi1 = scanner.nextInt();
				System.out.println("2. sayi gir");
				int sayi2 = scanner.nextInt();
				if (sayi2==0) {throw new InfinityException("Sonsuz sonuç");}
				sonuc =  sayi1 / sayi2;
				kontrol = false;
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
				kontrol = true;
			}
		} while (kontrol);
		System.out.println(sonuc);
	}
}
