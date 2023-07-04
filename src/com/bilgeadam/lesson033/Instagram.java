package com.bilgeadam.lesson033;

import com.bilgeadam.lesson033.utility.Notification;
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
public class Instagram extends SocialMedia {

	public Instagram() {

	}

	public void bildirimGonder(User user) {
		mailGonder(user);
		smsmGonder(user);

	}

	public void mailGonder(User user) {
		if (user.getEmail() != null) {
			Notification.emailGonder(user);
		}
	}

	public void smsmGonder(User user) {
		if (user.getPhone() != null) {
			Notification.smsGonder(user);
		}

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

}
