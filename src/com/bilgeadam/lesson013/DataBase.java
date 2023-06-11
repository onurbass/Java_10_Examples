package com.bilgeadam.lesson013;

public class DataBase {

	public static Kullanıcı[] kullanıcılar;

}

class Kullanıcı {
	public enum Urun {
		CIPS, KOLA, SEKER, YAG, UN, EKMEK, ÇAY, YUMURTA, YOGURT, SUT;
	}

	private String sifre;
	private String username;
	private int id;

	public static void main(String[] args) {

		Kullanıcı user1 = new Kullanıcı();
		user1.setUsername("user1sepet");
		user1.setSifre("12345user1");

		Kullanıcı user2 = new Kullanıcı();
		user2.setSifre("12345user2");
		user2.setUsername("user2sepet");
		Kullanıcı user3 = new Kullanıcı();
		user3.setUsername("user3sepet");
		user3.setSifre("12345user3");

		Urun[] Uruns = Urun.values();
	}
	

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private void girisYap(String sifre, String username) {

	}

	private void kayitOl(String sifre, String username) {

	}
}
