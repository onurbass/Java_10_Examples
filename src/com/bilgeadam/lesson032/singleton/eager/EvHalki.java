package com.bilgeadam.lesson032.singleton.eager;

public class EvHalki extends Thread {
	private Robot robot;
	
	
	public EvHalki() {
		super();
		this.robot = robot.getRobot();
	}

	 @Override
	 public void run() {
	 	robotCagir();
	 }
	public void robotCagir() {
		robot.run();
		
	}

}
