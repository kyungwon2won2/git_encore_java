package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

public class EmployeeDTO extends Person {
	private String name;
	private int age;
	private String address;
	private String dept;
	
	public EmployeeDTO() {
		super();
	}
	
	public EmployeeDTO(String name, int age, String address, String dept) {
		super(name, age, address);
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	public String employeeInfo() {
		//return "EmployeeDTO [name=" + name + ", age=" + age + ", address=" + address + ", dept=" + dept + "]";
		return super.personInfo() + ", dept=" + this.getDept();
	}
	
	@Override
	public String personInfo() {
		//return "EmployeeDTO [name=" + name + ", age=" + age + ", address=" + address + ", dept=" + dept + "]";
		return super.personInfo() + ", dept=" + this.getDept();
	}
	
	
	
}
