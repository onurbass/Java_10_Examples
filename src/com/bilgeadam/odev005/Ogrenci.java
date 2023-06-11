package com.bilgeadam.odev005;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ogrenci extends Kisi {

	private List<Ders> ogrenciDersler;
	private Sinif ogrenciSinif;
	

	public Ogrenci(String isim, String no, Sinif ogrenciSinif) {
		super(isim, no);
		this.ogrenciDersler = ogrenciSinif.getSiniftakiDersler();
		
		this.ogrenciSinif = ogrenciSinif;
		ogrenciSinif.ogrenciEkle(this);
	}

	public Ogrenci(String isim, String no) {
		super(isim, no);
	}

	public List<Ders> getOgrenciDersler() {
		return ogrenciDersler;
	}

	public void setOgrenciDersler(List<Ders> ogrenciDersler) {
		this.ogrenciDersler = ogrenciDersler;
	}

	public Sinif getOgrenciSinif() {
		return ogrenciSinif;
	}

	public void setOgrenciSinif(Sinif ogrenciSinif) {
		this.ogrenciSinif = ogrenciSinif;
	}

	

	

	@Override
	public String toString() {
		return "Öğrenci : isim: "+getIsim()+" No: "+getNo();
	}

	@Override
	public void raporAl() {
		try {
			if (!isRaporluMu()) {
				setRaporluMu(true);
				System.out.println("Öğrenci rapor alma işlemi başarılı");
				
			}else {
				throw new OkulException(ErrorType.ZATEN_RAPORLU,"Ogrenci zaten raporlu");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}


}
