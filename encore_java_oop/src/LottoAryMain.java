import com.encore.ary.lotto.ExerciseLotto;

public class LottoAryMain {

	public static void main(String[] args) {
		ExerciseLotto lotto = new ExerciseLotto();
		
		//Mission01.
		int [] ary = lotto.generateLottoNumbers();
//		for(int idx=0; idx<ary.length; idx++) {
//			System.out.print(ary[idx]+" ");
//
//		}
		lotto.displayLotooNumbers(ary);
	}

}
