package com.goi.aadharService.exception;

public class AadharServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AadharServiceException(String errors) {
		super(errors);
	}
}
