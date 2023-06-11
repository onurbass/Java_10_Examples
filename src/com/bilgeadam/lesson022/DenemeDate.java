package com.bilgeadam.lesson022;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DenemeDate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doğum tarihi giriniz (Örn.2023-06-05)");
		String dogumTarihi = scanner.nextLine();
		LocalDate dogumDate = LocalDate.parse(dogumTarihi);
		System.out.println("Yaşanan yıl=>" + (LocalDate.now().getYear() - dogumDate.getYear()));
		System.out.println("Yaşanan gün=>" + (ChronoUnit.DAYS.between(dogumDate, LocalDate.now())));
		System.out.println("Yaşanan ay=>" + (ChronoUnit.MONTHS.between(dogumDate, LocalDate.now())));

	}

}
