import java.util.Random;

import com.encore.guessgame.GuessGame;

public class GuessGameMain {

	public static void main(String[] args) {
		Random rand = new Random();
		int hiddenNumber = rand.nextInt(100)+1;
		System.out.println("answer : "+hiddenNumber);

		System.out.println("**********************************");
		System.out.println("1에서 100사이의 숫자를 맞춰보세요.");
		System.out.println("10번의 기회가 있습니다.");
		System.out.println("**********************************");
		
		int cnt = 1;
		while(cnt<=10) {
			System.out.print(cnt+"번째 기회입니다. 숫자를 입력하세요 : ");
			int inputNumber = GuessGame.getUserInput();
			if(inputNumber<1) {
				System.out.println("1~100사이의 값을 입력하세요.");
			}else if(inputNumber>100) {
				System.out.println("1~100사이의 값을 입력하세요.");
			}
			
			if(inputNumber<hiddenNumber) {
				System.out.println(inputNumber+" 보다 큽니다.");
			}else if(inputNumber>hiddenNumber){
				System.out.println(inputNumber+" 보다 작습니다.");
			}else if(inputNumber==hiddenNumber){
				System.out.printf("축하합니다. %d번 만에 맞추셨네요.",cnt);
				break;
			}
			
			cnt++;
			if(cnt>10) {
				System.out.println("10번의 기회가 끝났습니다. 다시 한 번 시도해보세요.");
			}
		}
		
	}

}
