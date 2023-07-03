package com.bilgeadam.lesson032.factory;

public class PostgreSql implements ILogger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(message+"postgre loglandı");
	}

}
