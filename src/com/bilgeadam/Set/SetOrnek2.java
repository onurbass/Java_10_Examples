package com.bilgeadam.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek2 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime girin");
		String kelime = scanner.nextLine();
		Set<Character> tekrarEden = new HashSet<>();
		Set<Character> tekrarEtmeyen = new HashSet<>();
		
		for (int i = 0; i < kelime.length(); i++) {
			char harf = kelime.charAt(i);
			if (!tekrarEden.contains(harf)) {
				if (tekrarEtmeyen.contains(harf)) {
					tekrarEtmeyen.remove(harf);
					tekrarEden.add(harf);
				}
				else {
					tekrarEtmeyen.add(harf);
				}	
			}
		}
		System.out.println(tekrarEden);
		System.out.println(tekrarEtmeyen);
	}
	
}
