package com.bilgeadam.lesson031;

public class YuzMetreYarisi {
public static void main(String[] args) {
	long baslangic=System.nanoTime();
	Kosucu kosucu =new Kosucu("Onur",baslangic);
	Kosucu kosucu1 =new Kosucu("Serkan",baslangic);
	Kosucu kosucu2 =new Kosucu("Caner",baslangic);
	Kosucu kosucu3 =new Kosucu("Unal",baslangic);
	Kosucu kosucu4 =new Kosucu("Ali",baslangic);
	
	kosucu.start();
	kosucu1.start();
	kosucu2.start();
	kosucu3.start();
	kosucu4.start();
	
}
}
