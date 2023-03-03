package com.pro.demo.expection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.pro.demo.entity.Worker;

@ControllerAdvice
@Component
public class WorkerException extends ResponseEntityExceptionHandler {

	public ResponseEntity<Worker> handeledWorkerException(){
		return new ResponseEntity("Worker not found " , HttpStatus.CONFLICT);
	}
	
	
}
