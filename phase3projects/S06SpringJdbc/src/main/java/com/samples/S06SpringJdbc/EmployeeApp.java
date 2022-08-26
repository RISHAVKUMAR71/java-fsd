package com.samples.S06SpringJdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.samples.S06SpringJdbc.dao.EmployeeDAO;
import com.samples.S06SpringJdbc.dto.Employee;

/**
 * Hello world!
 *
 */
public class EmployeeApp 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S06SpringJdbc/SpringConfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) springContainer.getBean("employeedao");
		
		 createEmployee(employeeDao);
		
//		updateEmployee(employeeDao);
		
//		deleteEmployee(employeeDao);
		
//		readEmployee(employeeDao);
		
//		readAllEmployees(employeeDao);
		

	}

	private static void readAllEmployees(EmployeeDAO employeeDao) {
		List<Employee> employees = employeeDao.read();
		System.out.println(employees);
	}

	private static void readEmployee(EmployeeDAO employeeDao) {
		Employee employee = employeeDao.read(2);
		System.out.println(employee);
	}

	private static void deleteEmployee(EmployeeDAO employeeDao) {
		employeeDao.delete(1);
	}

	private static void updateEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Bob");
		emp.setLastName("Rockwell");
		
		employeeDao.update(emp);
	}

	private static void createEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setFirstName("Max");
		emp.setLastName("Miller");
		
		employeeDao.create(emp);
	}
}
