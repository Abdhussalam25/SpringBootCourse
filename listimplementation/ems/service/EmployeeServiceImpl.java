package listimplementation.ems.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import listimplementation.ems.dto.Employee;
import listimplementation.ems.exception.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService{
	private List <Employee>employees;
	
	public EmployeeServiceImpl() {
		employees=new ArrayList<Employee>();
	}
	
	//Adding new emploee record
	@Override
	public void addEmployee(Employee emp) {
		employees.add(emp);
		
	}

	//showing all records
	@Override
	public void getEmployees() {
		System.out.print("\nAll Employees details are:");
		for(Employee emp:employees) {
			System.out.print(emp);
		}
	}

	//getting perticuler Employee if exist by empId
	@Override
	public Employee getEmployeeById(int empId) {
		Employee temp=SearchEmployee(empId);
		return temp;
	}

	@Override
	public Employee modEmployee(int empId, String firstName, String lastName) {
		Employee temp=SearchEmployee(empId);
		temp.setFirstName(firstName);
		temp.setLastName(lastName);
		return temp;
	}

	@Override
	public Employee modEmployee(int empId, float salary) {
		Employee temp=SearchEmployee(empId);
		temp.setSalary(salary);
		return temp;
	}

	@Override
	public Employee modEmployee(int empId, String deptName) {
		Employee temp=SearchEmployee(empId);
		temp.setDeptName(deptName);
		return temp;
	}

	@Override
	public Employee modEmployee(int empId, String firstName, String lastName, float salary) {
		Employee temp=SearchEmployee(empId);
		temp.setFirstName(firstName);
		temp.setLastName(lastName);
		temp.setSalary(salary);
		
		return temp;
	}

	@Override
	public Employee delEmployee(int empId) {
		Employee temp=SearchEmployee(empId);
		employees.remove(temp);
		return temp;
	}

	@Override
	public Employee SearchEmployee(String searchWord) {
		Iterator itr=employees.iterator();
		boolean status=false;
		Employee temp=null;
		while(itr.hasNext()) {
			temp=(Employee)itr.next();
			if(temp.getFirstName().equalsIgnoreCase(searchWord) ||
					temp.getLastName().equalsIgnoreCase(searchWord)||
					temp.getDeptName().equalsIgnoreCase(searchWord)
					) {
				status=true;
			}
		}
		try {
		if(temp==null) {
			throw new EmployeeNotFoundException(searchWord+" not found in the list..");
		}
		}catch(EmployeeNotFoundException e) {
			System.err.print("\n"+e.getMessage());
		}
		return null;
	}
	@Override
	public Employee SearchEmployee(int empId) {
		Employee temp=null;
		for(Employee emp:employees) {
			if(emp.getEmpId()==empId) {
				temp=emp;
			}
		}
		try {
		if(temp==null) {
			throw new EmployeeNotFoundException(empId+" not found in the list..");
		}
		}catch(EmployeeNotFoundException e) {
			System.err.print("\n"+e.getMessage());
		}
		
		return temp;
	}

	

}
