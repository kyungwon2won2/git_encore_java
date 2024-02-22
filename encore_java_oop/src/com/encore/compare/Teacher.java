package com.encore.compare;

import java.util.Comparator;

/*
 Comparable [특징]
 - 자기 자신과 매개변수를 비교하는것
 - 구현 메서드는 compareTo()
 
 Comparator [특징]
 - 인자로 전달되는 두 객체의 기준값을 가지고 비교하는것
 - 구현 메서드는 compare()
*/
//public class Teacher implements Comparable<Teacher>

public class Teacher implements Comparator<Teacher>{
	private int age;
	private int classNumber;
	
	public Teacher() {
		super();
	}
	
	public Teacher(int age, int classNumber) {
		super();
		this.age = age;
		this.classNumber = classNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	@Override
	public String toString() {
		return "Teacher [age=" + age + ", classNumber=" + classNumber + "]";
	}

//	@Override
//	public int compareTo(Teacher o) {
//		if(this.age > o.age) {
//			return 1;
//		} else if(this.age == o.age) {
//			return 0;
//		} else {
//			return -1;
//		}
//	}

	@Override
	public int compare(Teacher obj01, Teacher obj02) {
		if(obj01.age > obj02.age) {
			return 1;
		} else if(obj01.age == obj02.age) {
			return 0;
		} else {
		return -1;
		}
	}
	

	
	
	
}
