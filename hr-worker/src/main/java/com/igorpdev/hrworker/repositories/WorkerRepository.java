package com.igorpdev.hrworker.repositories;

import com.igorpdev.hrworker.entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    
}
