package com.pro.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pro.demo.dao.WorkerDao;
import com.pro.demo.entity.Worker;
import com.pro.demo.expection.WorkerNotFoundException;

@Service
public class WorkerServicesImpl implements WorkerServices{

	@Autowired
	WorkerDao workerdao;
	@Override
	public Worker createWorker(Worker wo) {
		return workerdao.save(wo);
	}
	
	@Override
	public Worker getWorkerById(int id) {
		return workerdao.findById(id).orElseThrow(() -> new WorkerNotFoundException("Worker with id no  :" + id + " not found", HttpStatus.NOT_FOUND));
	}
	
	@Override
	public Worker editWorkerById(int id, Worker wo) {
		Worker xx = workerdao.findById(id).get();
		xx.setName(wo.getName());
		xx.setCity(wo.getCity());
		xx.setSalary(wo.getSalary());
		return workerdao.save(xx);
	}
	
	@Override
	public void removeWorkerById(int id) {
		 workerdao.deleteById(id);
	}
	
	
}
