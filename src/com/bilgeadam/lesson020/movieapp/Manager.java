package com.bilgeadam.lesson020.movieapp;

public class Manager<T,ID> implements ICrud<T,ID> {

	@Override
	public T kayitEt(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guncelle(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sil(ID id) {
		System.out.println(id.getClass().getName());
		
	}

	

	

	

	


}
