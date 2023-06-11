package com.bilgeadam.odev002;

public class Oracle extends Database {

	@Override
	public void veriEkle(Database data) {
		System.out.println("Oracle veritabanına veri eklendi");

	}

	@Override
	public void veriSil(Database data) {
		System.out.println("Oracle veritabanından veri silindi");

	}

	@Override
	public void veriGuncelle(Database data) {
		System.out.println("Oracle veritabanında veri güncellendi");

	}

	@Override
	public void veriGetir(Database data) {
		System.out.println("Oracle veritabanından veri getirildi");

	}

	@Override
	public void login() {
		System.out.println("Oracle veritabanına giriş yapıldı");

	}

}
