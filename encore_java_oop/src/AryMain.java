import java.util.Random;

public class AryMain {

	public static void main(String[] args) {
		
		// 참조타입의 배열 선언으로 사용하기 위해서는 객체 생성이 필요하다.
		// 선언과 동시에 객체 생성 완료!!
		int[] ary = new int[10];
		System.out.println("배열의 길이 - "+ary.length);
		
		Random random = new Random();
		
		for(int idx=0; idx<ary.length; idx++) {
			ary[idx] = random.nextInt(100)+1;
		}
	}

}
