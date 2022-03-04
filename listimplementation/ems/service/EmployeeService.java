package listimplementation.ems.service;

import listimplementation.ems.dto.Employee;

public interface EmployeeService {
	void addEmployee(Employee emp);
	void getEmployees();
	Employee getEmployeeById(int empId);
	Employee modEmployee(int empId,String firstName,String lastName);
	Employee modEmployee(int empId,float salary);
	Employee modEmployee(int empId,String deptName);
	Employee modEmployee(int empId,String firstName,String lastName,float salary);
	Employee delEmployee(int empId);
	Employee SearchEmployee(int empId);
	Employee SearchEmployee(String searchWord);
}
