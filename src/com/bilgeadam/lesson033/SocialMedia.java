package com.bilgeadam.lesson033;

public abstract class SocialMedia {
	
	private String type;
	private int scaleRatio;


	public String getType() {
		return type;
	}
	
	public abstract int arrangeScaleRatio(String type);

	public int getScaleRatio() {
		return scaleRatio;
	}

	public void setScaleRatio(int scaleRatio) {
		this.scaleRatio = scaleRatio;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}

