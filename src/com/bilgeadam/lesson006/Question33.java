package com.bilgeadam.lesson006;

import java.util.Iterator;

public class Question33 {

	public static void main(String[] args) {
		
		String deger = "125ab125xy";
		int toplam =0;
		String sonDeger="";
	
		
		for (int i = 0; i < deger.length(); i++) {
			char a = deger.charAt(i);
			int c=Character.getNumericValue(a);

			if ('0'<=a && a<='9') {//or 48<= a && a<=57(ASCİİ KARŞILIKLARI)
				String karakter=Character.toString(a);
				int sayi = Integer.parseInt(karakter);
				toplam += sayi;
				
			}
			else {
				String karakter2=Character.toString(a);
				sonDeger+=karakter2;
				
			}
	
		}
		System.out.println("Toplam = "+toplam);
		System.out.println("String deger = "+sonDeger);
	

	}

}
