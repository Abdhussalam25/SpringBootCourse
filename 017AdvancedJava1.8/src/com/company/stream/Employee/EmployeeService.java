package com.company.stream.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeService {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee("Aravind" , 23),
				new Employee("Vivek" , 32),
				new Employee("Raziya" , 33),
				new Employee("Anand" , 35),
				new Employee("Suhayl" , 25),
				new Employee("Ragav" , 28)
				);
		
		employees.stream().limit(3).forEach(System.out::println);
 
	}

}
