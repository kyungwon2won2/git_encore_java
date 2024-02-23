//알고리즘 p.37 문제

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch02Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt(); // 요청길이
		Integer[] arr = new Integer[N];
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		int result = search(arr, M);
		if(result == -1) {
			System.out.println("절단 실패");
		} else {
			System.out.println("절단기 설정 최대값 : " + result);
		}

	}
	
	public static int search(Integer[] arr, int target) {
		int result = -1;
		Arrays.sort(arr, Collections.reverseOrder());
		int low = 0;
		int high = arr[0];
		while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println(">>>mid : " + mid);

            int cnt = 0;
            for(int cake : arr) {
            	if(cake > mid) {
            		cnt += (cake-mid);
            		System.out.println("cake : " + cake + "\t mid : " + mid);
            		System.out.println("cnt : " + cnt);
            	}
            }
            // target = M
            if(target == cnt) {
            	result = mid;
            	break;
            } else if(target < cnt) {
            	low = mid + 1;
            } else {
            	high = mid - 1;
            }
        }
        return result; 
	}
	
}
