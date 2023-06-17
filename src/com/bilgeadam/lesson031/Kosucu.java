package com.bilgeadam.lesson031;

public class Kosucu extends Thread {
	private String isim;
	private int mesafe;
	private long baslangicZamani;
	

	public Kosucu(String ismi,long baslangicZamani) {
		super();
		this.isim = ismi;
		this.mesafe = 0;
		this.baslangicZamani=baslangicZamani;

	}

	@Override
	public void run() {
		yaris();
		
	}

	public void yaris() {
	System.out.println(baslangicZamani);
		for (int i = 0; i < 100; i++) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			if (i % 10 == 0 && i!=0) {
				System.out.println(this.isim + "=>" + i + ". metrede.");
			}
			this.mesafe++;
		}
		long bitis = System.nanoTime();
		System.out.println(
				this.isim + " adlı koşucu " + this.mesafe + " metreyi " 
		+ (bitis - this.baslangicZamani) + " ns de koştu.");
	}

	public String getIsmi() {
		return isim;
	}

	public void setIsmi(String isim) {
		this.isim = isim;
	}

	public int getMesafe() {
		return mesafe;
	}

	public void setMesafe(int mesafe) {
		this.mesafe = mesafe;
	}

	public long getBaslangicZamani() {
		return baslangicZamani;
	}

	public void setBaslangicZamani(long baslangicZamani) {
		this.baslangicZamani = baslangicZamani;
	}

	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("Kosucu [ismi=");
		builder2.append(isim);
		builder2.append(", mesafe=");
		builder2.append(mesafe);
		builder2.append(", baslangicZamani=");
		builder2.append(baslangicZamani);
		builder2.append("]");
		return builder2.toString();
	}

}
