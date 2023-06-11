package com.bilgeadam.lesson009;

import java.util.Iterator;

public class Question47 {

	public static void main(String[] args) {
		diziYazdir(diziOlustur());

	}

	public static String[][] diziOlustur() {
		String[][] carpimTablo = new String[10][10];

		for (int i = 0; i < carpimTablo.length; i++) {
			for (int j = 0; j < carpimTablo[i].length; j++) {

				carpimTablo[i][j] = (i + 1) + "x" + (j + 1) + " = " + (i + 1) * (j + 1);
			}

		}
		return carpimTablo;
	}

	public static void diziYazdir(String[][] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j] + " ");

			}
			System.out.println();
		}
	}

}
