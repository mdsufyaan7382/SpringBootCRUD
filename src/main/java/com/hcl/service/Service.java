package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.entity.Employee;
import com.hcl.repository.IEmployee;
import com.hcl.repository.ITask;


@org.springframework.stereotype.Service
public class Service {
	@Autowired
	 IEmployee Repo;
	@Autowired
	 ITask Repo1;
	
	public String Welcome() {
		return "Welcome to Spring Boot JPA MySQL Project";
}
	public List<Employee> getAllEmployee(){
		return Repo.findAll();
	}
	public void addAllEmployee(Employee e){
		 Repo.save(e);
	}
	
}
