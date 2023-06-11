package com.bilgeadam.lesson015.polimorfizm;

import java.util.Arrays;



public class Kullanici {

	private String ad;
	private Pokemon[] pokemonlar;

	public Kullanici(String ad) {

		this.ad = ad;
	}

	public Kullanici(String ad, com.bilgeadam.lesson015.polimorfizm.Pokemon[] pokemonlarPokemons) {
		super();
		this.ad = ad;
		this.pokemonlar = pokemonlarPokemons;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Pokemon[] getPokemonlarPokemons() {
		return pokemonlar;
	}

	public void setPokemonlar(Pokemon[] pokemonlar) {
		this.pokemonlar = pokemonlar;
	}

	@Override
	public String toString() {
		return "Kullanici [ad=" + ad + ", pokemonlar=" + Arrays.toString(pokemonlar) + "]";
	}

}
