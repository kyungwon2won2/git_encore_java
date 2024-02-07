import com.encore.primenumber.ExercisePrimeNumber;

public class PrimeNumberMain {

	public static void main(String[] args) {
		int inputNumber = ExercisePrimeNumber.getUserInput();
		
		//소수 판단하는 로직(for, if)
		//0과 1은 소수가 아니다.
		//어떤 숫자가 소수가 될려면 11을 2부터 10(11보다 1작은 숫자)까지 차례대로 나누어보고
		//나머지가 0인 경우가 한번도 없으면 그 수는 소수이다
		if(inputNumber<2) {
			System.out.printf("%d은(는) 소수가 아닙니다.",inputNumber);
		}else if(inputNumber==2) {
			System.out.printf("%d은(는) 소수입니다.",inputNumber);
		}
		
		for(int idx=2; idx<inputNumber; idx++) {
			if(inputNumber%idx==0) {
				System.out.printf("%d은(는) 소수가 아닙니다.",inputNumber);
				break;
			}else {
				System.out.printf("%d은(는) 소수입니다.",inputNumber);
				break;
			}
		}
	}

}
