package com.bilgeadam.lesson006;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] dizi = new int[5];
		
		for (int i = 0; i < dizi.length; i++) {
			
			System.out.println(i+". indexi giriniz");
			dizi[i]=scanner.nextInt();
		
			
		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("dizinin "+i+". indexi = "+dizi[i]);
		}

	}

}
