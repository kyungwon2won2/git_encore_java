
public class RecurMain {

	public static int n = 3;
	
	public static void main(String[] args) {
		//**case 01.
		//openBox();
		
		//**case 02.
//		int sum = 0;
//		System.out.println("1~10의 합을 구한다면?");

//		for(int i=10; i>0; i--) {
//			sum += i;
//		}
//		System.out.println("sum = " + sum);
		
		//**case 03.
//		System.out.println(addNumber(10));
		
		//**case 04.
		//만약 특정 문자열이 있고 문자열에 있는 모든 'a'라는 문자를 'b'라는 문자로 변경하고싶다면?
		String str = "apple";
		StringBuffer sb = new StringBuffer();
		
//		for(int i=0; i<str.length(); i++) {
//			//System.out.print(str.charAt(i)+" ");
//			if(str.charAt(i) == 'a') {
//				sb.append('b');
//			}else {
//				sb.append(str.charAt(i));
//			}
//		}
//		System.out.println(sb.toString());
		
//		System.out.println(replaceChar("apple", 'a', 'b'));
		
		/*
		 재귀함수는 메서드 내에서 스스로를 반복적으로 호출
		 단, 무한으로 반복되는 형태가 아닌 반복의 끝이 반드시 존재하는 조건이 필요!!
		 stack의 형태를 취함
		 메서드가 폴되면서 최근에 자신을 호출한 원래 함수가 스택에 쌓이는 형식.
		 
		 팩토리얼?
		 3! = 3x2x1
		 */
		int inputData = 4;
		System.out.println(fact(inputData));
	}
	
	
	
	public static void openBox() {
		System.out.println("종이 상자를 엽니다.");
		n -= 1;
		if(n == 0) {
			System.out.println("반지를 넣고 반환합니다.");
			return;
		}
		openBox();
		System.out.println("종이 상자를 닫습니다.");
	}
	
	public static int addNumber(int num) {
		if(num <= 1) {
			return 1;
		}
		return num + addNumber(num-1); //숫자가 줄어드는 조건
	}
	
	// 재귀호출을 이용한 문자변경을 한다면?
	public static String replaceChar(String str, char from, char to) {
	
		if(str.length() < 1) {
			return str;
		} else {
			char first = (from == str.charAt(0)) ? to : str.charAt(0);
			System.out.println(first);
			System.out.println(str);
			return first + replaceChar(str.substring(1), from, to);
		}
	}
	
	public static int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}

}
