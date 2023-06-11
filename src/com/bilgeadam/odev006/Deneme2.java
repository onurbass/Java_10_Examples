package com.bilgeadam.odev006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/*
1- isminde a gecen ogrencileri getirelim
2- her bir ogrencinin not ortalamsını hesaplayıp double bir listede toplayalım 
3- butun ogrencilerin not oratalamsını hesaplayalım 
4- bolumeGoreMaple metoduyla beraber ogrecnileri bolumlere gore mapleyelim 
5-ortalaması 50 den buyuk olanların durumu gecti kucuklerin durumu kaldı olarak guncellensin 
6-her ogrenciye 4 uncu notuda ekleyelim
7-her ogrencinin herbir notuna 15 puan daha ekleyelim 
8-her ogernciyi idsine karsılık ismi gelecek şekilde mapleyelim

*/
public class Deneme2 {

	static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		Deneme2 deneme2 = new Deneme2();
		System.out.println("== A harfi içerenler ===");
		students.stream().filter(x -> x.name.contains("a") || x.name.contains("A")).forEach(System.out::println);
		System.out.println("==Her bir öğr. ortalaması===");
		List<Double> ortalama = students.stream()
				.map(x -> x.notlar.stream().mapToDouble(Double::doubleValue).average().getAsDouble())
				.collect(Collectors.toList());
		for (Double double1 : ortalama) {
			System.out.println(double1);
		}
		System.out.println("==Sinif Ort===");
		double sinifOrt = ortalama.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println("Sinif Ort=>" + sinifOrt);
		System.out.println("===Bolume Göre Map==");
		Map<Student, String> bolumeGoreMap = bolumeGoreMaple(students);
		for (Entry<Student, String> degerEntry : bolumeGoreMap.entrySet()) {
			System.out.println(degerEntry);
		}
		System.out.println("== Geçti Kaldı ===");
//		for (int i = 0; i < students.size(); i++) {
//			if (ortalama.get(i)>=50) {
//				students.get(i).setDurum("gecti");
//				
//			}else {
//				students.get(i).setDurum("kaldi");;
//			}
//		}

		students.stream().forEach(x -> {
			double notOrtalamasi = x.notlar.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
			x.durum = notOrtalamasi > 50 ? "Geçti" : "Kaldı";
		});
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("== 4.not ===");
		students.stream().forEach(x -> x.notlar.add(50.0));
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("== 15 puan ekle===");
		students.stream().forEach(x -> x.notlar.replaceAll(y -> (y + 15 > 100) ? 100 : y + 15));
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("== ID/ISIM maple===");
		Map<Integer, String> idIsimMap = students.stream().collect(Collectors.toMap(x->x.id, x->x.name));
		for (Entry<Integer, String> deger : idIsimMap.entrySet()) {
			System.out.println(deger);

		}
	}

	public static HashMap<Student, String> bolumeGoreMaple(List<Student> list) {

		HashMap<Student, String> bolumeGoreMap = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			bolumeGoreMap.put(list.get(i), list.get(i).bolum);
		}
		return bolumeGoreMap;

	}

	public Deneme2() {
		Student student = new Student();
		student.name = "Ali";
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.bolum = "tm";
		student.id = 1;
		Student student2 = new Student();
		student2.name = "Ayşe";
		student2.notlar.add(80.0);
		student2.notlar.add(55.5);
		student2.notlar.add(79.4);
		student2.bolum = "mat";
		student2.id = 2;
		Student student3 = new Student();
		student3.name = "Hakan";
		student3.notlar.add(86.0);
		student3.notlar.add(97.5);
		student3.notlar.add(50.4);
		student3.bolum = "mat";
		student3.id = 3;
		Student student4 = new Student();
		student4.name = "Mert";
		student4.notlar.add(10.0);
		student4.notlar.add(35.5);
		student4.notlar.add(58.4);
		student4.bolum = "tm";
		student4.id = 4;
		Student student5 = new Student();
		student5.name = "Gamze";
		student5.notlar.add(68.0);
		student5.notlar.add(23.5);
		student5.notlar.add(90.4);
		student5.bolum = "mat";
		student5.id = 5;
		Student student6 = new Student();
		student6.name = "Merve";
		student6.notlar.add(36.0);
		student6.notlar.add(23.5);
		student6.notlar.add(58.4);
		student6.bolum = "tm";
		student6.id = 6;
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
	}

}
