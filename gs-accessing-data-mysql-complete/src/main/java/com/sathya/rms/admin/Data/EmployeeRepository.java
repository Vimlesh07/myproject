package com.sathya.rms.admin.Data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
