import com.encore.hms.service.HmsService;
import com.encore.hms.util.HmsType;
import com.encore.hms.view.HmsView;

// 1. stu 2. tea 3. emp
// enum 

public class HmsMain {

	public static void main(String[] args) {
		/*
		HmsService service = new HmsService(10) ;
		String msg = service.makePerson(HmsType.TEA, "임정섭", 20, "서울", "1992");
		// 출력예시) 학생|강사|직원 객체를 배열에 담았습니다.
 		public static void main(String[] args) {
		System.out.println(msg);
		msg = service.makePerson(HmsType.EMP, "임정섭", 20, "서울", "교육 서비스팀");
		System.out.println(msg);
		}
		*/
		HmsView view = new HmsView();
		view.mainMenu(); 
	}
}