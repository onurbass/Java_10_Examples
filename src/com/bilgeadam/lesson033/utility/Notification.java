package com.bilgeadam.lesson033.utility;

public class Notification {

	

	public static void smsGonder(User user) {
		if (user.getPhone()!=null) {
			System.out.println(user.getEmail()+" mail gönderiliyor...");
		} else {
			System.out.println("sms gönderilemedi");
		}
		
		
	}

	public static void emailGonder(User user) {
		if (user.getEmail()!=null) {
			System.out.println(user.getPhone()+" sms gönderiliyor...");
		} else {
			System.out.println("mail gönderilemedi");
		}
		
		
	}
}
