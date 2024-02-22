package com.encore.hms.view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.service.HmsListSerivce;
import com.encore.hms.service.HmsService;
import com.encore.hms.util.HmsType;

public class HmsListView {
	
	public static Scanner scan = new Scanner(System.in) ;  
	
	// HmsView 는 HmsService 와 의존성 주입(Dependency Injection)관계가 형성 
	// 즉, HmsView는 HmsService의 객체 생성을 통한 접근을 필요로 하는 것.
	
	private HmsListSerivce service ; 
	
	public HmsListView() {
		service = new HmsListSerivce(10); 
	}
	
	public void mainMenu() {
		service.loadToFile();
		while(true) {
			System.out.println();
			System.out.println(">>>> HMS Ver1.0 <<<"); 
			System.out.println("1.  전체출력");
			System.out.println("2.  이름으로 검색");
			System.out.println("3.  이름으로 찾아서 수정");
			System.out.println("4.  이름으로 찾아서 삭제");
			System.out.println("5.  생성");
			System.out.println("99. 종료");
			System.out.print("Input Number : "); 
			try {
				int number = scan.nextInt() ; 
				switch(number) {
					case 1 : 
						perPrint();
						break;
					case 2 : 
						search();
						break;
					case 3 : 
						update();
						break;
					case 4 : 
						remove();
						break;
					case 5 : 
						subMenu();
						break;
					case 99 : 
						System.out.print("데이터를 저장(Y?N) 하시겠습니까?  ") ; 
						String confirmYN = scan.next();
						if(confirmYN.equalsIgnoreCase("y")) {
							service.saveToFile();
							System.out.println("데이터 저장 완료!!");
						}else {
							System.out.println("프로그램을 종료하고 데이터는 보관되지 않습니다.");
						}
						System.exit(0) ;
					default : 
						System.out.println("메뉴에 정의된 숫자만 입력해 주세요. PLZ ") ;
						
				} // switch end block
			} catch(Exception e) {
				System.out.println("숫자만 입력하세요....");
				scan.nextLine();
			}
		} // while end block 
	} // main menu end block 
	
	/*
	Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서 
	존재할 경우 해당 객체의 정보를 출력하고
	존재하지 않을 경우 '정보가 존재하지 않습니다' 라는 메시지를 출력 
	HmsView - HmsSerive(searchPerson(String name))
	*/
	public void search() {
		System.out.println();
		System.out.println(">>> search <<<<");
		System.out.print("이름을 입력하세요 : ");
		scan.nextLine();
		String name = scan.nextLine();
        Person person = service.searchPerson(name);
        if(person == null) {
        	System.out.println("정보가 존재하지 않습니다");
        }else {
        	System.out.println( person.personInfo() ); 
        }
	}
	/*
	Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서 
	존재할 경우 해당 객체의 학생-학번, 강사-과목, 직원-부서를 수정하고
	'정보를 수정하였습니다' 라는 메시지 출력
	HmsView - HmsSerive(updatePerson(String name))
	*/
	public void update() {
		System.out.println();
		System.out.println(">>> 수정 <<<");
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		Person obj = service.updatePerson(name) ; 
		if(obj != null) {
			if (obj instanceof StudentDTO) {
				System.out.print("수정할 학번을 입력하세요 : ");
				String stuId = scan.next();
				((StudentDTO)obj).setStuId(stuId);
			}
			if (obj instanceof TeacherDTO) {
				System.out.print("수정할 과목을 입력하세요 : ");
				String subject = scan.next();
				((TeacherDTO)obj).setSubject(subject);
			}
			if (obj instanceof EmployeeDTO) {
				System.out.print("수정할 부서를 입력하세요 : ");
				String dept = scan.next();
				((EmployeeDTO)obj).setDept(dept);
			}
		}else {
			System.out.println("정보가 존재하지 않습니다");
		}
	}
	/*
	Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서 
	존재할 경우 해당 객체를 배열에서 삭제하고
	'객체를 삭제하였습니다' 라는 메시지 출력
	그리고  
	전체출력을 했을 때 정상적으로 출력되면 OK
	HmsView - HmsSerive(removePerson(String name))
 	*/
	public void remove() {
		System.out.println();
		System.out.println(">>> remove <<<<");
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
        Person person = service.searchPerson(name);
        if(person == null) {
        	System.out.println("정보가 존재하지 않습니다");
        }else {
        	 boolean flag = service.removePerson(name);
        	 if(flag == true) {
        		 System.out.println("객체를 삭제하였습니다");
        	 }else {
        		 System.out.println("이유를 모르지만 작업 수행 미이행");
        	 }
        }
	}
	
	public void perPrint() {
		System.out.println();
		System.out.println(">>> 전체 출력 <<<<");
		
		List<Person> perAry = service.getAry() ;
		if(service.getIdx() == 0) {
			System.out.println();
			System.out.println(">>> 데이터가 존재하지 않습니다. <<<");
			System.out.println();
		}else {
			
			// Iterator -> for문 쓰는것보다 성능이 좋음
			Iterator<Person> iter = perAry.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next().personInfo());
			}
			
			///////// or 
			/*
			for(Person per : perAry) {
				System.out.println(per.personInfo());
			}
			*/
		}
	}
	public void subMenu() {
		while(true) {
			System.out.println();
			System.out.println(">>> 객체 생성을 위한 Sub Menu <<<");
			System.out.println("1.  학생");
			System.out.println("2.  강사");
			System.out.println("3.  직원");
			System.out.println("99. 상위메뉴 이동");
			System.out.print("Input Number : "); 
			int number = scan.nextInt() ; 
			switch(number) {
				case 1 : 
				case 2 : 
				case 3 :
					makePerson(number); 
					break;
				case 99 : 
					return ; 
			} // switch end block
		}
	}
	
	public void makePerson(int number) {
		System.out.println();
		System.out.println(">>> 객체 생성 <<<<");
		
		// Scanner name, age, address, comm
		// HmsService - makePerson() 연결
		scan.nextLine();
		System.out.print("이름을 입력하세요 : ");
        String name = scan.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();
        System.out.print("주소를 입력하세요 : ");
        scan.nextLine();
        String address = scan.nextLine();
        /*
        String common = (number == 1) ? 
        		"학번을 입력해주세요" : (number == 2) ? 
        				"과목을 입력해주세요" : "부서를 입력해주세요" ;
        */
        String comm = null ;
        String msg  = null ; 
        switch(number) {
        	case 1 :
        		System.out.print("학번을 입력해주세요 : ");
                comm = scan.nextLine();
                msg = service.makePerson(HmsType.STU, name, age, address, comm) ; 
                break;
        	case 2 :
        		System.out.print("과목을 입력해주세요 : ");
                comm = scan.nextLine();
                msg = service.makePerson(HmsType.TEA, name, age, address, comm) ;
                break;
        	case 3 :
        		System.out.print("부서을 입력해주세요 : ");
                comm = scan.nextLine();
                msg = service.makePerson(HmsType.EMP, name, age, address, comm) ;
                break;
        }
        System.out.println(msg); 
	}
}