package com.bilgeadam.lesson008;

public class Question44 {

	public static boolean kontrol(int sayilar[]) {
		boolean a = false;
		for (int i = 1; i < sayilar.length; i++) {

			if (sayilar[i] == 2 && sayilar[(i - 1)] == 2) {
				a = true;
			}
		}

		return a;
	}
	public static void main(String[] args) {
		int[] sayilar = { 1, 2, 4, 5, 8, 2, 2, 15 };
		System.out.println(kontrol(sayilar));
	}
}
