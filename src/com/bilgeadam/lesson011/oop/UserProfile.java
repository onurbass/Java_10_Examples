package com.bilgeadam.lesson011.oop;

public class UserProfile {
	String avatar;
	String username;
	String name;
	String surName;
	int followers;
	int followings;
	int postNumber;
	
	public void editProfile() {
		System.out.println("Profil düzenlendi");
	}
	
	public void createPost() {
		System.out.println("Yeni bir post oluşturuldu");
	}
}

