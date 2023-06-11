package com.bilgeadam.lesson024;

import java.time.LocalDate;

public class Yuk {
	private String isim;
	private double agirlik;
	private LocalDate kabulTarih;

	

	public Yuk(String isim, double agirlik, LocalDate kabulTarih) {
		super();
		this.isim = isim;
		this.agirlik = agirlik;
		this.kabulTarih = kabulTarih;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(double agirlik) {
		this.agirlik = agirlik;
	}

	public LocalDate getKabulTarih() {
		return kabulTarih;
	}

	public void setKabulTarih(LocalDate kabulTarih) {
		this.kabulTarih = kabulTarih;
	}

	@Override
	public String toString() {
		return "Yuk [isim=" + isim + ", agirlik=" + agirlik + ", kabulTarih=" + kabulTarih + "]";
	}

}
