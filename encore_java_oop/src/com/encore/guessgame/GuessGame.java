package com.encore.guessgame;

import java.util.Scanner;

public class GuessGame {
	public static int getUserInput() {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		return input;
	}
}
