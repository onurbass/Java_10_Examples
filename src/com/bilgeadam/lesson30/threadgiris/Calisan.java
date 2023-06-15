package com.bilgeadam.lesson30.threadgiris;

public class Calisan extends Thread {
	String isim;

	public Calisan(String isim) {
		super();
		this.isim = isim;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + " adlı çalışan çalışıyor==>" + (i + 1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void calis() {

		for (int i = 0; i < 5; i++) {
			System.out.println(isim + "==>" + (i + 1)+"(main)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
