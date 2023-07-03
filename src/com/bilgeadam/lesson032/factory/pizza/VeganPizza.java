package com.bilgeadam.lesson032.factory.pizza;

public class VeganPizza extends Pizza{

	public VeganPizza(double fiyat, EBoyut boyut, EHamur hamurTipi, ETur turu) {
		super(fiyat, boyut, hamurTipi, turu);
		// TODO Auto-generated constructor stub
	}

	public VeganPizza(EBoyut boyut, EHamur hamurTipi, ETur turu) {
		super(boyut, hamurTipi, turu);
		// TODO Auto-generated constructor stub
	}

}
