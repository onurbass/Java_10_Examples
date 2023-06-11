package com.bilgeadam.lesson011;

import java.util.Random;
import java.util.Scanner;

public class TasKagıtMakasDeneme2 {
	public static Oyun getRandom() {
		Random random = new Random();
		return Oyun.values()[random.nextInt(Oyun.values().length)];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Birini seçiniz. \nTAŞ \nKAĞIT \nMAKAS");

		String tercihString = scanner.nextLine();

		Oyun randomTercih = getRandom();
		String pcTercih = randomTercih.toString();
		System.out.println("====================");
		if (pcTercih == tercihString) {
			System.out.println("Beraberlik");

		} else {

			switch (tercihString) {
			case "TAŞ":
				if (pcTercih.equalsIgnoreCase("Kağıt")) {
					System.out.println(pcTercih);
					System.out.println("Kaybettin");
				} else {
					System.out.println("Kazandın");
				}

				break;
			case "KAĞIT":
				if (pcTercih.equalsIgnoreCase("Makas")) {
					System.out.println(pcTercih);
					System.out.println("Kaybettin");

				} else {
					System.out.println("Kazandın");
				}
				break;

			case "MAKAS":
				if (pcTercih.equals("Taş")) {
					System.out.println(pcTercih);
					System.out.println("Kaybettin");

				} else {
					System.out.println("Kazandın");
				}

			default:
				System.out.println("Yanlış giriş");
				break;

			}
		}

	}

}
