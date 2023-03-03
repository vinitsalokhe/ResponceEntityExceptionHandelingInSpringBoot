package com.pro.demo.services;

import com.pro.demo.entity.Worker;

public interface WorkerServices {

	Worker createWorker(Worker wo);

	Worker getWorkerById(int id);

	Worker editWorkerById(int id, Worker wo);

	void removeWorkerById(int id);




}
