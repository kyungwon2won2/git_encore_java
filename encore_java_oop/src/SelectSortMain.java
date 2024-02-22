
public class SelectSortMain {

	public static void main(String[] args) {
		
		// step01. 10개의 방을 가지는 배열을 만들고 랜덤하게(1~100) 값으로 초기화후 정렬 전 출력
		int[] ary = new int[10];
		
		for(int i=0; i<ary.length; i++) {
			ary[i] = (int)(Math.random()*100+1);
		}
		aryPrt(ary);
		System.out.println();
		System.out.println();
		
		// step02. 초기화된 배열로부터 최소값이 들어있는 인덱스를 리턴받아 출력
		int minIdx = findMinIdx(ary);
		System.out.println("최소값을 가지는 배열의 인덱스 : " + minIdx);
		System.out.println("최소값	: " + ary[minIdx]);
	}
	
	public static void aryPrt(int[] ary) {
		System.out.println("정렬 전 출력");
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
	}
	
	public static int findMinIdx(int[] ary) {
		int idx = 0;
		int min = ary[0];
		for(int i=0; i<ary.length; i++) {
			if(min>ary[i]) {
				idx = i;
			}
		}
		return idx;
	}
	
	public static int findInsertIdx(int[] ary, int data) {
		
		
		return 0;
	}

}
