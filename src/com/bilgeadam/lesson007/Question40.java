package com.bilgeadam.lesson007;

import java.util.Iterator;
import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {

		String[] diziStrings = { "Türkiye", "Moğolistan", "Japonya", "Fransa", "Danimarka" };

		ulkeGir(diziStrings);
	}

	public static void ulkeGir(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ülke adı girin");
		String ulkeGiris = scanner.nextLine();
		boolean kontrol = false;

		for (int i = 0; i < dizi.length; i++) {

			if (ulkeGiris.equalsIgnoreCase(dizi[i])) {
				kontrol = true;
				break;
			}

		}
		if (kontrol) {
			System.out.println("Ülke bulundu");
		} else {
			System.out.println("Ülke bulunamadı");
		}

	}
}
