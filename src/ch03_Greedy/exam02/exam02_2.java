package ch03_Greedy.exam02;

import java.util.Arrays;
import java.util.Scanner;

public class exam02_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배열의 수
		int n = sc.nextInt();
		int[] arr = new int[n];

		int m = sc.nextInt();// 더하는 수
		int k = sc.nextInt(); // 연속으로 더할 수 있는 최대 수

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr); // 배열을 오름차순으로 정렬

		int res = 0;

		for (int i = 0; i < (m / (k + 1)); i++) {
			for (int j = 0; j < k; j++) {
				res += arr[n-1];
			}
			res += arr[n-2];
		}

		
		if (m%(k + 1) != 0) {
			for (int i = 0; i < m%(k + 1); i++) {
				res += arr[n-1];
			}
		}

		System.out.println(res);

	}

}
