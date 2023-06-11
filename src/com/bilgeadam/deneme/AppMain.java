package com.bilgeadam.deneme;

public class AppMain {

	public static void main(String[] args) {

		IUcabilir ucak = new Ucak();
		IUcabilir heli = new Heli();
		
		sesVer(heli);
		sesVer(ucak);
		
		
		

	}
	public static void sesVer(IUcabilir x) {
		
		x.ses();
	}
	


}
