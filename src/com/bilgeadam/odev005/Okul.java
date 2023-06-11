package com.bilgeadam.odev005;

import java.util.ArrayList;
import java.util.List;

public class Okul {
	private String isim;
	private List<Ogretmen> ogretmenler;
	private List<Sinif> siniflar;
	private List<Ogrenci> ogrenciler;
	private List<Memur> memurlar;
	private List<EDersler> dersler;

	public Okul(String isim) {
		super();
		this.isim = isim;
		this.ogretmenler = new ArrayList<>();
		this.siniflar = new ArrayList<>();
		this.ogrenciler = new ArrayList<>();
		this.memurlar = new ArrayList<>();
		this.dersler = List.of(EDersler.values());
	}

	public List<Sinif> getSiniflar() {
		return siniflar;
	}

	public void setSiniflar(List<Sinif> siniflar) {
		this.siniflar = siniflar;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Ogretmen> getOgretmenler() {
		return ogretmenler;
	}

	public void setOgretmenler(List<Ogretmen> ogretmenler) {
		this.ogretmenler = ogretmenler;
	}

	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}

	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}

	public List<Memur> getMemurlar() {
		return memurlar;
	}

	public void setMemurlar(List<Memur> memurlar) {
		this.memurlar = memurlar;
	}

	public List<EDersler> getDersler() {
		return dersler;
	}

	public void setDersler(List<EDersler> dersler) {
		this.dersler = dersler;
	}

	@Override
	public String toString() {
		return "Okul [isim=" + isim + ", ogretmenler=" + ogretmenler + ", siniflar=" + siniflar + ", ogrenciler="
				+ ogrenciler + ", memurlar=" + memurlar + ", dersler=" + dersler + "]";
	}

}
