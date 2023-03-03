package com.pro.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.demo.entity.Worker;
import com.pro.demo.services.WorkerServices;

@RestController
@RequestMapping("/wo-base")
public class WorkerController {

	
	@Autowired
	WorkerServices workerservices;
	@PostMapping("/insret")
	public ResponseEntity<Worker> createWorker(@RequestBody Worker wo){
		Worker w = workerservices.createWorker(wo);
		return new ResponseEntity<Worker>(w,HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Worker> getWorkerById(@PathVariable("id") int id){
		Worker w = workerservices.getWorkerById(id);
		return new ResponseEntity<Worker>(w,HttpStatus.FOUND);
	}
	@PutMapping("/updated/{id}")
	public ResponseEntity<Worker> editWorkerById(@PathVariable("id") int id, @RequestBody Worker wo){
		Worker w = workerservices.editWorkerById(id,wo);
		return new ResponseEntity<Worker>(w,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeWorkerById(@PathVariable("id") int id){
		workerservices.removeWorkerById(id);
		return ResponseEntity.ok("Worker Delete Succesfully");
	}
}
