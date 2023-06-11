package com.bilgeadam.odev003;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrToIng {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime girin");
		String kelime = scanner.nextLine();
		char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
		char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };
		Map<Character, Character> harfMap = new HashMap<>();
		for (int i = 0; i < englishWords.length; i++) {
			harfMap.put(turkishWords[i], englishWords[i]);
		}
		for (int i = 0; i < kelime.length(); i++) {
			char harf = kelime.charAt(i);
			if (harfMap.containsKey(harf)) {
				kelime = kelime.replace(harf, harfMap.get(harf));
			}
		}
		System.out.println("Yeni kelime = " + kelime);
	}
}
