package com.bilgeadam.odev005;

public class OkulException extends RuntimeException {
	
	private final ErrorType errorType;

	public OkulException(ErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
	}

	public OkulException(ErrorType errorType, String message) {
		super(message);
		this.errorType = errorType;
	}

	public ErrorType getErrorType() {
		return errorType;
	}

	
	
	

}
