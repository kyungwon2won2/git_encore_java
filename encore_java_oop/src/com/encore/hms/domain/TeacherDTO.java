package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

public class TeacherDTO extends Person {
	private String name;
	private int age;
	private String address;
	/////
	private String subject;
	
	public TeacherDTO() {
		super();
	}
	
	public TeacherDTO(String name, int age, String address, String subject) {
		super(name, age, address);
		this.subject = subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String teacherInfo() {
		//return "name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", subject=" + this.getSubject();
		return super.personInfo() +", subject="+this.getSubject();
	}
	
	@Override
	public String personInfo() {
		//return "name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", subject=" + this.getSubject();
		return super.personInfo() +", subject="+this.getSubject();
	}
	
	
	
	
}
