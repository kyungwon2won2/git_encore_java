import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

public class ArrayListMain {

	public static void main(String[] args) {
		
//		Number[] ary = new Number[5]; // static allocation
//		ary[0] = 10; ary[1] = 20; ary[2] = 30; ary[3] = 40; 
//		System.out.println("length : " + ary.length);
//		ary[2] = null;
//		System.out.println(Arrays.toString(ary));
		
		// -Array List-
//		List<Number> lst = new ArrayList<>();
//		lst.add(10); lst.add(20); lst.add(30); lst.add(40); lst.add(50);
//		System.out.println("length : " + lst.size()); // 자료구조는 size()
//		lst.remove(2);
//		System.out.println("length : " + lst.size()); // -> 동적임을 확인
		
		List<String> lst = new ArrayList<>();
		lst.add("A"); lst.add("B"); lst.add("C"); lst.add("D"); lst.add("E");
		System.out.println("length : " + lst.size());
		
		List<String> lst02 = new ArrayList<>();
		lst02.add("1"); lst02.add("2");
		lst.addAll(lst02);
		System.out.println(lst);
		lst.add(3, "F");
		System.out.println(lst);
		
		//////////// 주의점 //////////////
		//중간에 null을 포함하는 인덱스 번지에 추가할때에 예외가 발생됨!!
		//lst.add(300,"F");
		
		// 특정 인덱스 번지에 데이터를 삭제 : 인덱스가 밀림
		lst.remove(0);
		System.out.println(lst);
		
		// 요소 검색
		System.out.println(lst.contains("C") ? "요소검색 완료" : "요소검색 실패");
		System.out.println("검색된 요소의 인덱스 번지 : " + lst.indexOf("C"));
		
		// 요소 추출
		System.out.println(lst.get(0));
		
		// 요소의 부분 추출
		List<String> subLst = lst.subList(0, 5);
		System.out.println(subLst);
		
		// 요소 변경 : remove 후 변경
		lst.set(1, "encore");
		System.out.println(lst);
		
		// 사이즈를 동적으로 늘리는 작업이 가능
		// ensureCapacity()는 arraylist의 메서드 -> 다운캐스팅 후 사용
		((ArrayList<String>)lst).ensureCapacity(100);
		System.out.println(lst.size()); //size가 변하는것은 아님.
		
		// 보안상의 이유로 딥카피를 해야한다면?
		// arraylist는 클래스 -> Object를 상속받음
		// clone은 object의 메서드
		List<String> copyLst = (List<String>)((ArrayList<String>)lst).clone();
		System.out.println("original : " + lst);
		System.out.println("copy : " + copyLst);
		lst.set(0, "encore");
		System.out.println("original : " + lst);
		System.out.println("copy : " + copyLst);
		
		// 자료구조를 배열로 반환해야한다면?
		// Object[] ary = copyLst.toArray();   ->
//		String[] ary = (String[])copyLst.toArray();
//		System.out.println("ary length : " + ary.length);
		
		// 정렬
		List<Integer> sortLst = new ArrayList();
		sortLst.add(3); sortLst.add(2); sortLst.add(1);
		System.out.println(sortLst);
		sortLst.sort(Comparator.naturalOrder());
		System.out.println("오름차순 정렬 : " + sortLst);
		sortLst.sort(Comparator.reverseOrder());
		System.out.println("뒤집기 : " + sortLst);
		
		System.out.println();
		
		// 순회
		List<Person> hmsLst = new ArrayList();
		hmsLst.add(new StudentDTO("여경원", 28, "서울", "2020"));
		hmsLst.add(new TeacherDTO("여경원", 40, "서울", "자바"));
		hmsLst.add(new EmployeeDTO("여경원", 30, "서울", "교육 서비스"));
		
		// -좋지않은 순회방법
		for(int i=0; i<hmsLst.size(); i++) {
			Person obj = hmsLst.get(i);
			System.out.println(obj.personInfo());
		}
		
		System.out.println();
		
		// -Iterator 인터페이스의 메서드를 이용한 순회방법 -> 성능 good
		Iterator<Person> ite = hmsLst.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next().personInfo());
		}
		System.out.println("다시 한번 순회 - ");
		ite = hmsLst.iterator(); // 리소스를 전부 소모했음 -> 다시 동기화 시켜줘야함.
		while(ite.hasNext()) {
			System.out.println(ite.next().personInfo());
		}
		
		System.out.println();
		
		// List에만 있는 listIterator()
		ListIterator<Person> iter = hmsLst.listIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().personInfo());
		}
		while(iter.hasPrevious()) {
			System.out.println(iter.previous().personInfo());
		}
		
		System.out.println();
		
		// 전체데이터를 삭제
		lst.clear();
		System.out.println("전체 데이터 삭제 : " + lst);
		
		// 모든 Collection은 객체(참조타입)를 담는 자료구조(그릇)
		List<Integer> numberLst = new ArrayList();
		// int - Integer, char - Character : Wrapper Class
		// int x =10; Integer xx = new Integer(x); -> Auto Boxing
		// Integer xx = new Integer(10); int z = (int)xx + 10; -> Auto Unboxing
		//numberLst.add('A'); // Auto Boxing
		//numberLst.add(10); // Auto Unboxing
		
		
		
	}

}
