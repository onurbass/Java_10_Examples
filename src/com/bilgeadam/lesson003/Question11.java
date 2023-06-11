package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Sayı giriniz");
		
		int sayi1= sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(sayi1+"x"+i+"="+(sayi1*i));
			
		}

	}

}
