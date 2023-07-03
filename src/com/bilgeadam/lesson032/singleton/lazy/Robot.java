package com.bilgeadam.lesson032.singleton.lazy;


public class Robot {
	
	private static Robot robot;
	
	private Robot() {
		
	}
	
	public static Robot getInstance() {
		
		if (robot==null) {
			robot = new Robot();
		}
		
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
