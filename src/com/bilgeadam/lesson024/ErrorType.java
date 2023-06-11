package com.bilgeadam.lesson024;

public enum ErrorType {
	DOLU_YER_SECIMI(1001, "Sectiğiniz yer dolu"), 
	SINIR_DISI(1002, "Yaptığınız seçim sınır dışı"),
	AGIRLIK_YETERSIZ(1003,"Girdiğiniz ağırlık yetersiz");

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
