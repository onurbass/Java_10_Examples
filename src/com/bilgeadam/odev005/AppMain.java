package com.bilgeadam.odev005;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;

public class AppMain {
	Okul okul;

	public AppMain() {
		super();
		this.okul = new Okul("Anadolu Lisesi");
	}

	public static void main(String[] args) {
		AppMain uygulama = new AppMain();
			//onurbaş
		uygulama.sinifOlustur();
		uygulama.kisiOlustur();

		System.out.println("==Memur Yıllık izin==");
		Calisan.yillikIzin(uygulama.okul.getMemurlar().get(3));

		System.out.println("==Aynı memur tekrar izin==");
		Calisan.yillikIzin(uygulama.okul.getMemurlar().get(3));

		System.out.println("==Verileri Getir==");
		OkulManager.verileriGetir(uygulama.okul.getOgrenciler().get(0));

		System.out.println("==Maas Hesapla==");
		OkulManager.maasHesapla(uygulama.okul.getOgretmenler().get(0).getBaslamaTarihi(),
				uygulama.okul.getOgretmenler().get(0).getMaas());


		System.out.println("==Memur Ders Ata==");
		uygulama.okul.getMemurlar().get(0).dersAta(uygulama.okul.getOgrenciler().get(3), new Ders(EDersler.ALM));

		System.out.println("==Memur öğrencide olan dersi ata==");
		uygulama.okul.getMemurlar().get(0).dersAta(uygulama.okul.getOgrenciler().get(3), new Ders(EDersler.ALM));
		uygulama.okul.getOgrenciler().get(3).getOgrenciDersler().remove(2);
		System.out.println("==Verileri Getir 8. öğrenci==");
		OkulManager.verileriGetir(uygulama.okul.getOgrenciler().get(7));

		System.out.println("==Kayıt Sil 8. öğrenci ve tekrar ekle ==");
		OkulManager.kayitSil(uygulama.okul.getOgrenciler(), uygulama.okul.getOgrenciler().get(7));
		OkulManager.kayitEt(uygulama.okul.getOgrenciler(),
				new Ogrenci("Osman", "S-8", uygulama.okul.getSiniflar().get(3)));

		System.out.println("==Aynı öğrenci iki kez rapor al==");
		uygulama.okul.getOgrenciler().get(0).raporAl();
		uygulama.okul.getOgrenciler().get(0).raporAl();

		System.out.println("== Çalışan iki kez rapor al==");
		uygulama.okul.getOgretmenler().get(0).raporAl();
		uygulama.okul.getOgretmenler().get(0).raporAl();

		System.out.println("==A ile başlayan öğrenciler==");
		uygulama.okul.getOgrenciler().stream().filter(x -> x.getIsim().startsWith("A")).forEach(System.out::println);

		System.out.println("==Ogrenci not ortalaması==");
		double ort = (uygulama.okul.getOgrenciler().get(1).getOgrenciDersler().get(0).getNotlar().stream()
				.mapToDouble(Double::doubleValue).average().getAsDouble()
				+ uygulama.okul.getOgrenciler().get(1).getOgrenciDersler().get(1).getNotlar().stream()
						.mapToDouble(Double::doubleValue).average().getAsDouble())
				/ uygulama.okul.getOgrenciler().get(1).getOgrenciDersler().size();
		System.out
				.println(uygulama.okul.getOgrenciler().get(1).getIsim() + " Adlı öğrencinin not ortalaması => " + ort);

		System.out.println("==Ogrenci bir dersin ortalaması==");
		double dersOrt = uygulama.okul.getOgrenciler().get(1).getOgrenciDersler().get(1).getNotlar().stream()
				.mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println(uygulama.okul.getOgrenciler().get(1).getIsim() + " Adlı Ogrencinin "
				+ uygulama.okul.getOgrenciler().get(1).getOgrenciDersler().get(1).getDers() + " Dersi not ortalaması=> "
				+ dersOrt);
		System.out.println("===========");
		System.out.println("==Birinci siniftaki öğrenciler==");
		OkulManager.birinciSinifGetir(uygulama.okul);
		System.out.println("===========");
		System.out.println("==İkinci siniftaki öğrenciler İsim-NO==");
		OkulManager.ikinciSinifIsimler(uygulama.okul);
		System.out.println("===========");
		System.out.println("==Birinci sınıf not ortalaması ==");
		OkulManager.birinciSinifNotOrt(uygulama.okul);
		System.out.println("===========");
		System.out.println("== Öğrenci sınıfa göre map==");

		Map<Sinif, List<Ogrenci>> ogrenciSinifMap2 = uygulama.okul.getOgrenciler().stream()
				.collect(Collectors.groupingBy(Ogrenci::getOgrenciSinif));
		for (Entry<Sinif, List<Ogrenci>> ogrenciEntry2 : ogrenciSinifMap2.entrySet()) {
			System.out.println(ogrenciEntry2);

		}
		System.out.println("===========");
		System.out.println("==Ogrenci no karsilik sinif map ==");
		Map<String, Sinif> noKarsilikSinif = uygulama.okul.getOgrenciler().stream()
				.collect(Collectors.toMap(x -> x.getNo(), x -> x.getOgrenciSinif()));
		for (Entry<String, Sinif> ogrenciEntry2 : noKarsilikSinif.entrySet()) {
			System.out.println(ogrenciEntry2);

		}
		System.out.println("===========");
		System.out.println("==Derse karşılık Öğrenci Map==");
		Map<List<Ders>, List<Ogrenci>> derseGoreOgrenciGrupMap = uygulama.okul.getOgrenciler().stream()
				.collect(Collectors.groupingBy(Ogrenci::getOgrenciDersler));
		for (Entry<List<Ders>, List<Ogrenci>> abc : derseGoreOgrenciGrupMap.entrySet()) {
			System.out.println(abc);
		}
		System.out.println("===========");
		System.out.println("==Geç kalan öğrenci (4 Ogrenci 2si en geç)==");
		 OkulManager.gecKalanOgrenci(uygulama.okul);
		 System.out.println("===========");
		 System.out.println("== Sinif Oncelik Sira==");
		 OkulManager.sinifOncelikliSıra(uygulama.okul);
		

	}

	public void sinifOlustur() {
		Sinif sinif1 = new Sinif(1);
		Sinif sinif2 = new Sinif(2);
		Sinif sinif3 = new Sinif(3);
		Sinif sinif4 = new Sinif(4);

		sinif1.getSiniftakiDersler().add(new Ders(EDersler.ALM));
		sinif1.getSiniftakiDersler().add(new Ders(EDersler.ENG));

		sinif2.getSiniftakiDersler().add(new Ders(EDersler.GEO));
		sinif2.getSiniftakiDersler().add(new Ders(EDersler.MAT));

		sinif3.getSiniftakiDersler().add(new Ders(EDersler.RES));
		sinif3.getSiniftakiDersler().add(new Ders(EDersler.MUZ));

		sinif4.getSiniftakiDersler().add(new Ders(EDersler.BIO));
		sinif4.getSiniftakiDersler().add(new Ders(EDersler.KIM));

		OkulManager.kayitEt(okul.getSiniflar(), sinif1);
		OkulManager.kayitEt(okul.getSiniflar(), sinif2);
		OkulManager.kayitEt(okul.getSiniflar(), sinif3);
		OkulManager.kayitEt(okul.getSiniflar(), sinif4);

	}

	public void kisiOlustur() {

		OkulManager.kayitEt(okul.getOgrenciler(), new Ogrenci("Onur", "S-1", okul.getSiniflar().get(0)));
		OkulManager.kayitEt(okul.getOgrenciler(), new Ogrenci("Ünal", "S-2", okul.getSiniflar().get(0)));
		OkulManager.kayitEt(okul.getOgrenciler(), new Ogrenci("Ahmet", "S-3", okul.getSiniflar().get(1)));
		OkulManager.kayitEt(okul.getOgrenciler(), new Ogrenci("Aysu", "S-4", okul.getSiniflar().get(1)));
		OkulManager.kayitEt(okul.getOgrenciler(), new Ogrenci("Abdullah", "S-5", okul.getSiniflar().get(2)));
		OkulManager.kayitEt(okul.getOgrenciler(), new Ogrenci("Merve", "S-6", okul.getSiniflar().get(2)));
		OkulManager.kayitEt(okul.getOgrenciler(), new Ogrenci("Furkan", "S-7", okul.getSiniflar().get(3)));
		OkulManager.kayitEt(okul.getOgrenciler(), new Ogrenci("Osman", "S-8", okul.getSiniflar().get(3)));

		okul.getOgrenciler().get(0).getOgrenciDersler().get(0).setNotlar(List.of(50.0, 60.0, 70.0));
		okul.getOgrenciler().get(0).getOgrenciDersler().get(1).setNotlar(List.of(55.0, 30.0, 20.0));
		okul.getOgrenciler().get(1).getOgrenciDersler().get(0).setNotlar(List.of(30.0, 60.0, 45.0));
		okul.getOgrenciler().get(1).getOgrenciDersler().get(1).setNotlar(List.of(10.0, 60.0, 90.0));
		okul.getOgrenciler().get(2).getOgrenciDersler().get(0).setNotlar(List.of(90.0, 25.0, 35.0));
		okul.getOgrenciler().get(2).getOgrenciDersler().get(1).setNotlar(List.of(32.0, 65d, 70d));
		okul.getOgrenciler().get(3).getOgrenciDersler().get(0).setNotlar(List.of(35d, 67d, 87d));
		okul.getOgrenciler().get(3).getOgrenciDersler().get(1).setNotlar(List.of(90d, 80d, 65d));

		OkulManager.kayitEt(okul.getOgretmenler(), new Ogretmen(OkulManager.randomIsım(), "T-1", 10000,
				LocalDate.of(2015, 6, 6), okul.getSiniflar().get(0)));
		OkulManager.kayitEt(okul.getOgretmenler(), new Ogretmen(OkulManager.randomIsım(), "T-2", 11000,
				LocalDate.of(2016, 6, 6), okul.getSiniflar().get(1)));
		OkulManager.kayitEt(okul.getOgretmenler(), new Ogretmen(OkulManager.randomIsım(), "T-3", 12000,
				LocalDate.of(2017, 6, 6), okul.getSiniflar().get(2)));
		OkulManager.kayitEt(okul.getOgretmenler(), new Ogretmen(OkulManager.randomIsım(), "T-4", 13000,
				LocalDate.of(2018, 6, 6), okul.getSiniflar().get(3)));

		OkulManager.kayitEt(okul.getMemurlar(),
				new Memur(OkulManager.randomIsım(), "OF-1", 9000, LocalDate.of(2010, 6, 6)));
		OkulManager.kayitEt(okul.getMemurlar(),
				new Memur(OkulManager.randomIsım(), "OF-2", 9500, LocalDate.of(2012, 6, 6)));
		OkulManager.kayitEt(okul.getMemurlar(),
				new Memur(OkulManager.randomIsım(), "OF-3", 9600, LocalDate.of(2013, 6, 6)));
		OkulManager.kayitEt(okul.getMemurlar(),
				new Memur(OkulManager.randomIsım(), "OF-4", 9700, LocalDate.of(2014, 6, 6)));
	}

	public Okul getOkul() {
		return okul;
	}

	public void setOkul(Okul okul) {
		this.okul = okul;
	}
}
