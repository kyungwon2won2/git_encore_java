package com.encore.myungham.view;

import java.util.Scanner;

public class MyunghamView {
	
	public static Scanner scan = new Scanner(System.in) ; 
	
	public void mainmenu() {
		while(true) {
			System.out.println("_______________________________________________________");
			
			
			System.out.println("_______________________________________________________");
			System.out.println();
			System.out.println("명함관리 [P(revious), N(ext), I(nsert), U(pdate), D(elete)] ?");
			String choice = scan.next() ; 
			switch(choice) {
				case "p" : 
						previous();
					break;
				case "n" : 
						next();
					break;
				case "i" : 
						insert();
					break;
				case "u" : 
						update();
					break;
				case "d" : 
						delete();
					break;
				case "e" : 
						System.out.println("프로그램을 종료합니다....");
						System.exit(0) ;
				default : 
						System.out.println("?? 없는 명령어 입니다!");
						
			} // switch end block

		}
	}
	
	public void previous() {
		
	}
	
	public void next() {
		
	}
	
	public void insert() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}
