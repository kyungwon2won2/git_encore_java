/*
 5 : 공간의 크기
R R R U D L U R
출력 예시)
좌표값
 */

import java.util.Scanner;

public class UpDownLeftRightMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("공간을 입력하세요 : ");
		int n = scan.nextInt();
		scan.nextLine();
		System.out.print("경로를 입력하세요 : ");
		String str = scan.nextLine().replaceAll(" ", ""); //공백제거
		
		int x = 1;
		int y = 1;
		
		/*
		 for(char route : path.toCharArray()){
		             .
		             .
		             .
		 }
		 */
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'R') {
				x += 1;
			} else if(str.charAt(i) == 'L') {
				x -= 1;
			} else if(str.charAt(i) == 'U') {
				y += 1;
			} else {
				y -= 1;
			}
		}
		
		if(x>n || y>n || x<1 || y<1) {
			System.out.println("범위를 넘었습니다.");
			return;
		}
		
		System.out.println("좌표값 : (" + x + ", " + y + ")");
		
	}

}
