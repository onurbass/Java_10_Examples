package com.bilgeadam.lesson029.okulApp;

import java.util.List;
import java.util.stream.Collectors;

/*
 * ogrenci sınıfımızda
 * isim notort durumu==> (geçti veya kaldı),dogumtarihi 
 * ögretmen sınımıfımız olsun==>
 * bir ismi olsun birde notlarını okudugu ogrencileri tutsun 
 * 
 * Fİle manager
 * 1- dosyadan verileri okuyalaım  ve bize bir ogrenci listesi donsun 
 * ---> gelen her degerden bir ogrenci yaratıp listeye ekleyecegiz 
 * -->en sonunda da listeyi geri doncegiz 
 * 
 * 
 * 
 * 
 */
public class Uygulama {
	public static void main(String[] args) {
		Ogretmen ogretmen = new Ogretmen("Mustafa");
		//ogretmen.notlariOku();
		//ogretmen.dosyayaYaz();
		ogretmen.dosyadanOku().forEach(System.out::println);
		List<Ogrenci>list=ogretmen.getOgrenciler().stream().map(x->{
			x.setOrt(x.getOrt()+5);
			x.durumBelirle(x.getOrt());
			return x;
		}).collect(Collectors.toList());
		
		ogretmen.dosyadanOku();
		ogretmen.start();
	}
}
