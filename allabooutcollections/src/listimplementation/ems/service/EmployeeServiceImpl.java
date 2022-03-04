package listimplementation.ems.service;

import java.util.ArrayList;
import java.util.List;

import listimplementation.ems.dao.EmployeeService;
import listimplementation.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private List<Employee> employees;
	
	public EmployeeServiceImpl() {
		
		employees = new ArrayList<Employee>();
		
	}

	@Override
	public void addEmployee(Employee emp) {
		
		employees.add(emp);
		
	}

	@Override
	public void allEmployees() {
		
		
		
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee UpdateEmployee(int empId, String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee modEmployee(int empId, float salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee modEmployee(int empId, String dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee searchById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
