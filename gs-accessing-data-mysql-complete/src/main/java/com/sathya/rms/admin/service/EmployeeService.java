package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Employee;

public interface EmployeeService {
	
public Iterable<Employee> getAllEmployee();
	
	public Employee insertEmployee(Employee employee);
	
   public Employee updateEmployee(Employee employee);
   
   public void deleteEmployee(Integer id);

}
