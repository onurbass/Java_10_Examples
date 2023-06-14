package com.bilgeadam.lesson026.OkulApp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	public static void main(String[] args) {
		List<Ogrenci> ogrencis =dosyadanOgrenciListesiOku("D:\\Java10-Workspace\\ogrenci.txt");
		for (Ogrenci ogrenci : ogrencis) {
			System.out.println(ogrenci);
		}
	}

	public static List<Ogrenci> dosyadanOgrenciListesiOku(String dosyaAdi) {
		List<Ogrenci> ogrenciListesi = new ArrayList<>();
		
		try (BufferedReader abc= new BufferedReader(new FileReader(dosyaAdi))) {
			String satir;
			while ((satir=abc.readLine()) != null) {
				String [] ogrenciVeri= satir.split(",");
				double ort =(Integer.parseInt(ogrenciVeri[1])+Integer.parseInt(ogrenciVeri[2])+Integer.parseInt(ogrenciVeri[3]))/3.0;
				String[] date = (ogrenciVeri[4].split("/"));
				Ogrenci ogrenci = new Ogrenci(ogrenciVeri[0], ort, LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0])));
				ogrenciListesi.add(ogrenci);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ogrenciListesi;
	}

	public static List<Ogrenci> deserializedOgrencis() {
		  List<Ogrenci> deserializedOgrencis = null;
	        try (ObjectInputStream ois = new ObjectInputStream(
	                new FileInputStream("D:/java10-workspace/dosya/ogrenci.txt"))) {
	            deserializedOgrencis = (List<Ogrenci>) ois.readObject();
	        } catch (IOException e) {
	            System.out.println("Deserileştirme işlemi başarısız");
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            System.out.println("Sınıf bulunamadı");
	            e.printStackTrace();
	        }
			return deserializedOgrencis;
	}
	
}
