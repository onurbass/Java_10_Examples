package com.bilgeadam.lesson021;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;

public class Map {

	public static void main(String[] args) {
		List<String> list5 = new ArrayList<>(List.of("1","20","10","5","20"));
		List<Integer>list6= list5.stream().map(x->Integer.parseInt(x)*5).collect(Collectors.toList());;
		
		//list6.forEach(System.out::println);
		Set<Integer> set1=list5.stream().map(x->Integer.parseInt(x)*5).collect(Collectors.toSet());
		set1.forEach(System.out::println);
		

	}

}
