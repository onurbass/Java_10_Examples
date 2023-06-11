package com.bilgeadam.odev005;

public abstract class Kisi implements IKisiIslem {
	private String isim;
	private String no;
	private boolean raporluMu;

	public Kisi(String isim, String no) {
		this.isim = isim;
		this.no = no;
		this.raporluMu=false;
	}

	public Kisi() {

	}
	

	public boolean isRaporluMu() {
		return raporluMu;
	}

	public void setRaporluMu(boolean raporluMu) {
		this.raporluMu = raporluMu;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Kisi [isim=" + isim + ", no=" + no + "]";
	}

}
