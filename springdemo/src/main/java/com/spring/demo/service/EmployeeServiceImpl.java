package com.spring.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.demo.exception.EmployeeNotFoundException;
import com.spring.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	List<Employee> list=new ArrayList<>();

	@Override
	public Employee save(Employee employee) {

		 list.add(employee);
		 return employee;
	}

	@Override
	public List<Employee> getEmployees() {
		return list;
	}

	@Override
	public Employee getEmployeeById(String employeeId) {
		
		return list.stream()
						.filter(employee->employee.getEmployeeId()
						.equalsIgnoreCase(employeeId))
						.findFirst().orElseThrow(()->new RuntimeException("employee with given id not found"));
		
	}

	@Override
	public String deleteById(String id) {
		// TODO Auto-generated method stub
		
		Employee e=list.stream()
				.filter(employee->employee.getEmployeeId()
				.equalsIgnoreCase(id))
				.findFirst().get();
		list.remove(e);
		return "delete successfully";
		
		
	}

}
