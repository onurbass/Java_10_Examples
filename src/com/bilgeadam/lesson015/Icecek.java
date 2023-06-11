package com.bilgeadam.lesson015;

public class Icecek extends Urun {
	
	private String tur;

	public Icecek(String barkod, double fiyat, String skt, String tur) {
		super(barkod, fiyat, skt);
		this.tur = tur;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	@Override
	public String toString() {
		return "Icecek [tur=" + tur + ", getBarkod()=" + getBarkod() + ", getFiyat()=" + getFiyat() + ", getSkt()="
				+ getSkt() + "]";
	}
	

}
