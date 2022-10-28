package com.example.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bootcamp.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

}
