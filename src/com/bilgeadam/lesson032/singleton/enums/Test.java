package com.bilgeadam.lesson032.singleton.enums;

public class Test {
public static void main(String[] args) {
	EvHalki evHalki1=new EvHalki();
	EvHalki evHalki2=new EvHalki();
	EvHalki evHalki3=new EvHalki();
	
	evHalki1.start();
	evHalki2.start();
	evHalki3.start();
	
}
}
