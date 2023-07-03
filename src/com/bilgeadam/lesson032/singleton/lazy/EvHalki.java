package com.bilgeadam.lesson032.singleton.lazy;

public class EvHalki extends Thread {
	private Robot robot;
	
	
	public EvHalki() {
		super();
		this.robot = robot.getInstance();
	}


	public void robotCagir() {
		robot.run();
		
	}
	 @Override
	 public void run() {
	 	robotCagir();
	 }
}
