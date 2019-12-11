package com.sathya.rms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.data.EmployeeRepository;
import com.sathya.rms.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
    private EmployeeRepository employeeRepository;
	

	public Iterable<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Transactional
	public Employee insertEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Transactional
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	
	public void deleteEmployee(Integer id) {
	 employeeRepository.deleteById(id);

	}

}
