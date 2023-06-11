package com.bilgeadam.lesson009;

public class Question45 {

	public static void main(String[] args) {
		int [] sayilar = {1,4,5,6,1,1,4,8};
		kontrol(sayilar);
	}

	public static void kontrol(int[] dizi) {
		int sayac =0;
		int sayac2=0;
		for (int i = 0; i < dizi.length; i++) {
			
			if (dizi[i]==1) {
				sayac++;
			}
			if (dizi[i]==4) {
				sayac2++;
				
			}
			
		}
		System.out.println("1 lerin sayısı = "+sayac+"\n4lerin sayısı = "+sayac2);
		System.out.println(sayac>sayac2);
		
	}

}
