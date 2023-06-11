package com.bilgeadam.lesson020.movieapp;

public class Cast  {
	private String isim;
	private String soyIsim;
	private long id;

	public Cast(String isim, String soyIsim) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
	}
 
	public Cast(String isim, String soyIsim, long id) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	@Override
	public String toString() {
		return "Cast [isim=" + isim + ", soyIsim=" + soyIsim + "]";
	}

	

}
