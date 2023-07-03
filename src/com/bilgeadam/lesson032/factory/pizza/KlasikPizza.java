package com.bilgeadam.lesson032.factory.pizza;

public class KlasikPizza extends Pizza{

	public KlasikPizza(double fiyat, EBoyut boyut, EHamur hamurTipi, ETur turu) {
		super(fiyat, boyut, hamurTipi, turu);
		// TODO Auto-generated constructor stub
	}

	public KlasikPizza(EBoyut boyut, EHamur hamurTipi, ETur turu) {
		super(boyut, hamurTipi, turu);
		// TODO Auto-generated constructor stub
	}

}
