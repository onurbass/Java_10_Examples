package com.bilgeadam.lesson015;

public class Urun {
	
	private String barkod;
	private double fiyat;
	private String skt;
	
	public Urun(String barkod, double fiyat, String skt) {
		super();
		this.barkod = barkod;
		this.fiyat = fiyat;
		this.skt = skt;
	}
	
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public String getSkt() {
		return skt;
	}
	public void setSkt(String skt) {
		this.skt = skt;
	}
	
	
	
	
	

}
