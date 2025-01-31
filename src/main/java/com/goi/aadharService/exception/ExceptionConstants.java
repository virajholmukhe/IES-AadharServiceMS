package com.goi.aadharService.exception;

import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:messages.properties")
public enum ExceptionConstants {

	INVALID_AADHAR_NUMBER("aadharNumber.invalid");

	private final String type;
	
	private ExceptionConstants(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.type;
	}
}
