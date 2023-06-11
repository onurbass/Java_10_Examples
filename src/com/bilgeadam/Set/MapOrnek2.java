package com.bilgeadam.Set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOrnek2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime girin");
		String kelime=scanner.nextLine();
		
		Map<Character, Integer> kelMap = new HashMap<>();
	
		for (int i = 0; i < kelime.length(); i++) {
			if (!kelMap.containsKey(kelime.charAt(i))) {			
				kelMap.put(kelime.charAt(i), 1);			
			}
			else {
				kelMap.put(kelime.charAt(i), kelMap.get(kelime.charAt(i))+1);
			}
		}
		System.out.println(kelMap);
	}

}
