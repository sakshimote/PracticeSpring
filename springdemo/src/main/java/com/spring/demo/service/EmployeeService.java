package com.spring.demo.service;

import java.util.List;

import com.spring.demo.model.Employee;

public interface EmployeeService {
	
	Employee save(Employee employee);
	
	List<Employee> getEmployees();
	
	Employee getEmployeeById(String employeeId);

	String deleteById(String id);

}
