package com.revature.exceptions;

public class TransferNegativeFundsException extends RuntimeException {

	private static final long serialVersionUID = 2436814938513231849L;

	public TransferNegativeFundsException() {
		super();
	}

	public TransferNegativeFundsException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public TransferNegativeFundsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TransferNegativeFundsException(String arg0) {
		super(arg0);
	}

	public TransferNegativeFundsException(Throwable arg0) {
		super(arg0);
	}
}
