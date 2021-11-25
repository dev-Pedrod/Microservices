package com.devpedrod.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devpedrod.hrworker.entities.Worker;

@Repository
public interface WorkerRespository extends JpaRepository<Worker, Long> {

}
