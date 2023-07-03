package com.bilgeadam.lesson032.singleton.eager;


public class Robot {
	
	private static Robot robot = new Robot();
	
	private Robot() {
		
	}
	
	public static Robot getRobot() {

		return robot;
		
	}

	public void run() {
		
		System.out.println(robot+" numaralı robot çalışıyor");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	
}
