package com.bilgeadam.lesson024;

import java.time.LocalDate;

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

		uygulama.yukYeriSec(yuk3);
		double toplam;
		try {
			toplam=uygulama.agırlıkKontrol();
		
		} catch (Exception e) {
			System.out.println("catch düştü");
		}
			//System.out.println(toplam);
		
		
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

	public void yukYeriSec(Yuk yuk) {

		int index = Utility.intDegerAlma("Bir yer seçin");

		try {
			if (index > liman.getYukYeri().length - 1 || index < 0) {
				throw new LimanAppException(ErrorType.SINIR_DISI);
			}
			if (liman.getYukYeri()[index] != null) {
				throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
			} else {
				liman.getYukYeri()[index] = yuk;
				System.out.println("Yuk alana eklendi => " + liman.getYukYeri());
			}
		} catch (Exception e) {
			System.out.println("Yuk yeri seçimi hatalı " + e.toString());
		}

	}

	public double agırlıkKontrol() throws LimanAppException {
		double agirlik = Utility.intDegerAlma("Agırlık giriniz");
		if(agirlik<100) {
			throw new LimanAppException(ErrorType.AGIRLIK_YETERSIZ);
		}
		return agirlik;
	}
}
