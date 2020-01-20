package com.codeclan.example.EmployeeTracker;

import com.codeclan.example.EmployeeTracker.models.Employee;
import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee() {
		Employee employee = new Employee("John Smith", 18, 12, "john@smith.com");
		Employee employee2 = new Employee("Jane Smith", 18, 13, "jane@smith.com");
		employeeRepository.save(employee);
		employeeRepository.save(employee2);
	}


}
