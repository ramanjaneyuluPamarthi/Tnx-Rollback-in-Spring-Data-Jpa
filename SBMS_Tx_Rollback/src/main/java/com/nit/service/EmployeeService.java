package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Address;
import com.nit.entity.Employee;
import com.nit.repositories.AddressRepository;
import com.nit.repositories.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional             //It is used for when any Exception in btw Tnx the rollback
	public void saveData() {         //total Tnx (Atomosity)
			Employee emp =new Employee("johny",8000.0);
			Employee emp1 = new Employee("hareesh",5900.0);
			Employee emp2 = new Employee("Mb",5990.0);
			
			List<Employee> list = new ArrayList<>();
			list.add(emp);list.add(emp1);list.add(emp2);
			List<Employee> saveAll = employeeRepo.saveAll(list);
			System.out.println(saveAll);
			
			int i = 10/0;            //Here AE occurs (divide by zero error)
			Address address =new Address("Patna","Bhr","India",3);
			Address add2 = new Address("Vij","AP","India",1);
			
			List<Address> list2 = new ArrayList<>();
			list2.add(address);list2.add(add2);
			List<Address> saveAll2 = addressRepository.saveAll(list2);
			System.out.println(saveAll2);
	}

}
