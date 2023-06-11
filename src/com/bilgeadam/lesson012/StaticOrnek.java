package com.bilgeadam.lesson012;

public class StaticOrnek {

	int number1;
	static int number2;

	public void numaraVer() {
		System.out.println("Numara ver metodu");
		number1 += 1;
		number2 += 1;
		System.out.println("number1 ==>"+number1);
		System.out.println("number2 ==>"+number2);
	}
	public static void numaraVer2() {
		System.out.println("Numara2 Metodo");
		number2++;
		System.out.println(number2);
		//System.out.println(number1); static bir metot içinde static olmayan bir özellik
		//direkt olarak kullanılamaz. Kullanmak için nesne oluşturmak gerekir.
	}
	public static void main(String[] args) {
		number2=5;
		StaticOrnek.number2=10;
		
		StaticOrnek staticOrnek = new StaticOrnek();
		staticOrnek.number1=10;
		System.out.println(number2);
		System.out.println(staticOrnek.number1);
		staticOrnek.numaraVer();
		staticOrnek = new StaticOrnek();
		staticOrnek.numaraVer();
		StaticOrnek staticOrnek2 = new StaticOrnek();
		System.out.println(staticOrnek2.number1);//static olmayan değişkenler nesneye özeldir. Her nesne üzerinden
		System.out.println(staticOrnek.number1);//değer verilir.
		System.out.println(staticOrnek2.number2);//static olanlar sınıfa özeldir. Nesneden nesneye değişmez.
		System.out.println(staticOrnek.number2);
	}

}
