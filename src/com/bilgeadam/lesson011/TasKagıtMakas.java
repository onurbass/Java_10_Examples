package com.bilgeadam.lesson011;

import java.util.Random;
import java.util.Scanner;



public class TasKagıtMakas {
	static Oyun[] secenekler =Oyun.values();
	
	public static Oyun secimYap() {
		Scanner scanner = new Scanner(System.in);
		for (Oyun secenek : secenekler) {
			System.out.println(secenek.ordinal()+1+"-");
		}
		System.out.println(" Birini seçiniz.TAŞ-KAĞIT-MAKAS");
		int secim = scanner.nextInt();
		
		return secenekler[secim-1];
	}

	public static void main(String[] args) {
		int secim =secimKontrol();
		
		Random random = new Random();
		int sans = random.nextInt(3);
		if (secim==sans) {
			System.out.println(sans);
			System.out.println("Doğru");
			
		}
		else {System.out.println(sans);
			System.out.println("Yanlış");
		}

}

	private static int secimKontrol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Birini seçiniz.TAŞ-KAĞIT-MAKAS");
		int secim=-1; 
		do {System.out.println(" Lütfen 1-3 arası bir değer giriniz");
			 secim = scanner.nextInt();
		} while (secim<1 && secim>3);
		
		return secim;
	}
}