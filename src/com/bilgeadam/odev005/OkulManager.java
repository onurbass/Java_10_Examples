package com.bilgeadam.odev005;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Stack;

public class OkulManager {
	 
 
	public static <T> void kayitEt(List<T> list, T object) {
		list.add(object);
	}

	public static <T> void kayitSil(List<T> list, T object) {
		try {
			if (!list.isEmpty()) {
				if (list.contains(object)) {
					System.out.println(object + " kaydı silindi");
					list.remove(object);
					
				}
			} else {
				throw new OkulException(ErrorType.OBJE_YOK,"Böyle biri yok");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public static <T> void verileriGetir(T t) {
		System.out.println(t);
	}

	public static String randomIsım() {
		Random random = new Random();
		char[] array = new char[5]; // length is bounded by 7

		String generatedString = "";
		for (int i = 0; i < array.length; i++) {
			array[i] = (char) random.nextInt(65, 90);

		}
		generatedString = String.valueOf(array);
		return generatedString;
	}

	public static void maasHesapla(LocalDate baslangic, int maas) {
		LocalDate hesaplamaTarihi = LocalDate.now();
		int yilFarki = Period.between(baslangic, hesaplamaTarihi).getYears();

		for (int i = 0; i < yilFarki; i++) {
			maas += maas * 0.25;

		}
		System.out.println("Calisma yili => " + yilFarki + " Guncel Maas=> " + maas);

	}

	public static void birinciSinifGetir(Okul okul) {
		try {
			if (!okul.getSiniflar().isEmpty()) {
				
				okul.getSiniflar().get(0).getSiniftakiOgrenciler().stream().forEach(x->System.out.println(okul.getSiniflar().get(0)+"  => "+x));
			}else {
				throw new OkulException(ErrorType.OBJE_YOK,"Sınıfta öğrenci yok");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
	public static void ikinciSinifIsimler(Okul okul) {
		try {
			if (!okul.getSiniflar().isEmpty()) {
				
				okul.getSiniflar().get(0).getSiniftakiOgrenciler().stream().forEach(
						x -> System.out.println(okul.getSiniflar().get(1)+"  " + x.getIsim() + "=> " + x.getNo()));
			}else {
				throw new OkulException(ErrorType.OBJE_YOK,"Sınıfta öğrenci yok");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	public static void birinciSinifNotOrt(Okul okul) {
		double ortOgrenci1 = (okul.getOgrenciler().get(1).getOgrenciDersler().get(0).getNotlar().stream()
				.mapToDouble(Double::doubleValue).average().getAsDouble()
				+ okul.getOgrenciler().get(1).getOgrenciDersler().get(1).getNotlar().stream()
						.mapToDouble(Double::doubleValue).average().getAsDouble())
				/ okul.getOgrenciler().get(1).getOgrenciDersler().size();
		double ortOgrenci2= (okul.getOgrenciler().get(0).getOgrenciDersler().get(0).getNotlar().stream()
				.mapToDouble(Double::doubleValue).average().getAsDouble()
				+ okul.getOgrenciler().get(0).getOgrenciDersler().get(1).getNotlar().stream()
						.mapToDouble(Double::doubleValue).average().getAsDouble())
				/ okul.getOgrenciler().get(0).getOgrenciDersler().size();
		double ortalamaSon = (ortOgrenci1+ortOgrenci2)/2;
		System.out.println("Birinci sınıf not ortalaması=> "+ortalamaSon);
		
	}
	public static void gecKalanOgrenci(Okul okul) {
		Stack<Ogrenci> gecKalanOgrencilerOgrencis = new Stack<>();
		gecKalanOgrencilerOgrencis.push(okul.getOgrenciler().get(0));
		gecKalanOgrencilerOgrencis.push(okul.getOgrenciler().get(2));
		gecKalanOgrencilerOgrencis.push(okul.getOgrenciler().get(4));
		gecKalanOgrencilerOgrencis.push(okul.getOgrenciler().get(6));
		System.out.println(gecKalanOgrencilerOgrencis.pop() + " 10 tur atacak");
		System.out.println(gecKalanOgrencilerOgrencis.pop() + " 10 tur atacak");
		System.out.println(gecKalanOgrencilerOgrencis.pop() + " 5 tur atacak");
		System.out.println(gecKalanOgrencilerOgrencis.pop() + " 5 tur atacak");
		
		
	}
	public static void sinifOncelikliSıra(Okul okul) {
		 PriorityQueue<Ogrenci> oncelikKuyrugu = new PriorityQueue<>(Comparator.comparingInt(x->x.getOgrenciSinif().getSinifNo()));
		Collections.shuffle(okul.getOgrenciler());
		System.out.println("OKULDAKİ OGRENCİLERİ KARİSİK LİSTE");
		for (Ogrenci ogrenci : okul.getOgrenciler()) {
			System.out.println(ogrenci);
		}
		 for (int i = 0; i < okul.getOgrenciler().size(); i++) {
			oncelikKuyrugu.add(okul.getOgrenciler().get(i));
			
		}
		 System.out.println("****Sıra sonrası liste***");
		 while (!oncelikKuyrugu.isEmpty()) {
	            Ogrenci ogrenci = oncelikKuyrugu.poll();
	            System.out.println(ogrenci.getIsim() + " - " + ogrenci.getOgrenciSinif().getSinifNo() + ". sınıf");
	        }
		 
	}
	

}
