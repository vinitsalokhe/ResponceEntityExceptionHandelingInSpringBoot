package com.pro.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.demo.entity.Worker;
@Repository
public interface WorkerDao extends JpaRepository<Worker, Integer> {

}
