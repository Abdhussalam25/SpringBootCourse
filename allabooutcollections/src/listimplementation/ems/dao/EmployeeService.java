package listimplementation.ems.dao;

import java.util.List;

import listimplementation.ems.dto.Employee;

public interface EmployeeService {
	void addEmployee(Employee emp);
	void allEmployees();
	Employee getEmployeeById(int empId);
	Employee UpdateEmployee(int empId,String firstName,String lastName);
	Employee modEmployee(int empId, float salary);
	Employee modEmployee(int empId, String dept);
	//Employee modEmployee(int empId, );
	Employee deleteById(int empId);
	Employee searchById(int empId);
	
	
	
}
