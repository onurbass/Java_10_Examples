package com.bilgeadam.odev005;

import java.time.LocalDate;
import java.util.List;

public class Ogretmen extends Calisan {

	private Sinif ogretmenSinif;
	private EDersler ogretmenDers;

	public Ogretmen(String isim, String no, int maas, LocalDate baslamaTarihi, Sinif sinif1) {
		super(isim, no, maas, baslamaTarihi);
		this.ogretmenSinif = sinif1;

	}

	public Sinif getOgretmenSinif() {
		return ogretmenSinif;
	}

	public void setOgretmenSinif(Sinif ogretmenSinif) {
		this.ogretmenSinif = ogretmenSinif;
	}

	public EDersler getOgretmenDers() {
		return ogretmenDers;
	}

	public void setOgretmenDers(EDersler ogretmenDers) {
		this.ogretmenDers = ogretmenDers;
	}

	@Override
	public String toString() {
		return "Ogretmen [ogretmenSinif=" + ogretmenSinif + ", ogretmenDers=" + ogretmenDers + ", isIzinliMi()="
				+ isIzinliMi() + ", getMaas()=" + getMaas() + ", getBaslamaTarihi()=" + getBaslamaTarihi()
				+ ", getIsim()=" + getIsim() + ", getNo()=" + getNo() + "]";
	}

	

}
