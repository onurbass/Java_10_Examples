package com.bilgeadam.lesson008;

import java.util.Iterator;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class Question43 {

	public static void main(String[] args) {
		menuMetot();
	}
	public static void menuMetot() {
		Scanner scanner = new Scanner(System.in);
		int islem = 0;
		String ifade = "";

		do {
			System.out.println("Yapacağınız işlemi seçin");
			System.out.println("1-Harf saydırma\n2-Harf değiştirme\n3-Palindrom\n4-Çıkış");
			islem = scanner.nextInt();
			scanner.nextLine();
			switch (islem) {
			case 1:
				harfSaydırma();
				break;
			case 2:
				harfDegis();
				break;
			case 3:
				palindromMetot();
				break;
			case 4:
				System.out.println("Çıkış Yapılıyor...");
				break;
			default:
				System.out.println("Lütfen 1-3 arası bir islem seçiniz");
				break;
			}

		} while (islem != 4);
	}
	public static void harfSaydırma() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İfadeyi Girin");
		String ifade = scanner.nextLine();
		int sayac = 0;
		System.out.println("Hangi harfin sayılacağını giriniz");
		String harf = scanner.nextLine();// sayilanHarf string
		char karakter = harf.charAt(0);// sayilanHarf2 char
		if (!ifade.contains(harf)) {
			System.out.println("Kelime harfi içermiyor");
			return;
		}

		for (int i = 0; i < ifade.length(); i++) {
			if (ifade.charAt(i) == karakter) {
				sayac++;
			}
		}
		System.out.println(karakter + " harfinin sayısı:" + sayac);
	}
	public static void harfDegis() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İfade giriniz");
		String ifade = scanner.nextLine();
		System.out.println("Değiştireceğiniz harfi girin");
		String degisecek = scanner.nextLine();
		System.out.println("Yerine gelecek harfi girin");
		String yerine = scanner.nextLine();
		System.out.println(ifade.replace(degisecek, yerine));
	}

	public static void palindromMetot() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İfade giriniz");
		String ifade = scanner.nextLine();
		boolean a = true;
		for (int i = 0; i < ifade.length(); i++) {
			
			if (ifade.charAt(i) != ifade.charAt(ifade.length() - 1 - i)) {
				System.out.println("Palindrom değildir");
				a = false;
				break;
			}
		}
		if (a == true) {
			System.out.println("Palindromdur");
		}
	}

}
