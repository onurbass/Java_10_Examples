package com.bilgeadam.lesson032.factory.pizza;

public abstract class Pizza {
double fiyat;
EBoyut boyut;
EHamur hamurTipi;
ETur turu;


public Pizza(EBoyut boyut, EHamur hamurTipi, ETur turu) {
	super();
	this.boyut = boyut;
	this.hamurTipi = hamurTipi;
	this.turu = turu;
}


public Pizza(double fiyat, EBoyut boyut, EHamur hamurTipi, ETur turu) {
	super();
	this.fiyat = fiyat;
	this.boyut = boyut;
	this.hamurTipi = hamurTipi;
	this.turu = turu;
}


public double getFiyat() {
	return fiyat;
}
public void setFiyat(double fiyat) {
	this.fiyat = fiyat;
}
public EBoyut getBoyut() {
	return boyut;
}
public void setBoyut(EBoyut boyut) {
	this.boyut = boyut;
}
public EHamur getHamurTipi() {
	return hamurTipi;
}
public void setHamurTipi(EHamur hamurTipi) {
	this.hamurTipi = hamurTipi;
}
public ETur getTuru() {
	return turu;
}
public void setTuru(ETur turu) {
	this.turu = turu;
}


@Override
public String toString() {
	return "Pizza [fiyat=" + fiyat + ", boyut=" + boyut + ", hamurTipi=" + hamurTipi + ", turu=" + turu + "]";
}


}
