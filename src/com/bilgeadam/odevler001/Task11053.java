package com.bilgeadam.odevler001;

import java.util.Scanner;

public class Task11053 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int secim;

		do {
			menuGoster();
			secim = scanner.nextInt();

			switch (secim) {
			case 0:
				System.out.println("Program sonlandırıldı.");
				break;
			case 1:
				topla();
				break;
			case 2:
				cikar();
				break;
			case 3:
				carp();
				break;
			case 4:
				bol();
				break;
			default:
				System.out.println("Geçersiz seçim. Tekrar deneyin.");
			}
		} while (secim != 0);
	}

	public static void menuGoster() {
		System.out.println("==Hesap makinesi===");
		System.out.println("1-Topla");
		System.out.println("2-Çıkar");
		System.out.println("3-Çarp");
		System.out.println("4-Böl");
		System.out.println("0-Çıkış");
		System.out.println("Bir işlem seçiniz:");
	}

	public static void topla() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("İlk sayı: ");
		int sayi1 = scanner.nextInt();
		int toplam = sayi1;
		boolean devam = true;
		while (devam) {
			System.out.print("Sonraki giris : ");
			String giris = scanner.next();
			if (giris.equals("=")) {
				devam = false;
			} else {
				int sayi2 = Integer.parseInt(giris);
				toplam += sayi2;
			}
		}
		System.out.println("Sonuç: " + toplam);
	}

	public static void cikar() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("İlk sayı: ");
		int sayi1 = scanner.nextInt();
		int fark = sayi1;
		boolean devam = true;
		while (devam) {
			System.out.print("Sonraki giris : ");
			String giris = scanner.next();
			if (giris.equals("=")) {
				devam = false;
			} else {
				int sayi2 = Integer.parseInt(giris);
				fark -= sayi2;
			}
		}
		System.out.println("Sonuç: " + fark);
	}

	public static void carp() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("İlk sayı: ");
		int sayi1 = scanner.nextInt();
		int carpim = sayi1;
		boolean devam = true;
		while (devam) {
			System.out.print("Sonraki giris : ");
			String giris = scanner.next();
			if (giris.equals("=")) {
				devam = false;
			} else {
				int sayi2 = Integer.parseInt(giris);
				carpim *= sayi2;
			}
		}
		System.out.println("Sonuç: " + carpim);
	}

	public static void bol() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("İlk sayı: ");
		double sayi1 = scanner.nextDouble();
		double bolum = sayi1;
		boolean devam = true;
		while (devam) {
			System.out.print("Sonraki giris : ");
			String giris = scanner.next();
			if (giris.equals("=")) {
				devam = false;
			} else {
				double sayi2 = Double.parseDouble(giris);
				bolum /= sayi2;
			}
		}
		System.out.println("Sonuç: " + bolum);

	}
}