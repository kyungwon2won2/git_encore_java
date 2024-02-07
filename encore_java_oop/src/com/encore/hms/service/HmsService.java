
package com.encore.hms.service;

import java.util.Arrays;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;
/*
 * business logic 가지고 있는 클래스
 * 1. 배열을 관리
 * 2. 생성된 배열에 학생, 강사, 직원 객체를 담을 것
 * 3. 배열의 인덱스를 이용해서 찾기, 수정, 삭제 등의 기능을 수행할 것 
 */
public class HmsService {
	
	private Person [] perAry ;  
	private int idx ; 
	
	public HmsService() {
	}
	
	public HmsService(int size) {
		perAry = new Person[size] ; 
	}
	
	// 객체 생성 후 배열에 담는 로직.
	public String makePerson(HmsType flag , String name, int age, String address, String comm) {
		String msg = null ;
		Person obj = null ; 
		switch(flag) {
			case STU : 
				obj = new StudentDTO(name, age, address, comm);
				break;
			case TEA : 
				obj = new TeacherDTO(name, age, address, comm);
				break;
			case EMP :
				obj = new EmployeeDTO(name, age, address, comm);
				break;
		}
		setAry(obj);
		return (idx-1) + "번지에 데이터를 담았습니다." ; 
	}


	private void setAry(Person per) {
		perAry[idx++] = per ; 
	}

	public Person [] getAry() {
		return perAry ; 
	}

	public int getIdx() {
		return idx ; 
	}
	
	//찾기
	public Person searchPerson(String name) {
		Person person = null;
		for(int idx=0; idx<perAry.length; idx++) {
			person = perAry[idx];
			if(person != null) {
				if(person.getName().equals(name)) {
					return person;
				}
			}
		}
		return null;
	}
	
	//수정
	public Person updatePerson(String name) {
	
// deep copy 방법
// 1. 배열객체가 가지고있는 clone();
// 2. Arrays.copyOf(ary, ary.length());
		
//방법1.
//		Person[] copyAry = perAry.clone();
//		System.out.println("original ary address : "+perAry);
//		System.out.println("copy ary address : "+copyAry);
		
//방법2.
//		import java.util.Arrays;
//		Person[] copyAry = Arrays.copyOf(perAry, perAry.length);
//				System.out.println("original ary address : "+perAry);
//				System.out.println("copy ary address : "+copyAry);
		
		return searchPerson(name); //기능이 같아서 searchPerson으로 넘겨버림
	}
	
	
	public boolean removePerson(String name) {
		boolean flag = false;
		for(int i=0; i<perAry.length; i++) {
			Person person  = perAry[i];
			if(person != null) {
			if(person.getName().equals(name)) {
				for(int j=i; j<perAry.length-1; j++) {
					perAry[j] = perAry[j+1];
				}
				idx = idx -1;
				perAry[idx] = null;
				return true;
			}
		}
		}
		return false;
	}
}

