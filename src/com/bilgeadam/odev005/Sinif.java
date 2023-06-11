package com.bilgeadam.odev005;

import java.util.ArrayList;
import java.util.List;

public class Sinif {
	private int sinifNo;
	private List<Ders> siniftakiDersler;
	private List<Ogrenci> siniftakiOgrenciler;
	private Ogretmen sinifinOgretmeni;

	public Sinif(int sinifNo) {
		super();
		this.sinifNo = sinifNo;
		this.siniftakiDersler = new ArrayList<>();
		this.siniftakiOgrenciler = new ArrayList<>();
	}

	public void ogrenciEkle(Ogrenci ogrenci) {
		siniftakiOgrenciler.add(ogrenci);
	}

	public Sinif(int sinifNo, Ogretmen sinifinOgretmeni) {
		super();
		this.sinifNo = sinifNo;
		this.siniftakiDersler = new ArrayList<>();
		this.siniftakiOgrenciler = new ArrayList<>();
		this.sinifinOgretmeni = sinifinOgretmeni;
	}

	public int getSinifNo() {
		return sinifNo;
	}

	public void setSinifNo(int sinifNo) {
		this.sinifNo = sinifNo;
	}

	

	public List<Ders> getSiniftakiDersler() {
		return siniftakiDersler;
	}

	public void setSiniftakiDersler(List<Ders> siniftakiDersler) {
		this.siniftakiDersler = siniftakiDersler;
	}

	public List<Ogrenci> getSiniftakiOgrenciler() {
		return siniftakiOgrenciler;
	}

	public void setSiniftakiOgrenciler(List<Ogrenci> siniftakiOgrenciler) {
		this.siniftakiOgrenciler = siniftakiOgrenciler;
	}

	public Ogretmen getSinifinOgretmeni() {
		return sinifinOgretmeni;
	}

	public void setSinifinOgretmeni(Ogretmen sinifinOgretmeni) {
		this.sinifinOgretmeni = sinifinOgretmeni;
	}

	@Override
	public String toString() {
		return "Sinif [sinifNo=" + sinifNo + "]";
	}

}
