package com.revature.exceptions;

public class NegativeEggsException extends RuntimeException {

	private static final long serialVersionUID = -6142581419312457367L;

	public NegativeEggsException() {
		super();
	}

	public NegativeEggsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NegativeEggsException(String message, Throwable cause) {
		super(message, cause);
	}

	public NegativeEggsException(String message) {
		super(message);
	}

	public NegativeEggsException(Throwable cause) {
		super(cause);
	}
}
