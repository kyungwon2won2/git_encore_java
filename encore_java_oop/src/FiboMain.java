import java.util.Scanner;

public class FiboMain {

	// DP topDwon - bottomUp
	public static long[] topDownAry;    // 메모이제이션
	public static long[] bottomUpAry;   // 메모이제이션
	
	// 피보나치 수열에도 메모이제이션 적용
	public static void main(String[] args) {
		System.out.print("데이터 입력 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//cacheFibo = new long[num+1];
		
		topDownAry = new long[num+1];
		bottomUpAry = new long [num+1];
		
		long startTime = System.currentTimeMillis();
		System.out.println("result = " + fibonacci(num));
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		System.out.println("result = " + topDown(num));
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		System.out.println("result = " + bottomUp(num));
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime));
	}
	
	public static long fibonacci(int num) {
		if(num <= 2) {
			return 1;
		} else {
			return fibonacci(num-2) + fibonacci(num-1);
		}
	}
	
	// DP - topDown
	public static long topDown(int num) {
		if(num <= 2) {
			return topDownAry[num] = num;
		}
		
		// 메모이제이션에 계산된 결과가 있으면 바로 리턴
		if(topDownAry[num] > 0) {
			return topDownAry[num];
		}
		
		topDownAry[num] = fibonacci(num-2) + fibonacci(num-1);
		
		return topDownAry[num];
	}
	
	// DP - bottomUp
	public static long bottomUp(int num) {
		bottomUpAry[1] = bottomUpAry[2] = 1;
		for(int i=3; i<=num; i++) {
			bottomUpAry[i] = bottomUpAry[i-1] + bottomUpAry[i-2];
		}
			
		return bottomUpAry[num];
	}

}
