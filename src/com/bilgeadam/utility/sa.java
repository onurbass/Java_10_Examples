package com.bilgeadam.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.bilgeadam.lesson029.okulApp.FileManager;

public class sa {

	public static void main(String[] args) {
		File file = new File("D:\\Java10-Workspace\\ogrenci.txt");
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				System.out.println(scanner.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<Integer, String> listMap = new HashMap<>();
		for (Entry<Integer, String> string : listMap.entrySet()) {
			
		}

	}

}
