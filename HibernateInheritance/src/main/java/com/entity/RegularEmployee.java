package com.entity;

public class RegularEmployee extends Employee{

	
	private float empSalary;
    private float bonus;
	public RegularEmployee() {
		super();
	}
	public RegularEmployee(float empSalary, float bonus) {
		super();
		this.empSalary = empSalary;
		this.bonus = bonus;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "RegularEmployee empSalary=" + empSalary + ", bonus=" + bonus + ", getEmpSalary()=" + getEmpSalary()
				+ ", getBonus()=" + getBonus() + ", getEmpId()=" + getEmpId() + ", getEmpFirstName()="
				+ getEmpFirstName() + ", getEmpLastName()=" + getEmpLastName() + ", getEmpEmailId()=" + getEmpEmailId()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() ;
	}
    
    
}
