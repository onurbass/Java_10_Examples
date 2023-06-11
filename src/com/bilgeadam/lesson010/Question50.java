package com.bilgeadam.lesson010;

public class Question50 {

	public static void main(String[] args) {

		int[] sayilar = { 1, 13, 13, 5, 1, 3, 4, 5, 6, 13, 5, 13 };
		System.out.println(diziToplam(sayilar));
		
//		toplamBul2(sayilar);
	}
	
//	private static void toplamBul2(int[] sayilar) {
//		int toplam = 0;
//		for (int i = 0; i < sayilar.length; i++) {
//			if (sayilar[i] == 13 || (i > 1 && sayilar[i - 1] == 13)) {
//				continue;
//				
//			} else {
//			 toplam += sayilar[i];
//		
//}
//		    }
//		
//	}

	public static int diziToplam(int[] dizi) {
		int toplam = 0;

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == 13) {
				if (i + 1 < dizi.length && dizi[i + 1] != 13) {
					i++;
				}
			} else {
				toplam += dizi[i];
			}

		}
		return toplam;

	}

	
}
