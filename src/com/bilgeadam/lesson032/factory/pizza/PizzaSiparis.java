package com.bilgeadam.lesson032.factory.pizza;

import java.util.Iterator;

public class PizzaSiparis {

	public void menu() {
		System.out.println("Pizza siparis Menusu");
		Pizza pizza=pizzaSec();
		siparisHazirlama(pizza);
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public Pizza pizzaSec() {
		EBoyut boyut =boyutSec();
		return null;
	}

	public EBoyut boyutSec() {
		for (int i = 0; i < EBoyut.values().length; i++) {
			System.out.println((i+1)+"-"+EBoyut.values()[i]);
		}
		int secim = Utility.intDegerAlma("Tercih yap");
		
		return EBoyut.values()[secim-1];
	}

	public void siparisHazirlama(Pizza pizza) {
		// TODO Auto-generated method stub
		System.out.println("Siparisiniz=> "+pizza);
	System.out.println("Hazırlanıyor...");
	}
}
