package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int mailKodu = 6599;
		int telKodu =3575;
		
		System.out.println("Mail kodu girin");
		int mailKodu2 = scanner.nextInt();
		System.out.println("Telefon Kodu girin");
		int telKodu2 =scanner.nextInt();
		
		if (mailKodu==mailKodu2 && telKodu==telKodu2) {
			System.out.println("Başarılır");
			
		}
		else if (mailKodu==mailKodu2 && telKodu!=telKodu2) {
			System.out.println("Tel kodu hatalı");
			
		}
		else if (mailKodu!=mailKodu2 && telKodu==telKodu2) {
			System.out.println("Mail kodu hatalı");
			
		}
		else {
			System.out.println("Mail ve tel kodu hatalı");
		}
		
	

	}

}
