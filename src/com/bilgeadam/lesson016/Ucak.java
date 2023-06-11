package com.bilgeadam.lesson016;

public class Ucak extends Arac implements IYukTasiyabilir{

	public Ucak(String plaka, boolean calisiyorMu) {
		super(plaka, calisiyorMu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yukAl() {
		System.out.println("Ucak yuk al");
		
	}

	@Override
	public void yukBosalt() {
		System.out.println("Ucak yuk bosalt");
		
	}

	@Override
	public void calistir() {
		System.out.println("Ucak calisti");
		
	}

	@Override
	public void durdur() {
		System.out.println("Ucak durduruldu");
		
	}
	public void kalkisYap() {
		System.out.println("Ucak kalkıyor");
	}
	public void inisYap() {
		System.out.println("Ucak iniyor");
	}

	@Override
	public void hizlan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yavasla() {
		// TODO Auto-generated method stub
		
	}

}
