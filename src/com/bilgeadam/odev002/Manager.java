package com.bilgeadam.odev002;

import java.util.Scanner;

public class Manager {
	Scanner scanner = new Scanner(System.in);

	public void menu() {
		System.out.println("===Menu===");
		System.out.println("1-Veriekle");
		System.out.println("2-Verisil");
		System.out.println("3-Veriguncelle");
		System.out.println("4-Verilerigetir");
		System.out.println("0-Çıkış");
		System.out.println("Lütfen bir işlem seçin");
	}

	public void calistir(Database data) {
		data.login();

		int islem = 0;

		do {
			menu();
			islem = scanner.nextInt();

			switch (islem) {
			case 1:
				data.veriEkle(data);

				break;
			case 2:
				data.veriSil(data);

				break;
			case 3:
				data.veriGuncelle(data);

				break;
			case 4:
				data.veriGetir(data);

				break;
			case 0:
				System.out.println("Cikis yapılıyor...");

				break;

			default:
				System.out.println("Yanlış giriş yapıldı");
				break;
			}

		} while (islem != 0);
	}

	public Database secim() {
		System.out.println("1-MySql");
		System.out.println("2-Oracle");
		System.out.println("Lütfen seçiminizi yapınız");
		int secim = scanner.nextInt();
		Database data = null;
		switch (secim) {
		case 1:
			data = new MySql();

			break;
		case 2:
			data = new Oracle();

			break;

		default:
			System.out.println("Yanlış giriş");
			break;
		}

		return data;

	}

}
