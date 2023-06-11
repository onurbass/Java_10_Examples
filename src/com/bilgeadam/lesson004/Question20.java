package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz");
		int sayi1 = scanner.nextInt();
		
		
		for (int i = 2; i <= sayi1/2; i++) {
			
			if (sayi1%i!=0 || sayi1==2) {
				System.out.println("Asal sayıdır");
				break;
			}
			else {
				System.out.println("Asal sayı değildir");
				break;
			}
			
		}
	}

}
