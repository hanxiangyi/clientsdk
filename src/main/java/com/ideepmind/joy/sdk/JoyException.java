package com.ideepmind.joy.sdk;

public class JoyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JoyException(String message, Throwable cause) {
        super(message, cause);
    }

	public JoyException(String message) {
		super(message);
	}

	public JoyException(Throwable cause) {
		super(cause);
	}	
}
