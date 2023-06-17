package com.bilgeadam.lesson029.okulApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(FileManager.path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Ogretmen ogretmen = new Ogretmen("Caner", bufferedReader);
		Ogretmen ogretmen2 = new Ogretmen("Aslı",bufferedReader);
		
//		ogretmen.notlariOku();
//		ogretmen.getOgrenciler().forEach(System.out::println);
//		
//		ogretmen.dosyaOlustur();
//		System.out.println("=============================");
//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
//		
//		
//		System.out.println("=============================");
//		List<Ogrenci> list = ogretmen.getOgrenciler().stream().map(x->{
//			x.setNotOrtalamasi(x.getNotOrtalamasi()+5);
//			x.durumBelirle(x.getNotOrtalamasi());
//			return x;
//		}).collect(Collectors.toList());
//		
//		ogretmen.setOgrenciList(list);
//		ogretmen.getOgrenciler().forEach(System.out::println);
//		System.out.println("=============================");
//		ogretmen.dosyaOlustur();
//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
//		
//		System.out.println("=============================");
		
		ogretmen.start();
		ogretmen2.start();
		
		try {
			ogretmen.join();             //ogremen için main i beklettik diğer işlemleri yaptı..
			ogretmen2.join();            // ogretmen2 için main i beklettik.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ogretmen.getIsim() + "==>>" + ogretmen.getOgrenciler().size());
		System.out.println(ogretmen2.getIsim() + "==>>" + ogretmen2.getOgrenciler().size());
		
		System.out.println(ogretmen.getIsim() + "==>>" +ogretmen.getOgrenciler());
		System.out.println(ogretmen2.getIsim() + "==>>" +ogretmen2.getOgrenciler());
		
		ogretmen.dosyayaYaz();
		ogretmen2.dosyayaYaz();
		
	}
}
