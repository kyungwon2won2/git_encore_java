package com.encore.ary.lotto;

import java.util.Random;

//로또번호를 생성하고 생성한 번호를 배열에 담아서 관리하고 출력하는 역할
public class ExerciseLotto {
	
	private Random random;
	
	public ExerciseLotto() {
		
	}
	
	// 로또번호 생성후 반환
	// 중복 X
	public int[] generateLottoNumbers() {
		Random random = new Random();
		int[] lottoAry = new int[6];
		
		for(int idx=0; idx<lottoAry.length; idx++) {
			//lottoAry[idx]= random.nextInt(45)+1;
			for(int i=0; i<lottoAry.length; i++) {
				for(int j=0; j<i; j++) {
					if(lottoAry[j]==lottoAry[i]) {
						i--;
						break;
					}
				}
			}
		}
		
		return lottoAry;

	}
	
	// 매개변수로 배열을 입력받아서 출력
	public void displayLotooNumbers(int[] lottoNumbers) {

		for(int idx=0; idx<lottoNumbers.length; idx++) {
			System.out.println(lottoNumbers[idx]+" ");
		}
	}
	
	// 로또 번호를 오름차순으로 정렬하는 역할
	public void sortLottoNumbers(int[] lottoNumbers) {
		
	}
}
