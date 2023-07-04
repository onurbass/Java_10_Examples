package com.bilgeadam.lesson033;

public class Facebook extends SocialMedia{

	public Facebook() {
			
	}

	@Override
	public int arrangeScaleRatio(String type) {
		int scaleRatio;

		if (type.equalsIgnoreCase("jpg")) {
			scaleRatio = 34;
		} else if (type.equalsIgnoreCase("png")) {
			scaleRatio = 37;
		} else {
			scaleRatio = 45;
		}
		return scaleRatio;
	}

	
}
