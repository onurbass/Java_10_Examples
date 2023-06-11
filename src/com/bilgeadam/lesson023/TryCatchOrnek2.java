package com.bilgeadam.lesson023;

import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;

import com.bilgeadam.utility.Utility;

public class TryCatchOrnek2 {

	public static void main(String[] args) {
//		String[] array = { "30", "a", "20", "ab", null, "50",null };
//		toplamVeHataSayisi2(array);
		
		Utility.stringTarihDegeriniTarihDegerineCevir( "02-05-2023");

	}
	public static void indexYazdir(String[] dizi, int a) {
		try {
		if (dizi[a]==null) throw new NullPointerException();
		
			System.out.println(dizi[a]);
		
		
		} catch (NullPointerException e) {
			System.out.println("null döndü");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+"Sınır dışı");
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
	}

	public static void toplamVeHataSayisi(String[] dizi) {
		int toplam = 0;
		int sayac = 0;
		for (int i = 0; i < dizi.length; i++) {
			try {
				toplam += Integer.parseInt(dizi[i]);

			} catch (NumberFormatException e) {
				System.out.println(e.getLocalizedMessage()+"->Number format hatası");
				sayac++;
			}
			catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
				sayac++;
			}
		}
		System.out.println("Toplam => " + toplam + "\nHata sayisi=> " + sayac);
	}
	public static void toplamVeHataSayisi2(String[] dizi) {
		int toplam = 0;
		int sayac = 0;
		for (int i = 0; i < dizi.length; i++) {
			try {
				nullKontrolu(dizi[i]);
				toplam += Integer.parseInt(dizi[i]);
				
			} catch (NumberFormatException e) {
				System.out.println(e.getLocalizedMessage()+"->Number format hatası");
				sayac++;
			}
			catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
				sayac++;
			}
		}
		System.out.println("Toplam => " + toplam + "\nHata sayisi=> " + sayac);
	}
	private static void nullKontrolu(String string) {
		if (string==null) throw new NullPointerException("Null hatası!!");
		
	}

}
