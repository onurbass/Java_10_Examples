package com.bilgeadam.odev005;

public enum ErrorType {
	OGRENCI_DERSE_SAHIP(1001, "Ogrenci zaten derse sahip"), 
	ZATEN_RAPORLU(1002, "Kişi zaten raporlu"),
	ZATEN_IZINLI(1003,"Çalışan zaten yıllık izinde"),
	OBJE_YOK(1004,"Listede bulunamadı");

	private int code;
	private String message;

	private ErrorType(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
