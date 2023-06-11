package com.bilgeadam.lesson012;

public class Student {
	
	String isimString;
	static int index;
	int no;

	
	public void Kayıt(String isim) {
		index++;
		no=index;
	System.out.println(isim+" adlı öğrenci başarı ile kaydedildi.Numarası : "+(no));
	}

}
