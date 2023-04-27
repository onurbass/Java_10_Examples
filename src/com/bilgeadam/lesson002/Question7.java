package com.bilgeadam.lesson002;

import java.lang.foreign.ValueLayout.OfShort;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Question7 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vize giriniz");
		
		double vize = scanner.nextDouble();
		
		System.out.println("Final giriniz");
		
		double finalSonuc = scanner.nextDouble();
		
		System.out.println("isim giriniz");
//		scanner.nextLine();
		
		String isim = scanner.nextLine();
		
		double ort = vize*0.4 + finalSonuc*0.6;
		
		System.out.println(isim+" adlı öğrenci ders durumu :\n"+"ortalaması="+ort+((ort>60)? "-Geçti":"-Kaldı"));
				
				

	}

}
