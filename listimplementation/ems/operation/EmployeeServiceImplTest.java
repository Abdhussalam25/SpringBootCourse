package listimplementation.ems.operation;

import listimplementation.ems.dto.Employee;
import listimplementation.ems.service.EmployeeServiceImpl;

public class EmployeeServiceImplTest {

	public static void main(String[] args) {
		EmployeeServiceImpl impl=new EmployeeServiceImpl();
		impl.addEmployee(new Employee(1, "San","Man", "IT", 660000));
		impl.addEmployee(new Employee(2, "Sanjee","Kumar", "IT", 440000));
		impl.addEmployee(new Employee(3, "Sangeet","Singh", "HR", 663330));
		impl.addEmployee(new Employee(4, "Santosh","Gupta", "Production", 688000));
		impl.addEmployee(new Employee(5, "Vidhya","Chandel", "Production", 680000));
		impl.getEmployees();
		System.out.print(impl.getEmployeeById(3));
		System.out.print(impl.delEmployee(2));
		impl.getEmployees();
		System.out.print(impl.getEmployeeById(2));
		System.out.print(impl.modEmployee(3,"Testing"));
		impl.getEmployees();

	}

}
