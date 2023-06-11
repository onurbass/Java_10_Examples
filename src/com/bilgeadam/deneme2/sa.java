package com.bilgeadam.deneme2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sa {

	public static void main(String[] args) {
		List< Integer> list=Arrays.asList(1,5,6,7);

		
		list=list.stream().map(t-> t+10).collect(Collectors.toList());
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		}

	}


