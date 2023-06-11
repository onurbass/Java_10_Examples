package com.bilgeadam.lesson020.movieapp;

public interface ICrud<T,ID> {

	T kayitEt(T t);

	void guncelle(T t);

	void sil(ID id);

}