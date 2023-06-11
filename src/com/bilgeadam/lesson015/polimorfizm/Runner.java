package com.bilgeadam.lesson015.polimorfizm;

import java.util.Arrays;
import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		Kullanici kullanici=new Kullanici("Mustafa");
		Pokemon atesPokemonu = new AtesPokemonu(1, "charizard", 2000, 300, 3, 1500);
		Pokemon suPokemonu = new SuPokemonu(2, "squirtle", 500, 100, 2, 250, 368);
		Pokemon elektrikPokemonu = new ElektrikPokemonu(3, "pikachu", 180, 200, 2, 1280);
		
		Pokemon[] pokemonlar= {atesPokemonu,suPokemonu,elektrikPokemonu};
		kullanici.setPokemonlar(pokemonlar);
		System.out.println(kullanici);
		pokemonSec(pokemonlar);
		Pokemon pokemon=pokemonSec(pokemonlar);
		saldır(pokemon);
		
	}
	
	public static void saldır(Pokemon pokemon) {
		pokemon.saldir();
	}
	public static Pokemon pokemonSec(Pokemon[] pokemonlar) {
		Random random = new Random();
		int index=random.nextInt(pokemonlar.length);
		
		return pokemonlar[index];
		
	}
}
