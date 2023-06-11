package com.bilgeadam.lesson024;


import java.util.Arrays;

public class Liman {
	private Yuk[] yukYeri;
	private int alanSayisi;

	public Liman(int alanSayisi) {

		this.alanSayisi= alanSayisi;
		this.yukYeri = new Yuk[alanSayisi];
	}
	

	public Liman() {
		this.yukYeri = new Yuk[10];
	}


	public Yuk[] getYukYeri() {
		return yukYeri;
	}

	public void setYukYeri(Yuk[] yukYeri) {
		this.yukYeri = yukYeri;
	}

	public int getAlanSayisi() {
		return alanSayisi;
	}

	public void setAlanSayisi(int alanSayisi) {
		this.alanSayisi = alanSayisi;
	}

	@Override
	public String toString() {
		return "Liman [yukYeri=" + Arrays.toString(yukYeri) + ", alanSayisi=" + alanSayisi + "]";
	}

}
