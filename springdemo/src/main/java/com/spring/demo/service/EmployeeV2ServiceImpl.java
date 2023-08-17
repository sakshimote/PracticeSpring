/**
 * 
 */
package com.spring.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.entity.EmployeeEntity;
import com.spring.demo.model.Employee;
import com.spring.demo.repository.EmployeeRepository;

/**
 * @author sakschan
 *
 */

@Service
public class EmployeeV2ServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		
		EmployeeEntity employeeEntity=new EmployeeEntity();
		BeanUtils.copyProperties(employee, employeeEntity);
		
             employeeRepository.save(employeeEntity);
             return employee;
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		
		List<EmployeeEntity> list2=employeeRepository.findAll();
		
		List<Employee> list3=list2.stream().map(employeeEntity ->
		{Employee employee=new Employee();
		BeanUtils.copyProperties(employeeEntity, employee);
		return employee
				;}).collect(Collectors.toList());
		return list3;
		
	}

	@Override
	public Employee getEmployeeById(String employeeId) {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntity=employeeRepository.findById(employeeId).get();
		Employee e=new Employee();
		BeanUtils.copyProperties(employeeEntity,e );
		return e;
	}

	@Override
	public String deleteById(String id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		return "delete successfully";
	}
	

}
