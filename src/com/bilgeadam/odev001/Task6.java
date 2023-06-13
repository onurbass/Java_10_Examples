package com.bilgeadam.odev001;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen ay girin (1-12)");

		int ay = scanner.nextInt();
		System.out.println("Lütfen gün girin (1-31");
		int gun = scanner.nextInt();

		

		switch (ay) {
		case 1:
			if (gun <= 21)
				System.out.println("Oğlak");
			else
				System.out.println("Kova");
			break;
		case 2:
			if (gun <= 19)
				System.out.println("Kova");

			else
				System.out.println("Balık");

			break;
		case 3:
			if (gun <= 20)
				System.out.println("Balık");
			else
				System.out.println("Koç");

		case 4:
			if (gun <= 20)
				System.out.println("Koç");
			else
				System.out.println("Boğa");
			break;

		case 5:
			if (gun <= 21)
				System.out.println("Boğa");
			else
				System.out.println("İkizler");
			break;
		case 6:
			if (gun <= 21)
				System.out.println("İkizler");
			else
				System.out.println("Yengeç");
			break;
		case 7:
			if (gun <= 21)
				System.out.println("Yengeç");
			else
				System.out.println("Aslan");
			break;
		case 8:
			if (gun <= 21)
				System.out.println("Aslan");
			else
				System.out.println("Başak");
			break;
		case 9:
			if (gun <= 21)
				System.out.println("Başak");
			else
				System.out.println("Terazi");
			break;
		case 10:
			if (gun <= 21)
				System.out.println("Terazi");
			else
				System.out.println("Akrep");
			break;
		case 11:
			if (gun <= 21)
				System.out.println("Akrep");
			else
				System.out.println("Yay");
			break;
		case 12:
			if (gun <= 21)
				System.out.println("Yay");
			else
				System.out.println("Oğlak");
			break;
		default:
			System.out.println("Yanlış giriş");
			break;
		}
	}

}
