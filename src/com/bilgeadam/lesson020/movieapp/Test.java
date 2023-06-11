package com.bilgeadam.lesson020.movieapp;

import java.util.List;

/*
 * 1-film sınıfımız olsun
 * 2-yonetmen olsun
 * 3 film turlerimiz olsun 
 * 4-her filmin bir puanı olsun 
 * 5-her filmin oyuncuları olsun 
 * 6-her sınıfın kaydet guncelle sil metodları olsun 
 * 
 * 
 */
public class Test {
	
	public static void main(String[] args) {
		
		Manager<Film,String> filmManager = new Manager<>();
		Manager<Cast, Long> castManager = new Manager<>();
		Yonetmen yonetmen = new Yonetmen("Miyazaki", null);
		
		
		
		Film film = new Film("Ruhlarin Kacisi", List.of(ETur.ANİME, ETur.DRAMA), yonetmen);
		castManager.sil(1L);
		filmManager.sil("ssss");
		
		filmManager.kayitEt(film);
		castManager.kayitEt(yonetmen);

	}
	

}
