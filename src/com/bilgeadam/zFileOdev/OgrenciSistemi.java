package com.bilgeadam.zFileOdev;

/*
 * 
 * FileReader filereader = new FileReader(dosyaYolu);
 * FileWriter filewriter = new FileWriter(file);
 * Bufferedlar bfr = new buffer (filereader)
 * 
 * listeyeEkle(ogrenciler,new Ogrenci);
 * 
 */
import java.io.IOException;

import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class OgrenciSistemi {

	public static void main(String[] args) {
		
		String dosyaYolu = "D:\\Java10-Workspace\\ogrencilistesi.txt";
		
		String dosyaYoluKopya = "D:\\Java10-Workspace\\ogrencilistesiKopya.txt";
		String dosyaIsmiAlinanlar = "D:\\Java10-Workspace\\ismiAlınanlar.txt";

		OgrenciSistemi ogrenciSistemi = new OgrenciSistemi();

		List<String> ogrenciList = ogrenciSistemi.dosyadanOgrenciListesiOku(dosyaYolu);
		ogrenciSistemi.dosyayaOgrenciListesiYaz(ogrenciList, dosyaYoluKopya);

		for (String string : ogrenciList) {
			System.out.println(string);
		}
		String secilenOgrenci = ogrenciSistemi.randomOgrenciSec(ogrenciList);
		System.out.println("Random secilen => " + secilenOgrenci);
		ogrenciList.remove(secilenOgrenci);
		ogrenciSistemi.dosyayaOgrenciListesiYaz(ogrenciList, dosyaYoluKopya);
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dosyaIsmiAlinanlar))) {
			bufferedWriter.write(secilenOgrenci);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public List<String> dosyadanOgrenciListesiOku(String dosyaAdi) {
		List<String> ogrenciListesi = new ArrayList<>();
		
		try (BufferedReader abc= new BufferedReader(new FileReader(dosyaAdi))) {
			String satir;
			while ((satir=abc.readLine()) != null) {
				ogrenciListesi.add(satir);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ogrenciListesi;
	}

	public void dosyayaOgrenciListesiYaz(List<String> ogrenciList, String dosyaAdi) {

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dosyaAdi))) {
		
			int i = 0;
			while (i != ogrenciList.size()) {
				bufferedWriter.write(ogrenciList.get(i) + "\n");
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

	public String randomOgrenciSec(List<String> ogrenciListesi) {
		Random random = new Random();
		int index = random.nextInt(ogrenciListesi.size());
		return ogrenciListesi.get(index);
	}
}
