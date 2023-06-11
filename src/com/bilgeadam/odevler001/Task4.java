package com.bilgeadam.odevler001;

public class Task4 {

	public static void main(String[] args) {
		
		int ciftToplam =0;
		int tekToplam = 0;
		
		
		for (int i = 0; i <= 100 ; i+=2) {
			
			ciftToplam += i;
		}
		
		for (int i = 1; i <= 99; i+=2) {
			
			tekToplam+=i;
	
}
			double oran= (double) ciftToplam/tekToplam;
			
			System.out.println("Çift/Tek = "+oran);
	}

}
