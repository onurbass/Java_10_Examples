package com.bilgeadam.lesson029.okulApp;

import java.util.ArrayList;
import java.util.List;

public class Ogretmen extends Thread {

	private String isim;
	private List<Ogrenci> ogrenciler;

	public Ogretmen(String isim) {
		this.isim = isim;
		this.ogrenciler = new ArrayList<>();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.isim + " adlı ogretmen" + i + " .ogrencinin notunu okudu");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void notlariOku() {

		this.ogrenciler = FileManager.dosyadanVeriOku(this.isim);
		for (int i = 0; i < ogrenciler.size(); i++) {
			System.out.println(ogrenciler.get(i).getIsim() + " adlı öğrencinin ort = " + ogrenciler.get(i).getOrt()
					+ " Durumu = " + ogrenciler.get(i).getDurum());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void dosyayaYaz() {
		FileManager.ogretmenDosyasıOlustur(this.isim, this.ogrenciler);

	}

	public List<Ogrenci> dosyadanOku() {
		this.ogrenciler = FileManager.ogrencileriGetir(this.isim);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
