package com.bilgeadam.odev002;

public  abstract class Database {
//Databselerde veri ekleme veri silme ver guncellemeverileri getirme ve login metotlarımız olucak

	public abstract void veriEkle(Database data);

	public abstract void veriSil(Database data);

	public abstract void veriGuncelle(Database data);

	public abstract void veriGetir(Database data);

	public abstract void login();

}
