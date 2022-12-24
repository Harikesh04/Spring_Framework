package com.saswat.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.saswat.spring.springjdbc.employee.dao.EmployeeDao;
import com.saswat.spring.springjdbc.employee.dto.Employee;

public class Test {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/saswat/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");

//		Employee employee=new Employee();
//		employee.setId(6);
//		employee.setFirstname("babu");
//		employee.setLastname("panda");
//		int result = dao.insert(employee);
//		int result = dao.update(employee);
//		int result = dao.delete(6);
//		System.out.println("no of records inserted : "+result);

//		Employee emp = dao.read(1);
//		System.out.println("Employee : "+emp);

		List<Employee> employees = dao.read();
//		System.out.println(employees);
		for (Employee emp : employees) {
			System.out.println(emp.getId() + " " + emp.getFirstname() + " " + emp.getLastname());
		}
	}

}
