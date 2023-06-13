package com.bilgeadam.odev001;

import java.net.Socket;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir Sayı Giriniz");

		int sayi1 = scanner.nextInt();

		int i = 0;

		while (sayi1 >= 1) {

			if (sayi1 % 5 == 0) {
				sayi1 /= 5;
				i++;

			} else if (sayi1 == 1) {
				System.out.println("5in " + i + ". kuvvetidir");
				break;
			} else {
				System.out.println("5in Kuvveti Değildir");
				break;
			}

		}

	}
}
