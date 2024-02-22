

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.encore.generics.ClassName;
import com.encore.generics.Golf;
import com.encore.generics.ShortTrackSkating;
import com.encore.generics.Skating;
import com.encore.generics.SpeedSkating;
import com.encore.generics.Sports;
import com.encore.generics.Student;

public class GenericsMain {

	public static void main(String[] args) {
		
		/*
		 <? extends XXXX>, <? super XXXX>
		 제너릭스 사용시 코드상의 이점?
		 - 컴파일 타입시 타입의 안정성 유지.
		 - 불필요한 다운캐스팅 지양할 수 있다.
		 */
//		List<String> lst = new ArrayList<String>();
		

//1.		
//		ClassName<String, Integer> obj = new ClassName<String, Integer>();
	
		
//2.		
//		ClassName<Integer> obj = new ClassName<Integer>();
//		ClassName<Student> obj = new ClassName<Student>();

//3.
//		ClassName<String> obj01 = new ClassName<String>();
//		ClassName<Integer> obj02 = new ClassName<Integer>();
//		
//		obj01.setX("10");
//		System.out.println("value : " + obj01.getX());
//		System.out.println("변수의 타입 출력 : " + obj01.getX().getClass().getName());
//		
//		obj02.setX(10);
//		System.out.println("value : " + obj02.getX());
//		System.out.println("변수의 타입 출력 : " + obj02.getX().getClass().getName());
		
//4.		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		ClassName<String, Integer> obj = new ClassName<String, Integer>();
//		obj.setX("10", 10);
//		System.out.println("key value : " + obj.getKey());
//		System.out.println("변수의 타입 출력 : " + obj.getKey().getClass().getName());

		
		
		// 제너릭스의 다형성
		// 와일드카드(?)를 사용할 수 있다.
		// xxxx.do , xxxx.encore
		// http://serverIP:prot/a/b/xxxx.do
		// -> http://serverIP:prot/a/b/insert.do
		// -> http://serverIP:prot/a/b/select.do
		// <? extends Skating> : Skating을 상속받고있는 하위 객체를 포함하겠다.
		// <? super Golf>
//		List<? extends Skating> lst = new ArrayList();
//		List<? super Golf> lst = new ArrayList();
//		lst.add(new Golf());
//		lst.add(new Skating());
//		lst.add(new SpeedSkating());
//		lst.add(new ShortTrackSkating());
		
//		List<Sports> lst = new ArrayList();
//		lst.add(new Golf()); lst.add(new SpeedSkating());
		
		// ? 저장은 X, 꺼낼 수는 있는데 반환 타입은 Object
		// 메서드의 리턴타입, 매개변수 지정
//		List<?> lst = new ArrayList();
//		lst.add(null); // null값은 허용
//		lst.add(new Golf()); // 객체를 담을수 없기때문에 error
		
		// <? extends Skating>  ==  <Skating>
		// ? 저장은 X, 꺼낼 수는 있는데 반환 타입은 Object
		// 메서드의 리턴타입, 매개변수 지정
//		List<? extends Skating> lst = new ArrayList();
//		lst.add(new SpeedSkating()); // 객체를 담을수 없기때문에 error
//		lst.add(null); // null값은 허용
		
		// super 쓸 경우 : 저장은 가능(타입 : Golf, 상위타입)
		// 반환타입은 Object
//		List<? super Golf> lst = new ArrayList();
		
		// 상황에 대한 이해..
		//List<Sports> lst = new ArrayList();
		//lst.add(new Golf()); lst.add(new SpeedSkating());
		
		List<Skating> lst = new ArrayList();
		lst.add(new ShortTrackSkating()); lst.add(new SpeedSkating());
		getExtendsMethod(lst);
	}	
	
	public static void getExtendsMethod(List<? extends Skating> lst) {
		
	}

}
