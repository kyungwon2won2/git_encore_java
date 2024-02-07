package com.encore.ary;

import java.util.Scanner;

public class AryDemo {

	public AryDemo() {
		
	}
	
	// Scanner를 이용해서 5명의 학생들의 국어점수만 입력받아 입력받은 점수를 배열에 담아서 반환한다면?
	
	
	public int[] makeScores() {
		int[] scoreAry = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int idx=0; idx<scoreAry.length; idx++) {
			System.out.println((idx+1)+"번째 학생의 점수를 입력하세요 : ");
			scoreAry[idx]=scan.nextInt();
		}
		return scoreAry;
	}
	
}
