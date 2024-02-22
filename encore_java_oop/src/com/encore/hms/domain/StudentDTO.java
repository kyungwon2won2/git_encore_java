package com.encore.hms.domain;



import com.encore.hms.domain.sup.Person;

public class StudentDTO extends Person {

	// 상속관계에서 공통의 요소로 제거
//	private String name;
//	private int age;
//	private String address;
	
	// 자기 자신만의 고유한 요소
	private String stuId;
	
	public StudentDTO() {
		super();
	}

	public StudentDTO(String name, int age, String address, String stuId) {
		super(name, age, address);
		this.setStuId(stuId);
	}


	public String getStuId() {
		return stuId;
	}


	public void setStuId(String stuId) {
		this.stuId = stuId;
	}


	public String studnetInfo() {
		//return "name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", stuId=" + this.getStuId();
		return super.personInfo()+", stuId="+this.getStuId();
	}
	
	// Overriding (상속관계에서 부모의 메서드를 자식에게 재정의하는 것)
	// 접근지정자, 반환타입, 메서드명, 매개변수 타입과 갯수가 일치해야함.
	@Override //오버라이드 체크해준다.
	public String personInfo() {
		return super.personInfo()+", stuId="+this.getStuId();
	}
	
}
