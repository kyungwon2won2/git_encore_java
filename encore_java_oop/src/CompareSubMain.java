
/*
 
 정렬 : 모든 프로그램은 오름차순을 기본으로 정렬한다.
 JAVA에서 기준을 정의하지 않으면 오름차순.
 기본타입과 배열이 기본타입을 요소로 가지고 있다면
  -> Arrays.sort(); , Collections.sort();
  
 [정렬의 일반화된 규칙]
 - 비교 결과 리턴될 때
 - 음수 : 두 원소의 위치를 교환 X. {1, 3} , {3, 1}
 - 양수 : 두 원소의 위치를 교환 O.
 
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import com.encore.compare.EncoreInteger;

public class CompareSubMain {

	public static void main(String[] args) {
		EncoreInteger[] ary = new EncoreInteger[10];
		
		// 랜덤하게 배열 초기화(1~100) : Random - nextInt() , Math - random()

		for(int i=0; i<ary.length; i++) {
			ary[i] = new EncoreInteger((int)(Math.random()*100+1));
		}
		
		System.out.println("정렬 전 >>>> ");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i].getData()+" ");
		}
		System.out.println();
		
		System.out.println("기본 오름차순 정렬 >>>>");
		Arrays.sort(ary);
		//Arrays.sort(ary, Collections.reverseOrder());
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i].getData()+" ");
		}
	}

}
