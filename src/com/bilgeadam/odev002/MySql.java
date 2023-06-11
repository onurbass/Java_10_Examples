package com.bilgeadam.odev002;

public class MySql extends Database {

	@Override
	public void veriSil(Database data) {
		System.out.println("MySql veritabanından veri silindi");

	}

	@Override
	public void veriGuncelle(Database data) {
		System.out.println("MySql veritabanında veri güncellendi");

	}

	@Override
	public void veriGetir(Database data) {
		System.out.println("MySql veritabanından veri getirildi");

	}

	@Override
	public void login() {
		System.out.println("MySql veritabanına giriş yapıldı");

	}

	@Override
	public void veriEkle(Database data) {
		System.out.println("Mysql veri tabanına veri eklendi");

	}

}
