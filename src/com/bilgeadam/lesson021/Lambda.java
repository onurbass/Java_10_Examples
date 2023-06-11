package com.bilgeadam.lesson021;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(List.of("java", "react", "html", "css"));
		list.stream().forEach(x->System.out.println(x.toUpperCase()));
		
	}

}
