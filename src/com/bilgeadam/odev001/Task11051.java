package com.bilgeadam.odev001;

public class Task11051 {

	public static void main(String[] args) {
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		sehirPlaka(sehirler);
	}

	public static void sehirPlaka(String sehirler) {
		
		
		String[] sehirDizi = sehirler.split(";");
		
		for (int i = 0; i < sehirDizi.length; i++) {
			int tire =sehirDizi[i].indexOf('-');
			
			System.out.println(sehirDizi[i].substring(tire+1)+"'nın plakası = "+sehirDizi[i].substring(0,tire));
			
			
		}
		
	}
	

}
