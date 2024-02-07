import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;

public class OopMain {

	public static void main(String[] args) {
		
		System.out.println("스페셜 생성자 호출을 통한 객체 생성");
		StudentDTO stu02 = new StudentDTO("정민지", 26, "노원구", "2018");
		
		System.out.println(stu02.toString());
		
		System.out.println("인스턴스 소유의 메서드에 접근 -> "+stu02.getName());
		System.out.println("인스턴스 소유의 메서드에 접근 -> "+stu02.getAge());
		System.out.println("인스턴스 소유의 메서드에 접근 -> "+stu02.getAddress());
		System.out.println("인스턴스 소유의 메서드에 접근 -> "+stu02.getStuId());
		
		// 나이 변경 후 변경된 값 확인
		stu02.setAge(-100);
		System.out.println("인스턴스 소유의 메서드에 접근 -> "+stu02.getAge());
		
		// 강사객체 생성후 정보 확인
		System.out.println();
		System.out.println("강사객체 생성후 정보 확인");
		TeacherDTO tea01 = new TeacherDTO("임섭순", 30, "서초구","1992");
		
		System.out.println(tea01.teacherInfo());
		System.out.println();
		
		// 직원객체 생성 후  정보 확인(Employee - name, age, address, dept)
		EmployeeDTO emp = new EmployeeDTO("채영", 25, "강남구", "교육운영팀");
		System.out.println(emp.employeeInfo());
	}

}
