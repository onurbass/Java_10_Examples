package com.bilgeadam.odev004;

public class Antrenor extends TeknikHeyet implements ITaktik {
	private String alani;
	
	
	@Override
	public void teknikOgret() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void taktikVer() {
		// TODO Auto-generated method stub
		
	}

	public Antrenor(String isim, String alani) {
		super(isim);
		this.alani = alani;
	}

	public String getAlani() {
		return alani;
	}

	public void setAlani(String alani) {
		this.alani = alani;
	}

	@Override
	public String toString() {
		return "Antrenor [alani=" + alani + "]";
	}
	

}
