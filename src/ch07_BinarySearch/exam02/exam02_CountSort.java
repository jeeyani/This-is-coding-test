package ch07_BinarySearch.exam02;

import java.util.Scanner;

public class exam02_CountSort {

	//계수 정렬 방법
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// N(가게의 부품 개수)
		int n = sc.nextInt();
		int[] arr = new int[1000001];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[x] = 1; //데이터가 들어가 수 들은 카운터를 1로 올려줌
		}

		// M(손님이 확인 요청한 부품 개수)
		int m = sc.nextInt();
		int[] targets = new int[n];
		for (int i = 0; i < m; i++) {
			targets[i] = sc.nextInt();
		}

		// 손님이 확인 요청한 부품 번호를 하나씩 확인
		for (int i = 0; i < m; i++) {
			// 해당 부품이 존재하는지 확인
			if (arr[targets[i]] == 1) {
				System.out.print("yes ");
			} else {
				System.out.print("no ");
			}
		}

	}

}
