package com.bilgeadam.lesson032.singleton.enums;

public class EvHalki extends Thread {
	private Robot robot;
	
	
	public EvHalki() {
		super();
		this.robot = Robot.ROBOT;
	}
 @Override
public void run() {
	robotCagir();
}

	public void robotCagir() {
		Robot.ROBOT.calis();
		
	}

}
