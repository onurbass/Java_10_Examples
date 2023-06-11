package com.bilgeadam.lesson015;

public class TemizlikUrunleri extends Urun {
	
	private boolean zararliMi;

	public TemizlikUrunleri(String barkod, double fiyat, String skt, boolean zararliMi) {
		super(barkod, fiyat, skt);
		this.zararliMi = zararliMi;
	}

	public boolean isZararliMi() {
		return zararliMi;
	}

	public void setZararliMi(boolean zararliMi) {
		this.zararliMi = zararliMi;
	}

	@Override
	public String toString() {
		return "TemizlikUrunleri [zararliMi=" + zararliMi + ", getBarkod()=" + getBarkod() + ", getFiyat()="
				+ getFiyat() + ", getSkt()=" + getSkt() + "]";
	}
	

}
