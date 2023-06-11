package com.bilgeadam.lesson015;

public class Yiyecek extends Urun{
	
	private boolean paketliMi;

	public Yiyecek(String barkod, double fiyat, String skt, boolean paketliMi) {
		super(barkod, fiyat, skt);
		this.paketliMi = paketliMi;
	}

	public boolean isPaketliMi() {
		return paketliMi;
	}

	public void setPaketliMi(boolean paketliMi) {
		this.paketliMi = paketliMi;
	}

	@Override
	public String toString() {
		return "Yiyecek [paketliMi=" + paketliMi + ", getBarkod()=" + getBarkod() + ", getFiyat()=" + getFiyat()
				+ ", getSkt()=" + getSkt() + "]";
	}
	
	

}
