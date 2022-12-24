package com.saswat.spring.springjdbc.employee.dao;

import java.util.List;

import com.saswat.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	int insert(Employee employee);

	int update(Employee employee);

	int delete(int id);

	Employee read(int id);

	List<Employee> read();
}
