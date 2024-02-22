package com.encore.grade.entity;

public class StudentDTO extends EmployeeDTO {
	private int oracle;
	private int java;
	private int servlet;

	public StudentDTO() {
		super();
	}
	
	public StudentDTO(String name, String employeeNo, int age, int oracle, int java, int servlet) {
		super(name, employeeNo, age);
		this.oracle = oracle;
		this.java = java;
		this.servlet = servlet;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getServlet() {
		return servlet;
	}

	public void setServlet(int servlet) {
		this.servlet = servlet;
	}
	
	public int getTotal() {
		
		return oracle+java+servlet;
	}
	
	public double getAverage() {
		
		return getTotal()/3.0;
	}

	public String toString() {
		return super.empInfo()+" "+oracle +" "+ java+" "+servlet+" "+getTotal()+" "+getAverage();
	}

}
