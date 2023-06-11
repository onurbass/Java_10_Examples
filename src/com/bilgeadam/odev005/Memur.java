package com.bilgeadam.odev005;

import java.time.LocalDate;

public class Memur extends Calisan {
	private String unvan;

	public Memur(String isim, String no, int maas, LocalDate baslamaTarihi) {
		super(isim, no, maas, baslamaTarihi);
		this.unvan = "Memur";
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

//.equals(ders.getDers()))
	public void dersAta(Ogrenci ogrenci, Ders ders) {
		// Ders sınıfına hashcode ve equals metotları eklenerek sağlanabildi***
		try {
			if (!ogrenci.getOgrenciDersler().contains(ders)) {
				ogrenci.getOgrenciDersler().add(ders);
				System.out.println(ogrenci.getIsim()+" "+ogrenci.getNo() + "  öğrenciye " + ders + " dersi atandı.\nOgrenci Dersler=> "
						+ ogrenci.getOgrenciDersler());
			} else {
				throw new OkulException(ErrorType.OGRENCI_DERSE_SAHIP);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	@Override
	public String toString() {
		return "Memur [isIzinliMi()=" + isIzinliMi() + ", getMaas()=" + getMaas() + ", getBaslamaTarihi()="
				+ getBaslamaTarihi() + ", getIsim()=" + getIsim() + ", getNo()=" + getNo() + "]";
	}

}
