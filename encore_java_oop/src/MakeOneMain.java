import java.util.Scanner;

// bottomUp & Math.min() 사용
public class MakeOneMain {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		
		int[] bottomUpAry = new int[X+1];
		
		// bottomUp : 배열의 인덱스를 값을 생각하고 해당 인덱스 번지에 연산횟수를 넣는 과정을 구현
		bottomUpAry[1] = 0;
		bottomUpAry[2] = 1;
		int[] divisorAry = {2, 3, 5};
		for(int i=3; i<=X; i++) {
			bottomUpAry[i] = bottomUpAry[i-1]+1;
			for(int divisor : divisorAry) {
				if(i%divisor == 0) {
					bottomUpAry[i] = Math.min(bottomUpAry[i/divisor]+1, bottomUpAry[i]);
				}
			}
		}
			
		System.out.println("연산 횟수 : " + bottomUpAry[X]);
	}

}