import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

// import 간단하게하는 단축키 : ctrl + shift + O(알파벳)

public class RefAryMain {

	public static void main(String[] args) {
		/*
		 	배열이란? (Collection)
		 	- 객체로 취급, [], 0에서부터 시작, length, 고정길이, sameType만 담는다.
		 	- 배열에 담을 수 있는 요소의 타입(기본, 참조)
		 	
		 	int[] ary; -- 선언
		 	int[10] ary; -- error 배열선언시 길이 고정은 안됨
		 	ary = new int[10] -- 배열 생성(10개의 방을 가지는,,)
		 	String[] ary = {};
		 	String[] ary = new String[10]{} -- error
		 */
		
		// 학생 객체 30명을 만들어서 관리하고 싶다면?
		// StudentDTO stu01, stu02. stu03, ...., stu30;

		StudentDTO[] stuAry = new StudentDTO[30];
		int idx = 0;
		stuAry[idx++] = new StudentDTO("여경원", 27, "서울", "1997");

		// 만약, 학생 강사 직원 객체를 담는 배열을 사용하고자 한다면? -우리는 3개의 배열을 만들어야 한다.
		// 변수의 다형성이 적용된다면? - 배열이 1개만 있으면된다.
		
		Person stu = new StudentDTO();
		//stu.setStudId("2000") -- error 부모타입은 자식에 접근할 수 없다.
		//((StudentDTO)stu).setStuId("2000"); -- 캐스팅을 통한 자식의 구성요소에 접근
		Person emp = new EmployeeDTO();
		Person tea = new TeacherDTO();
		
		//타입의 다형성을 배열에 적용한다면?
		Person [] perAry = new Person[10];
		int perIdx = 0;
		perAry[perIdx++] = new StudentDTO("여경원", 28, "서울", "1997");
		perAry[perIdx++] = new TeacherDTO("여경원", 28, "서울", "자바");
		perAry[perIdx++] = new EmployeeDTO("여경원", 28, "서울", "교육 운영팀");
		
		for(int i=0; i< perAry.length; i++) {
			Person per = perAry[i];
//			if(per instanceof StudentDTO) {
//				StudentDTO obj = (StudentDTO) per;
//				System.out.println(obj.studnetInfo());
//			}
//			if(per instanceof TeacherDTO) {
//				TeacherDTO obj = (TeacherDTO) per;
//				System.out.println(obj.teacherInfo());
//			}
//			if(per instanceof EmployeeDTO) {
//				EmployeeDTO obj = (EmployeeDTO) per;
//				System.out.println(obj.employeeInfo());
//			}
			if(per == null) {
				break;
			}
			System.out.println(per.personInfo());
			
		}//end for
		
		System.out.println(">>> main demon thread end <<<");
	}//end main
	
}
