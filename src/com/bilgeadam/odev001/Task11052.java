package com.bilgeadam.odev001;

public class Task11052 {

	public static void main(String[] args) {
		System.out.println(turkceIngilizce("türkçeİngİlizçe"));

	}
	public static String turkceIngilizce(String ifade) {
	    String[] trKarakter = {"İ", "ı", "Ş", "ş", "Ç", "ç", "Ğ", "ğ", "Ü", "ü", "Ö", "ö"};
	    String[] engKarakter = {"I", "i", "S", "s", "C", "c", "G", "g", "U", "u", "O", "o"};
	    for (int i = 0; i < trKarakter.length; i++) {
	        ifade = ifade.replace(trKarakter[i], engKarakter[i]);
	    }
	    return ifade;
	}


}
