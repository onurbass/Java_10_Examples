package com.bilgeadam.lesson012;

public class StudentTest {
	

	public static void main(String[] args) {
		
		Student ogr1 = new Student();
		Student ogr2 = new Student();
		ogr1.isimString = "Mustafa";
		ogr2.isimString = "Serkan";
		ogr1.Kayıt(ogr1.isimString );
		ogr2.Kayıt(ogr2.isimString);
		System.out.println(ogr1.no);
	}

}
