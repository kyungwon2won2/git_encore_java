//알고리즘 p.36 문제

/*
 * 입력예시 : 배열의 길이, 부품번호
 	N=5
 	8 3 7 9 2
 * 출력예시 :
    부품이 존재하면 yes, 존재하지 않으면 no
 */
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch01Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] ary1 = new int[N];
		for(int i=0; i<N; i++) {
			ary1[i] = scan.nextInt();
		}
		Arrays.sort(ary1);
		int M = scan.nextInt();
		int[] ary2 = new int[M];
		for(int i=0; i<M; i++) {
			ary2[i] = scan.nextInt();
		}
		
		int[] arrR = search(ary1, ary2);
		
		for(int i=0; i<arrR.length; i++) {
			if(arrR[i]==1) {
				System.out.print("yes ");
			} else {
				System.out.print("no ");
			}
		}

	}

	
    public static int[] search(int[] ary1, int[] ary2) {
        int[] arrR = new int[ary2.length];

        for (int i = 0; i < ary2.length; i++) {
            arrR[i] = binarySearch(ary1, ary2[i]);
        }

        return arrR;
    }

    public static int binarySearch(int[] ary1, int target) {
        int low = 0;
        int high = ary1.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (ary1[mid] == target) {
                return 1; 
            } else if (ary1[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; 
    }
}




