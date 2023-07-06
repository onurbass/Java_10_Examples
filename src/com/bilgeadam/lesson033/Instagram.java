package com.bilgeadam.lesson033;

import com.bilgeadam.lesson033.utility.User;

/*

* bir bildirim gonder metodu yazmanızı istioyrum

*  daha sonra eğer kullanıcın  emaili varsa email gonder

*  telefonu varsa sms gondersin hem telefon hem email varsa ikisinide gondersin

*

*  bildirim gonder==> Kullanıcı

*  sms==>> 555-555-555 ==> sms gonderiliyor

*  email=> mustafa@gmail.com ==> email gonderiliyor



*/
public class Instagram extends SocialMedia implements IEmail, ISms, IPostPaylas {

	public Instagram() {

	}

	@Override
	public int arrangeScaleRatio(String type) {
		int scaleRatio;

		if (type.equalsIgnoreCase("jpg")) {
			scaleRatio = 38;
		} else if (type.equalsIgnoreCase("png")) {
			scaleRatio = 30;
		} else {
			scaleRatio = 40;
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
	public void smsGonder(User user) {
		if (user.getPhone() != null) {
			System.out.println(user.getEmail() + " mail gönderiliyor...");
		} else {
			System.out.println("sms gönderilemedi");
		}

	}


	@Override
	public void sharePost() {
		// TODO Auto-generated method stub

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

}
