
public class TwoAryMain {
	
	// 2차원 배열은 배열의 배열
	// 선언방법 : int [][] numAry, int numAry [][]
	public static void main(String[] args) {
		
//		int [][] numAry = {{1,2,3}, {4,5,6}, {7,8}};
//		System.out.println("length : " + numAry.length);
//		System.out.println("numAry[0] : " + numAry[0].length);
//		System.out.println("numAry[1] : " + numAry[1].length);
//		System.out.println("numAry[2] : " + numAry[2].length);
//		
//		//row
//		for(int i=0; i<numAry.length; i++) {
//			for(int j=0; j<numAry[i].length; j++) {
//				System.out.print(numAry[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		//구구단의 결과를 2차원에 담는다면?
		// 출력예시) 
		// 2단 2 4 .... 18
		// 3단 3 6 .... 27
		
		int [][] gugudan = new int[8][9];
		
		for(int i=2; i<=9; i++) {
			System.out.printf("%d단 : ",i);
			for(int j=1; j<=9; j++) {
				gugudan[i-2][j-1]=i*j;
				System.out.print(gugudan[i-2][j-1]+" ");
			}
			System.out.println();
		}
	}

}
