package com.bilgeadam.lesson006;

public class Question37 {

	public static void main(String[] args) {
	
		
		String[] sayilar = {"4","6","5","12","13"};
		double ciftToplam=0;
		double tekToplam=0;		
		for (int i = 0; i < sayilar.length; i++) {

			int sayi = Integer.parseInt(sayilar[i]);
			
			
			if (sayi%2==0) {
				ciftToplam+=sayi;
		
			}
			else {
				tekToplam+=sayi;
			}
			
		}
		System.out.println("Çift Toplam = "+ciftToplam+"\nTek toplam = "+tekToplam+"\nCift/Tek"+((double) ciftToplam/tekToplam));

	}

}
