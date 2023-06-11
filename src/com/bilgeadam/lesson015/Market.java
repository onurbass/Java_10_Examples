package com.bilgeadam.lesson015;

import java.util.Arrays;

public class Market {
	private String adString;
	private String adres;
	private Urun[] urunler;
	private Calisan[] calisanlar;
	private Musteri[] müsteriler;
	
	
	 
	public Market(String adString, String adres) {
	
		this.adString = adString;
		this.adres = adres;
	}


	public Market(String adString, String adres, Urun[] urunler, Calisan[] calisanlar) {
		super();
		this.adString = adString;
		this.adres = adres;
		this.urunler = urunler;
		this.calisanlar = calisanlar;
	
	}


	public String getAdString() {
		return adString;
	}


	public void setAdString(String adString) {
		this.adString = adString;
	}


	public String getAdres() {
		return adres;
	}


	public void setAdres(String adres) {
		this.adres = adres;
	}


	public Urun[] getUrunler() {
		return urunler;
	}


	public void setUrunler(Urun[] urunler) {
		this.urunler = urunler;
	}


	public Calisan[] getCalisanlar() {
		return calisanlar;
	}


	public void setCalisanlar(Calisan[] calisanlar) {
		this.calisanlar = calisanlar;
	}


	public Musteri[] getMüsteriler() {
		return müsteriler;
	}


	public void setMüsteriler(Musteri[] müsteriler) {
		this.müsteriler = müsteriler;
	}


	@Override
	public String toString() {
		return "Market [adString=" + adString + ", adres=" + adres + ", urunler=" + Arrays.toString(urunler)
				+ ", calisanlar=" + Arrays.toString(calisanlar) + ", müsteriler=" + Arrays.toString(müsteriler) + "]";
	}
	
	
	 
	
}
