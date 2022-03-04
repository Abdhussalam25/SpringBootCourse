package com.application.sms.service;

import com.application.sms.dto.Student;

public interface StudentService {
	void addStudent(Student std);
	void getEmployees();
	Student getStudentByRollNo(int Rno);
	Student modStudentName(int Rno,String firstName);
	
	Student modStudentStream(int empId,String stream);
	Student modStudent(int empId,String firstName,String lastName,float salary);
	Student delStudent(int empId);
	Student SearchStudent(int empId);
	Student SearchStudent(String searchWord);
	

}
