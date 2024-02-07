package com.encore.primenumber;

import java.util.Scanner;

public class ExercisePrimeNumber {

	// Scanner 이요해서 사용자 값을 입력받아서 전달
	public static int getUserInput() {
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		return input;
	}
}
