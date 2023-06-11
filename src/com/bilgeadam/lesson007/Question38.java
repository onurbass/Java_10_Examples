package com.bilgeadam.lesson007;

public class Question38 {

	public static void main(String[] args) {
		
		String[] myDizi = new String[3];
		metot2("java", 2, myDizi);
		
		topla();
		System.out.println(cikar(25, 10));
		
		
		
		
	}
	
	//geri donusu olmayan parametresiz (direkt metot içinde işlem yapılan metot türü)

	//geri donusu olmayan parametreli metot.
	public static void metot2(String kelime, int sayi, String[] dizi) {
		System.out.println("metot2 çalışıyor");
		dizi[sayi]=kelime;
		System.out.println(sayi);
		System.out.println(dizi[sayi]);
	}
	
	// geri donuslu parametresiz
	public static int topla() {
		int sayi1=10;
		int sayi2=20;
		int toplam =sayi1+sayi2;
				
		return toplam;		
	}
	//geri donuslu parametreli
	public static int cikar(int sayi1,int sayi2) {
		
		return sayi1-sayi2;
	}
}
