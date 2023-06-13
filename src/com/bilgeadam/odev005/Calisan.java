package com.bilgeadam.odev005;

import java.time.LocalDate;

public class Calisan extends Kisi {

	private int maas;
	private LocalDate baslamaTarihi;
	private boolean izinliMi;

	public Calisan(String isim, String no, int maas, LocalDate baslamaTarihi) {
		super(isim, no);
		this.maas = maas;
		this.baslamaTarihi = baslamaTarihi;
		this.izinliMi = false;
	}

	public static void yillikIzin(Calisan calisan) {
		try {
			if (!calisan.izinliMi) {
				System.out.println(calisan.getIsim()+" No: "+calisan.getNo() + " izin aldı");
				calisan.setIzinliMi(true);
			}else {
				throw new OkulException(ErrorType.ZATEN_IZINLI);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	
	}
	
	@Override
	public void raporAl() {
		try {
			if (!isRaporluMu()) {
				setRaporluMu(true);
				System.out.println("Çalışan rapor alma işlemi başarılı");
				
			}else {
				throw new OkulException(ErrorType.ZATEN_RAPORLU,"Çalışan zaten raporlu");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

	public Calisan() {

	}

	public boolean isIzinliMi() {
		return izinliMi;
	}

	public void setIzinliMi(boolean izinliMi) {
		this.izinliMi = izinliMi;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public LocalDate getBaslamaTarihi() {
		return baslamaTarihi;
	}

	public void setBaslamaTarihi(LocalDate baslamaTarihi) {
		this.baslamaTarihi = baslamaTarihi;
	}

	@Override
	public String toString() {
		return "Calisan [maas=" + maas + ", baslamaTarihi=" + baslamaTarihi + ", izinliMi=" + izinliMi + ", getIsim()="
				+ getIsim() + ", getNo()=" + getNo() + "]";
	}



}
