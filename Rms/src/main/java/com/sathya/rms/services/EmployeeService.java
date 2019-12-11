package com.sathya.rms.services;

import com.sathya.rms.entities.Employee;

public interface EmployeeService {
	
public Iterable<Employee> getAllEmployee();
	
	public Employee insertEmployee(Employee employee);
	
   public Employee updateEmployee(Employee employee);
   
   public void deleteEmployee(Integer id);

}
