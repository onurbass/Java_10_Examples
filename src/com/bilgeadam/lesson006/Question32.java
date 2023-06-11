package com.bilgeadam.lesson006;

public class Question32 {

	public static void main(String[] args) {
		String degerString = "1254897569315";

		int toplam = 0;
		int toplam2 = 0;
//		long sayi1 = Long.parseLong(degerString);
//		long basamak =0; ///deneme 1
//		
//		while(sayi1>=1) {
//			basamak =  sayi1%10;
//			toplam +=basamak;
//			sayi1/=10;
//			
//			
//		}
		
		for (int i = 0; i < degerString.length(); i++) {
			char a = degerString.charAt(i);
			String karakter = String.valueOf(a);
			int sayi = Integer.parseInt(karakter);
			toplam += sayi;
			int sayi2 = Character.getNumericValue(a);// 2.yöntem
			toplam2 += sayi2;// 2. yöntem

		}
		System.out.println("Karakter toplamları =" + toplam + "-" + toplam2);

	}

}
