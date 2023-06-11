package com.bilgeadam.lesson016;

public abstract class Arac {
	private String plaka;
	private boolean calisiyorMu;
	public abstract void calistir() ;
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public Arac(String plaka, boolean calisiyorMu) {
		super();
		this.plaka = plaka;
		this.calisiyorMu = calisiyorMu;
	}
	public boolean isCalisiyorMu() {
		return calisiyorMu;
	}
	public void setCalisiyorMu(boolean calisiyorMu) {
		this.calisiyorMu = calisiyorMu;
	}
	public abstract void durdur() ;
	public abstract void hizlan() ;
	public abstract void yavasla() ;

}
