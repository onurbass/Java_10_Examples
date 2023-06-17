package com.bilgeadam.lesson029.okulApp;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Ogretmen extends Thread {

	private String isim;
	private List<Ogrenci> ogrenciler;
	private BufferedReader bufferedReader;

	public Ogretmen(String isim,BufferedReader bufferedReader) {
		this.isim = isim;
		this.ogrenciler = new ArrayList<>();
		this.bufferedReader=bufferedReader;
	}

	@Override
	public void run() {
		notlariOku();
	
	
	}

	public void notlariOku() {

		this.ogrenciler = FileManager.dosyadanVeriOku(this.isim,this.bufferedReader);
		
	}

	public void dosyayaYaz() {
		FileManager.ogretmenDosyasıOlustur(this.isim, this.ogrenciler);

	}

	public List<Ogrenci> dosyadanOku() {
		this.ogrenciler = FileManager.ogrencileriGetir(this.isim);
		return this.ogrenciler;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}

	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}

	@Override
	public String toString() {
		return "Ogretmen [isim=" + isim + ", ogrenciler=" + ogrenciler + "]";
	}

}
