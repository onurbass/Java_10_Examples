package com.bilgeadam.lesson032.factory;

import javax.management.RuntimeErrorException;

public class DataBaseFactory {
public static ILogger createDatabase(String isimString) {
	if (isimString.equalsIgnoreCase("monodb")) {
		return new MonoDb();
		
		
	}
	else if (isimString.equalsIgnoreCase("postgresql")) {
		return new PostgreSql();
		
	}
	else {
		throw new RuntimeException("hata");
	}
	
	
}
}
