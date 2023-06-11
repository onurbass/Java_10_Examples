package com.bilgeadam.odev005;

import java.util.List;
import java.util.Objects;

public class Ders {
	private EDersler ders;
	private List<Double> notlar;
	
	
	public Ders(EDersler ders) {
		
		this.ders = ders;
	}
	public EDersler getDers() {
		return ders;
	}
	public void setDers(EDersler ders) {
		this.ders = ders;
	}
	public List<Double> getNotlar() {
		return notlar;
	}
	public void setNotlar(List<Double> notlar) {
		this.notlar = notlar;
	}
	@Override
	public String toString() {
		return "Ders [ders=" + ders + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ders);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ders other = (Ders) obj;
		return ders == other.ders;
	}
	
	
	
	

}
