package com.bilgeadam.lesson006;

/*
 * 
 * String degerinin karakterleri eger rakam ise toplayalım ve toplama ekleyelim 
 * değil ise bu karaktere rakam değildir çıktısı 
 * versin ve bir strin degere onları ekleyelim
 * 
 * 
 */
public class Question36 {

	public static void main(String[] args) {

		String deger = "125ab1259xy";
		int toplam = 0;
		String sonDeger = "";

		for (int i = 0; i < deger.length(); i++) {

			char a = deger.charAt(i);
			if (48 <= a && a <= 57) { // '0'<=a && a<='9'
				String karakter1 = Character.toString(a);
				int sayi = Integer.parseInt(karakter1);
				toplam += sayi;
			} else {
				String karakter2 = Character.toString(a);
				sonDeger += karakter2;
			}

		}

		System.out.println("toplam= " + toplam);
		System.out.println("son deger= " + sonDeger);
		/// 2.çözüm
		toplam = 0;
		sonDeger = "";

		for (int i = 0; i < deger.length(); i++) {
			char a = deger.charAt(i);

			if (Character.isDigit(a)) {
				String karakter = Character.toString(a);
				int sayi = Integer.parseInt(karakter);
				toplam += sayi;
			} else {
				sonDeger += Character.toString(a);
			}

		}
		System.out.println("toplam= " + toplam);
		System.out.println("son deger= " + sonDeger);
	}

}
