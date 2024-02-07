package com.encore.loop;

import java.util.Scanner;

public class LoopDemo02 {
	
	// default constructor
	public LoopDemo02() {
		
	}
	
	// 1 ~ 난수(100)까지의 합을 구해보고 싶다.
	public void sumRandom() {
		int nan = (int)(Math.random() * 100) + 1; 
		System.out.println("nan = "+nan);
		
		int sum = 0;
		for(int idx=1; idx<=nan; idx++) {
			sum+=idx;
		}
		System.out.println("sum = "+sum);
	}
	
	// 난수 두개를 발생시켜서 최소값부터 최대값까지의 합을 구하고 싶다면?
	public void sumRandomTwo() {
		int nan01 = (int)(Math.random() * 100) + 1;
		int nan02 = (int)(Math.random() * 100) + 1;
		
		System.out.println("난수 = "+nan01+" "+nan02);
		
		int sum = 0;
		if(nan01>nan02) {
			for(int idx=nan02; idx<=nan01; idx++) {
				sum+=idx;
			}
		}else if(nan01<nan02) {
			for(int idx=nan01; idx<=nan02; idx++) {
				sum+=idx;
			}
		}else {
			sum=nan01;
		}
		System.out.println("sum = "+sum);
	}
	
	// A ~ Z 출력하는 구문을 작성한다면
	public void charPrint(char start, char end) {
		for(char idx=start; idx<=end; idx++) {
			System.out.printf("%c \t",idx);
		}
	}
	
	// 1 ~ 100 사이의 홀수의 합을 출력한다면?
	public void sumOdd() {
		int sum=0;
		for(int idx=1; idx<=100; idx++) {
			if(idx%2 != 0) {
				sum+=idx;
			}
		}
		System.out.println("sum = "+sum);
	}
	
	// 1 ~ 난수(100)을 발생시켜서 짝수의 개수가 몇개인지 출력한다면?
	public void countEven() {
		int nan = (int)(Math.random() * 100) + 1; 
		System.out.println("난수 = "+nan);
		
		int cnt=0;
		for(int idx=1; idx<=nan; idx++) {
			if(idx%2==0) {
				cnt++;
			}
		}
		
		System.out.printf("짝수의 개수는 %d개 입니다.", cnt);
	}
	
	// 매개변수로 문자열을 입력받아서 문자 하나씩을 추출하여 출력하고 싶다면?
	public void splitString(String str) {
		System.out.println("args -> "+str);
		
		for(int idx=0; idx<= str.length()-1; idx++) {
			System.out.print(str.charAt(idx)+"\t");
		}
	}
	
	// 스캐너를 이용해서 값을 입력받고 1부터 차례로 누적해서 합을 구하다가 입력한 값을 넘으면 중단하고
	// 마지막으로 더해진 결과 그 때까지의 합을 출력하고 싶다면?
	// 입력 예) 100
	// 출력 예) 20 104
	public void sumBreak() {
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터를 입력하세요 : ");
		int num = scan.nextInt();
		
		int idx=0;
		int sum=0;
		
		// for문에 모든 조건을 쓰지 않아도 사용가능
		for(idx=1; ;idx++) {
			if(sum>num) {
				break;
			}
			sum += idx;
		}
		System.out.println((idx-1)+" sum = "+sum);
	}
	
	public void nestedFor() {
		for(int row=1; row<=10; row++) {
			//System.out.println("row idx = "+row);
			
			for(int col=1; col<=10; col++) {
				//System.out.print(col+"\t");
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 일반 이중 for문을 사용한 구구단 방법
	public void gugudan() {
		for(int dan=2; dan<=9; dan++)
		{
			System.out.printf(">>>%d단<<<",dan);
			System.out.println();
			for(int num=1; num<=9; num++) {
				System.out.printf("%d X %d = %d",dan, num, dan*num);
				System.out.println();
			}
		}
	}
	
	// 메서드가 메서드를 호출하는 구구단 방법
	public void gugudanTable() {
		for(int dan=2; dan<=9; dan++)
		{
			System.out.printf(">>>%d단<<<",dan);
			System.out.println();
			gugudanTimes(dan);
		}
	}
	
	private void gugudanTimes(int dan) {
		for(int num=1; num<=9; num++) {
			System.out.printf("%d X %d = %d",dan, num, dan*num);
			System.out.println();
		}
	}
	
	// i, j 변수만 출력 (5 * 5)
	public void printIJ() {
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=5; j++) {
				//System.out.println("row = "+i+" ,col = "+j);
				System.out.println(j);
			}
			System.out.println();
		}
	}
	
	/*
	 출력예시)
	 23456
	 34567
	 45678
	 56789
	 678910
	 */
	public void printPlus() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
	
	// break, continue
	// break : 가장 가까운 루프구문을 빠져나가는 것
	// continue : 조건에 만족할 경우 실행을 하지않고 다음 차례로 이동
	public void gugudan02() {
		for(int dan=1; dan<=9; dan++)
		{
			System.out.println();
			for(int num=2; num<=9; num++) {
				if(num==5) continue;
				System.out.printf("%d X %d = %d \t",num, dan, dan*num);
				//if(num==5) break;
			}
			
			System.out.println();
		}
	}
	
	// outer(label)를 사용하면 완전히 빠져나간다.
	public void forLabel() {
		outer : 
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==3) break outer;
				System.out.println("i, j = "+i+"\t"+j);
			}	
		}
	}
	
/*
<while문>
	
초기값 ;
	while(조건식){
	 
	 statement;
	 [증감식 or 분기문];
	 
	}
	 
증감식이 없으면 무한루프
필요에 따라서 while(true)로 무한반복을 유도
	 
*/
	
	//while
	public void whileOneToTen() {
		int idx = 1;
		while(idx<=10) {
			System.out.print(idx+"\t");
			idx++;
		}
	}
	
	// Scanner로 부터 문자열을 입력받아서 for, while 구문으로 입력된 문자열의 각 문자의 인덱스와 문자를 쌍으로 출력
	// 입력예시) java
	// 출력예시) 0:j  1: a ....
	public void printStrIdx(){
		Scanner scan = new Scanner(System.in);
		System.out.println("데이터를 입력하세요 : ");
		String str = scan.nextLine();
		
		System.out.println(">>> for문 <<<");
		for(int idx=0; idx<str.length();idx++) {
			System.out.println(idx+" : "+str.charAt(idx));
		}
		
		System.out.println();
		
		System.out.println(">>> while문 <<<");
		int i=0;
		while(i<str.length()) {
			System.out.println(i+" : "+str.charAt(i));
			i++;
		}
	}
	
/*
<do ~ while 구문>
	
초기값 ;
do{
	
	statement;
	[증감식 or 분기문];
	
}while(조건식)

while(true) - 무한루프
do ~ while(false) - 한번 수행하고 끝
	 
*/
	
	// do while
	public void dowhileTest() {
		System.out.println("do ~ while");
		do {
			
			System.out.println("false 이지만 한번은 무조건 수행!!");
			
		}while(false);
		
	}
	
}















