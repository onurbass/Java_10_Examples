package com.bilgeadam.lesson033;

import com.bilgeadam.lesson033.utility.User;

public class Facebook extends SocialMedia implements IEmail,  IPostPaylas {

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

	@Override
	public void emailGonder(User user) {
		if (user.getEmail() != null) {
			System.out.println(user.getPhone() + " sms gönderiliyor...");
		} else {
			System.out.println("mail gönderilemedi");
		}
	}

	@Override
	public void sharePhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shareStory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sharePost() {
		// TODO Auto-generated method stub
		
	}



}
