package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Employee;
import com.spring.demo.service.EmployeeService;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {
	
	@Qualifier("employeeServiceImpl")
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
		
	return employeeService.save(employee);
	}
	
	@GetMapping("/list")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	
	@GetMapping("/{employeeId}")
	public Employee getEmployeeById(@PathVariable String employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmpById(@PathVariable String id) {
		return employeeService.deleteById(id);
	}
	
}
