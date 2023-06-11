package com.bilgeadam.lesson006;

public class Question35 {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] sayilar = { 0, 12, 5, 85, -89, 1258, 87, 14 };

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] < min) {

				min = sayilar[i];

			}
			if (sayilar[i] > max) {
				max = sayilar[i];

			}
		}
		System.out.println("Max = " + max + "\nMin= " + min);
	}

}
