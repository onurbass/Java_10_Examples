package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("yarıçap  giriniz");
		
		double yariCap = sc.nextDouble();
		
//	double piSayisi=3.14;
	
	double cevre=2*Math.PI*yariCap;
	double alan=Math.PI*yariCap*yariCap;
	
	System.out.println("Dairenni alanı ="+alan+"\nDairenin Çevresi ="+cevre);
	
	
		
		
	
		
		
		
	}

}
