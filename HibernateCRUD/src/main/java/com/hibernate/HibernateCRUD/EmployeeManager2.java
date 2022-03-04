package com.hibernate.HibernateCRUD;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.HibernateCRUD.entity.Employee;

public class EmployeeManager2 {
	
	public static Session getSession() {
		Session session=new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory()
				.openSession();
		return session;
	}
	public static void addRecord(Employee employee) {
		boolean recStatus=false;
		try {
			Transaction tx=null;
			Session session=null;
			session=EmployeeManager2.getSession();
			tx=session.beginTransaction();
			session.save(employee);
			tx.commit();
			recStatus=true;	
		}catch(HibernateException e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			if(recStatus==true) {
				System.out.print("\n Record  has been added successfully...");
			}else {
				System.err.print("\nPlease check error, no record added..");
			}	
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void showRecords() {
		List<Employee>employees=null;
		int rec=0;
		try {
			Transaction tx=null;
			Session session=null;
			session=EmployeeManager2.getSession();
			employees=session.createQuery("from Employee").list();
			Iterator <Employee>itr=employees.iterator();
			while(itr.hasNext()) {
				System.out.print("\n"+itr.next());
				rec++;
			}
		}catch(HibernateException e) {
			System.err.print("\n"+e.getMessage());
		}finally {
			if(rec>0) {
				System.out.print("\n "+rec+" Records found...");
			}else {
				System.err.print("\n No Record found...");
			}	
		}
	}
	
	public static void showRecord(int id) {
		Employee emp=null;
		Session session=null;
		try {
		session=EmployeeManager2.getSession();
		emp=(Employee) session.get(Employee.class, id);
		if(emp==null) {
			System.err.print("\nNo record found for id:"+id);
		}else {
		System.out.print(emp);
		}
		}catch(HibernateException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void modRecord(int id,float salary) {
		Scanner sc = new Scanner(System.in);
		boolean recStatus=false;
		Transaction tx=null;
		Employee emp=null;
		Session session=null;
		try {
		session=EmployeeManager2.getSession();
		tx=session.beginTransaction();
		emp=(Employee) session.get(Employee.class, id);
		System.out.print("\nEmploye data:"+emp);
		emp.setEmpSalary(salary);
		session.update(emp);
		session.flush();
		recStatus=true;
		
		}catch(HibernateException e) {
			System.err.println(e.getMessage());
		}finally {
			if(recStatus==true) {
				tx.commit();
				session.close();
				System.out.print("\n  Records updated...");
			}else {
				tx.rollback();
				session.close();
				System.err.print("\n No Record found...");
			}
		}
	}
	
	public static void delRecord(int id) {
		boolean recStatus=false;
		Transaction tx=null;
		Employee emp=null;
		Session session=null;
		try {
		session=EmployeeManager2.getSession();
		tx=session.beginTransaction();
		emp=(Employee) session.get(Employee.class, id);
		session.delete(emp);
		session.flush();
		recStatus=true;
		
		}catch(HibernateException e) {
			System.err.println(e.getMessage());
		}finally {
			if(recStatus==true) {
				tx.commit();
				session.close();
				System.out.print("\n  Records deleted..."+emp);
			}else {
				tx.rollback();
				session.close();
				System.err.print("\n No Record found for id:"+id);
			}
		}
	}
	
	public static void main(String[] args) {
		Employee temp=null;
		Scanner sc = new Scanner(System.in);
		
	    int choice;
		do { 
		System.out.println("Enter your choice between 0 to 5");
		System.out.println("1. Add Employee \n 2. Show all records \n 3. modifiy salary "
				+ "\n 4. show a single record \n5. delete a single record \n press 0  to exit");		
		 
		 choice = sc.nextInt();
	    
		
		switch(choice) {
		     
		case 1:
			addEmployeeDetails();
			break;
		case 2:
			showRecords();
			break;
		case 3:
			modifyRecord();
			break;
		case 4:
			showRecord();
			break;
		case 5:
		    deleteRecord();
		    break;
		case 0:
			System.exit(0);
			break;	
		default:{
			System.err.println("Please Enter a valid choice between 0 to 5 only;");
		}
		}
		
		}while(choice != 0);
		
		
		

	}
	private static void deleteRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of employee to be deleted");
		int empId = sc.nextInt();
		delRecord(empId);
		
	}
	private static void showRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of employee to display");
		int empId = sc.nextInt();
		showRecord(empId);
		
		
	}
	private static void modifyRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of employee which has to be modified");
		int empId = sc.nextInt();
		System.out.println("Enter the salary to be recorded");
		float salary = sc.nextFloat();
		modRecord(empId,salary);	
		
	}
	private static void addEmployeeDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ID of employee ");
		int empId = sc.nextInt();
		System.out.println("Enter the First name of employee ");	
		String fName = sc.next();
		System.out.println("Enter the last name of employee ");	
		String lname = sc.next();
		System.out.println("Enter the employee email id");			
		String empEmailId = sc.next();
		System.out.println("Enter the salary of employee ");	
		float empSalary = sc.nextFloat();
		Employee emp = new Employee(empId,fName,lname,empEmailId,empSalary);
		
		addRecord(emp);
		
		
		
	}

}
