package com.bilgeadam.lesson024;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Optional;

public class Uygulama {
	Liman liman;

	public Uygulama() {
		super();
		this.liman = new Liman();
	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();

		uygulama.liman.getYukYeri()[3] = new Yuk("Yuk3", 100, LocalDate.of(2020, 9, 9));
		uygulama.liman.getYukYeri()[5] = new Yuk("Yuk5", 150, LocalDate.of(2019, 9, 9));
		Yuk yuk3 = new Yuk("afs", 500, LocalDate.of(1995, 8, 5));

		try {
			uygulama.yukYeriSec(yuk3);
		} catch (LimanAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double toplam;
		try {
			toplam = uygulama.agırlıkKontrol();

		} catch (Exception e) {
			System.out.println("catch düştü");
		}
		// System.out.println(toplam);
		try {
			LocalDate date = uygulama.tarihBelirle();

			System.out.println(date);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		 try {
			uygulama.yukOlustur();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		 try {
			uygulama.yukKabulu(yuk3);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("Program devam");
	}

	public void yukYeriSecEski(Yuk yuk) {

		int index = Utility.intDegerAlma("Bir yer seçin");

		try {
			if (liman.getYukYeri()[index] != null)
				throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
			else {
				liman.getYukYeri()[index] = yuk;
				System.out.println("Yuk alana eklendi => " + liman.getYukYeri());
			}
		} catch (Exception e) {
			System.out.println("Yuk yeri seçimi hatalı " + e.toString());
		}

	}

	public int yukYeriSec(Yuk yuk) throws LimanAppException {

		int index = Utility.intDegerAlma("Bir yer seçin");

		
			if (index > liman.getYukYeri().length - 1 || index < 0) {
				throw new LimanAppException(ErrorType.SINIR_DISI);
			}
			if (liman.getYukYeri()[index] != null) {
				throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
			} else {
				liman.getYukYeri()[index] = yuk;
				System.out.println("Yuk alana eklendi => " + liman.getYukYeri());
			}
		
		return index;

	}

	public double agırlıkKontrol() throws LimanAppException {
		double agirlik = Utility.intDegerAlma("Agırlık giriniz");
		if (agirlik < 100) {
			throw new LimanAppException(ErrorType.AGIRLIK_YETERSIZ);
		}
		return agirlik;
	}

	public LocalDate tarihBelirle() throws LimanAppException {
		LocalDate date = Utility.stringTarihAlma("Lütfen tarih girin");

		if (date.isBefore(LocalDate.now())) {
			throw new LimanAppException(ErrorType.GECERSZ_TARIH);

		}
		if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			throw new LimanAppException(ErrorType.MESAI_DISI);

		}
		return date;

	}

public Optional<Yuk> yukOlustur() {
		
		Yuk yuk = null;
		try {
			yuk = new Yuk(Utility.stringDegerAlma("Lütfen yük ismini giriniz"), agırlıkKontrol(), tarihBelirle());
			
		}catch (LimanAppException e) {
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println("Beklenmedik bir hata oluştu : " + e.toString());
		}
		
		return Optional.ofNullable(yuk);
		
	}
public void yukKabulu(Yuk yuk) {
	int index=-1;
	Optional<Yuk>yuk2=Optional.empty();
	try {
		index=yukYeriSec(yuk);
		
		yuk2=yukOlustur();
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if (yuk2.isEmpty()) {
			System.out.println("yuk kabul");
			
		}else {
			System.out.println();
			liman.getYukYeri()[index]=yuk;
		}
	}
	
}
}
