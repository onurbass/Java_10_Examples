package com.bilgeadam.lesson007;

public class Question39 {

	public static void main(String[] args) {
		String value1 = "Merhaba Dünya";
		String value2 = "java";
		System.out.println(value1.length());// stringin uzunluğu
		System.out.println(value1.charAt(0));// o indexteki character
		System.out.println(value1.concat(value2));

		String value3 = value1.concat(value2);// =(value1+value2)
		String value4 = new String("Merhaba Dünya");

		System.out.println(value3);
		System.out.println(value1.substring(5));// o indexten sonrasını alır öncesini almaz
		System.out.println(value1.substring(3, value1.length()));// (aralık için(index,index) yazmak gerek)
		System.out.println(value1.contains("Mer"));// Parantez içini içeriyor mu? true/false
		System.out.println(value1.equalsIgnoreCase(value2));// Eşit mi? (Ignore büyük küçük harfi görmezden gelir)
		System.out.println(value1.replace('a', 'e'));// bir karakteri girilenle değiştirir
		System.out.println(value1 == value4);// ****Bellekteki yerlerini kontrol eder
		System.out.println(value1.equals(value4));// ****içeriğin aynı mı olduğunu kontrol eder

		System.out.println(value1.indexOf('a'));// karakterin hangi indexte olduğunu bulma
		System.out.println(value1.toUpperCase());// karakterleri büyük harfe çeviriyor ama değişkeni değiştirmiyor
		System.out.println(value1.toLowerCase());// karakterleri küçük harfe çevirir
		System.out.println(value1.startsWith("Mer") && value1.endsWith("ya"));// başlangıç ve bitiş karakter kontrolü
																				// true/false
		String valString = "Java,React,.Net";
		String[] diziStrings = valString.split(","); // stringi diziye yazdırır

		for (int i = 0; i < diziStrings.length; i++) {
			System.out.print(diziStrings[i] + " ");

		}
		System.out.println();
		char[] array = valString.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		int a = 15 + 22;

	}
}
