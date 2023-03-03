package com.pro.demo.expection;

import org.springframework.http.HttpStatus;

public class WorkerNotFoundException extends RuntimeException {
	String msg;
	public WorkerNotFoundException(String msg , HttpStatus notFound) {
		super(msg);
		this.msg=msg;
	}

}
