package com.bilgeadam.Set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek {
	public static void main(String[] args) {

		String[] ogrenci = { "Mustafa", "Ece", "Elif" };
		//int[] notlar = { 60, 80, 75 };
		int[][] notlar2 = { { 50, 50, 50 }, { 80, 90, 80 }, { 70, 50, 86 } };
		Map<String,int[] > ogrenciMap = new HashMap<>();

		for (int i = 0; i < ogrenci.length; i++) {
	
				ogrenciMap.put(ogrenci[i],notlar2[i]);	

		}
		 for (Entry<String, int[]> deger : ogrenciMap.entrySet()) {
			 System.out.println(deger.getKey() +"notları - ");
			 int toplam=0;
			 for (int not : deger.getValue()) {
				System.out.println(not);
				toplam+=not;
			}
			 System.out.println("ortalama = "+toplam/deger.getValue().length);
			 System.out.println("====");
			
		}
	}

}
