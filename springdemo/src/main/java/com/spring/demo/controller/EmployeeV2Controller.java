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
@RequestMapping("/v2/employee")
public class EmployeeV2Controller {

	@Qualifier("employeeV2ServiceImpl")
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee e) {
		return employeeService.save(e);
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
