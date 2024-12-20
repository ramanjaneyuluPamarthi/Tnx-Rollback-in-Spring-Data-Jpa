package com.nit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Serializable>{
	
}