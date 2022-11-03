package com.gl.employee.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.gl.employee.model.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}