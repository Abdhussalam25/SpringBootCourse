package com.bean;

public class EmployeeAddress {
	private int empId;
	private String houseNumber;
	private String state;
	private String country;
	private String pinCode;
	private Employee employee;

	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeAddress() {
	}
	public EmployeeAddress(String houseNumber, String state, String country, String pinCode) {
		super();
		this.houseNumber = houseNumber;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "\nempId=" + empId + ", houseNumber=" + houseNumber + ", state=" + state + ", country="
				+ country + ", pinCode=" + pinCode;
	}
	
	

}
