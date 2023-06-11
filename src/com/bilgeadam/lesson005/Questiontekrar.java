package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Questiontekrar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		int buyukKontrol = -1;
		int kucukKontrol = 101;
		
		while (i<5) {
	
		System.out.println("0 ile 100 arası bir sayı giriniz");
		int sayi1 = scanner.nextInt();
		if (sayi1>100||sayi1<0) {System.out.println("Tekrar deneyiniz");
			break;
		}
		else {
			if (sayi1>buyukKontrol) {
				buyukKontrol=sayi1;
				
			}
			if (sayi1<kucukKontrol) {
				kucukKontrol=sayi1;
				
			}
		}
		i++;
		}
		System.out.println("En buyuk sayı = "+buyukKontrol);
		System.out.println("En kucuk sayı = "+kucukKontrol);
		i=0;
		

	}

}
