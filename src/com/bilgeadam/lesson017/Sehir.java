package com.bilgeadam.lesson017;

import java.util.Random;

import com.bilgeadam.odev002.Database;

public class Sehir implements ISehir {

	private String isim;
	private String plaka;
	private long nufus;

	public Sehir() {

	}

	public Sehir(String isim, String plaka) {
		super();
		this.isim = isim;
		this.plaka = plaka;
	}

	public Sehir(String isim, String plaka, long nufus) {

		this.isim = isim;
		this.plaka = plaka;
		this.nufus = nufus;
	}

	public Sehir(String isim) {
		this.isim = isim;
	}

	@Override
	public String[] plakaKoduUret() {
		String[] plakalar = new String[SehirDatabase.iller.length];
		for (int i = 0; i < plakalar.length; i++) {
			if (i < 10) {
				plakalar[i] = "0" + (i + 1);
			} else {
				plakalar[i] = Integer.toString(i + 1);
			}

		}
		return plakalar;

	}

	@Override
	public long[] rastgeleNufusUret() {
		long[] sehirNufus = new long[SehirDatabase.iller.length];
		Random random = new Random();
		long randomNufus = 0;
		for (int i = 0; i < sehirNufus.length; i++) {
			randomNufus = random.nextLong(20000000);
			if (randomNufus < 100000) {
				i--;
			} else {
				sehirNufus[i] = randomNufus;
			}

		}
		return sehirNufus;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public long getNufus() {
		return nufus;
	}

	public void setNufus(long nufus) {
		this.nufus = nufus;
	}

	@Override
	public String toString() {
		return "Sehir [isim=" + isim + ", plaka=" + plaka + ", nufus=" + nufus + "]";
	}

}