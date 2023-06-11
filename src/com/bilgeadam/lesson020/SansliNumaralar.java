package com.bilgeadam.lesson020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;

/*
 * 
 * 
 */

public class SansliNumaralar {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new TreeSet<>();
		Random random = new Random();

		for (int i = 0; i < 10000; i++) {
			int sayi = random.nextInt(1, 101);

			if (!map.containsKey(sayi)) {
				map.put(sayi, 1);

			} else {
				map.put(sayi, map.get(sayi) + 1);
			}

		}

		System.out.println(map);

		for (int sayi : map.keySet()) {
			for (int j = 0; j < map.get(sayi); j++) {
				list.add(sayi);
			}
		}

		Collections.shuffle(list);
		while (set.size() < 10) {
			int secim = random.nextInt(list.size());
			set.add(list.get(secim));
		}

		List<String> tireList = set.stream().map(x -> (x > 50)&&(x<80) ? "-" + x + "-" : "*" + x + "*")
				.collect(Collectors.toList());
		
		List<Integer> list4 = set.stream().filter(x -> x <70&&x>30).map(x->x*2).collect(Collectors.toList());
		list4.stream().forEach(System.out::println);
	System.out.println(tireList);
	//	System.out.println(list4);
	
	int toplam = set.stream().filter(x -> x <70&&x>30).mapToInt(Integer::intValue).sum();
	int toplam2=set.stream().filter(x -> x <70&&x>30).reduce((a,b)-> a+b).get();//tüm islemler yapılabilir
		
		System.out.println(toplam);
		System.out.println(toplam2);
		
		List<String> list6= new ArrayList<>(
				List.of("Ankara","Mersin","Adana","van","muş"));
		//List<String> list7= list6.stream().filter(x->x.startsWith("A")).collect(Collectors.toMap(null, null));
	//	System.out.println(list7);
		
	}

}
