package com.bilgeadam.lesson032.factory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isimString=Utility.stringDegerAlma("Database ismi girin");
		ILogger logger=DataBaseFactory.createDatabase(isimString);
		
		
		
		logger.log(logger.getClass().getName());
	}

}
