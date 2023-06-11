package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sayı giriniz");
		
		int sayi1= sc.nextInt();
		int toplam =0;
		int i =1;
		
		System.out.println("---While---");
		while (i<=sayi1) {
			
			toplam+=i;
			i++;
		}
		System.out.println("Toplam = "+toplam);
		
		toplam=0;
		
		System.out.println("--For--");
		
		for (int a = 1; a <= sayi1; a++) {
			
			toplam = toplam+a;
			
			
		}
		System.out.println("Toplam = "+toplam);
		

	}

}
