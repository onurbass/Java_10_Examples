package com.bilgeadam.odevler001;

import java.util.Scanner;

public class SayıOyunu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		int randomSayi = (int) (Math.random() * 101);

		while (i < 10) {
			System.out.println("Bir sayı giriniz");
			int denenenSayi = scanner.nextInt();

			if (denenenSayi == randomSayi) {
				System.out.println("Tebrikler");
				break;
			} else if (denenenSayi < randomSayi) {
				if (i == 9) {
					System.out.println("Kaybettiniz. Sayı = "+randomSayi);
					break;
				}
				System.out.println("Sayıyı arttırıp tekrar deneyin");

			} else {
				if (i == 9) {
					System.out.println("Kaybettiniz"+randomSayi);
					break;
				}
				System.out.println("Sayıyı azaltıp tekrar deneyin");
			}
			i++;
		}
	}

}
