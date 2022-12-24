package com.saswat.spring.springjdbc.employee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.saswat.spring.springjdbc.employee.dao.EmployeeDao;
import com.saswat.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.saswat.spring.springjdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id = ?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> employees = jdbcTemplate.query(sql, rowMapper);
		return employees;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String toString() {
		return "EmployeeDaoImpl [jdbcTemplate=" + jdbcTemplate + "]";
	}

}
