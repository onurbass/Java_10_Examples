package com.bilgeadam.lesson026;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SerlizationTest {
	static String dosyaYolu = "D:\\Java10-Workspace\\serilestirme.txt";
	static String dosyaYolu2 = "D:\\Java10-Workspace\\serilestirme2.txt";

	public static void main(String[] args) {
		Movie movie = new Movie("Seven", "Drama", LocalDate.of(1995, 5, 5));
		Movie movie3 = new Movie("Pulp Fiction", "Drama", LocalDate.of(1994, 5, 5));

		List<Movie> movies = new ArrayList<>(List.of(movie, movie3));
		List<Movie> yeniList = deserializationList();
		serilizationList(yeniList);
		serilization(movie);
		Optional<Movie> movie2 = deserialization();

		if (movie2.isEmpty()) {
			System.out.println("Başarısız");

		} else {
			System.out.println("Başarılı");
			System.out.println(movie2.get());
		}
	}

	private static void serilizationList(List<Movie> movies) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(dosyaYolu2))) {
			for (Movie movie : movies) {
				objectOutputStream.writeObject(movie);
			}

			System.out.println("İşlem başarılı");

		} catch (FileNotFoundException e) {
			System.out.println("Başarısız");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Başarısız");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void serilization(Movie movie) {

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(dosyaYolu))) {
			objectOutputStream.writeObject(movie);
			System.out.println("İşlem başarılı");

		} catch (FileNotFoundException e) {
			System.out.println("Başarısız");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Başarısız");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Optional<Movie> deserialization() {
		Movie movie = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dosyaYolu))) {
			movie = (Movie) ois.readObject();
			System.out.println("deserileştirme başarılı");
		} catch (FileNotFoundException e) {
			System.out.println("deserileştirme işlemi başarısız");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("deserileştirme işlemi başarısız");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("deserileştirme işlemi başarısız");
			e.printStackTrace();
		}
		return Optional.ofNullable(movie);
	}

	public static List<Movie> deserializationList() {
		List<Movie> movies = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dosyaYolu))) {
			Movie movie=null;
			while ((movie=(Movie) ois.readObject())!=null) {
				
				movies.add(movie);
			}
			
			System.out.println("deserileştirme başarılı");
		} catch (EOFException e) {
			System.out.println("deserileştirme işlemi başarısız");
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			System.out.println("deserileştirme işlemi başarısız");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("deserileştirme işlemi başarısız");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("deserileştirme işlemi başarısız");
			e.printStackTrace();
		}
		return movies;
	}

}
