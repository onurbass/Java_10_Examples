package com.bilgeadam.lesson008;

import java.security.PublicKey;

public class Question42 {

	public static void main(String[] args) {

		String ifade = "Java,React,Spring,Google";

		kelimeAyir(ifade);
		System.out.println("----------");
		kelimeAyirMetot(ifade);
		System.out.println("----------");
		kelimeAyirMetot2(ifade);
		System.out.println("----------");
		System.out.println(kelimeAyir4(ifade));

	}
	public static String kelimeAyir4(String ifade) {
		System.out.println("3.metot");
		
		ifade=ifade.replace(",","\n" );
		return ifade;
		
	}

	public static void kelimeAyir(String ifadeMetot) {
		for (int i = 0; i < ifadeMetot.length(); i++) {

			if (ifadeMetot.charAt(i) == ',') {
				System.out.println();

			} else {
				System.out.print(ifadeMetot.charAt(i));
			}

		}

	}

	public static void kelimeAyirMetot(String ifadeMetot) {

		for (int i = 0; i < ifadeMetot.length(); i++) {

			Character a = ifadeMetot.charAt(i);
			if (a.equals(',')) {
				System.out.println();

			}
			System.out.print(ifadeMetot.charAt(i));

		}
	}

	public static void kelimeAyirMetot2(String ifadeMetot) {
		int index = 0;

		for (int i = 0; i < ifadeMetot.length(); i++) {

			if (ifadeMetot.charAt(i) == ',') {
				System.out.println(ifadeMetot.substring(index, i));
				index = i + 1;

			}
			

		}
		System.out.println(ifadeMetot.substring(index,ifadeMetot.length()));
	}

}
