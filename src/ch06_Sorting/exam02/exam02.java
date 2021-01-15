package ch06_Sorting.exam02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Integer[] arr = new Integer[N]; //정수형 리스트 선언
		
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
	
		//기본 라이브러리를 이용하여 쉽게 구현할 수 있었음
		 Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}

		
		
	}

}
