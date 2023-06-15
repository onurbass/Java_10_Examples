package com.bilgeadam.lesson029.okulApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.bilgeadam.lesson029.Movie;

public class FileManager {

	static String path = "D:\\Java10-Workspace\\ogrenci.txt";

	public static List<Ogrenci> dosyadanVeriOku(String ogretmenIsmi) {
		List<Ogrenci> list = new ArrayList<>();

		String veri = "";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			while ((veri = bufferedReader.readLine()) != null) {
				String[] array = veri.split(",");
				String isim = array[0];
				List<String> notList = Arrays.asList(array).subList(1, 4);
				double ort = ortHesapla(notList);

				LocalDate date = Utility.formatliLocalDateCevirme(array[4], "dd/MM/yyy");
				Ogrenci ogrenci = new Ogrenci(isim, ort, date);

				list.add(ogrenci);
				System.out.println(
						ogretmenIsmi + " adlı ogretmen => " + ogrenci.getIsim() + " adlı ogrencinin notlarını okudu");

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return list;

	}

	public static void ogretmenDosyasıOlustur(String ogretmenIsmi, List<Ogrenci> ogrencis) {
		String path = "D:\\Java10-Workspace\\" + ogretmenIsmi + ".txt";
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

			oos.writeObject(ogrencis);

			System.out.println("Serilize işlemi başarılı");
		} catch (Exception e) {
			System.out.println("Serilize işlemi başarısız");
			e.printStackTrace();
		}

	}

	public static List<Ogrenci> ogrencileriGetir(String ogretmenIsmi) {
		String path = "D:\\Java10-Workspace\\" + ogretmenIsmi + ".txt";
		List<Ogrenci> list = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
			list = (List<Ogrenci>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private static double ortHesapla(List<String> notList) {
		return notList.stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}

}
