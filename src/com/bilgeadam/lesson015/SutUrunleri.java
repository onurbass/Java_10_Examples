package com.bilgeadam.lesson015;

public class SutUrunleri extends Urun{
private String tur;

public SutUrunleri(String barkod, double fiyat, String skt, String tur) {
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
	return "SutUrunleri [tur=" + tur + ", getBarkod()=" + getBarkod() + ", getFiyat()=" + getFiyat() + ", getSkt()="
			+ getSkt() + "]";
}

}
