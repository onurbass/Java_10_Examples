package com.bilgeadam.lesson032.factory;

public class MonoDb implements ILogger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(message+"monoDB loglandı");
	}

}
