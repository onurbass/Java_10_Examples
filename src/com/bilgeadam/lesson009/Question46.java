package com.bilgeadam.lesson009;

public class Question46 {

	public static void main(String[] args) {
		int start = 2;
		int end = 22;

		String[] diziStrings = kontrol(start, end);
		
		for (int i = 0; i < diziStrings.length; i++) {

			System.out.println(diziStrings[i]);
		}

	}

	public static String[] kontrol(int baslangic, int bitis) {
		String[] dizi = new String[bitis - baslangic + 1];

		for (int i = 0; i < dizi.length; i++) {

			dizi[i] = Integer.toString(i + baslangic);

			if (Integer.parseInt(dizi[i]) % 3 == 0 && Integer.parseInt(dizi[i]) % 5 == 0) {
				dizi[i] = "bilgeadam";

			} else if (Integer.parseInt(dizi[i]) % 3 == 0) {
				dizi[i] = "bilge";

			} else if (Integer.parseInt(dizi[i]) % 5 == 0) {
				dizi[i] = "adam";

			}
		}
		return dizi;

	}

}
