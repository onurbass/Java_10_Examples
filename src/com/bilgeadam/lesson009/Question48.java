package com.bilgeadam.lesson009;

public class Question48 {

	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };

		yazdir(tekElemanDizisi(matris));

	}

	public static int[] tekElemanDizisi(int[][] dizi) {

		int sayac = 0;

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if (dizi[i][j] % 2 != 0) {
					sayac++;
				}
			}
		}
		int arr[] = new int[sayac];
		sayac = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if (dizi[i][j] % 2 != 0) {
					arr[sayac] = dizi[i][j];
					sayac++;
				}
			}
		}
		return arr;
	}
	public static void yazdir(int dizi[]) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);

		}

	}

}
