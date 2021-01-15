package ch08_DynamicProgramming.exam03;

import java.util.Scanner;

public class exam03_solution {
	
	
	// 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
	public static int[] d = new int[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 N을 입력받기
		int n = sc.nextInt();

		// 모든 창고에 대한 식량 정보 입력받기
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
		d[0] = arr[0]; // d[]에는 계산 결과를 저장하기 위해 창고정보를 가지고 있는 배열로 초기화
		d[1] = Math.max(arr[0], arr[1]); 
		
		//1. 왼쪽부터 차례대로 값을 비교하는 것이 핵심
		//2-1. 왼쪽부터 창고를 털지 안털지 결정
		//2-2. 특정한 창고i번째 식량창고에 대해 털지 안 털지의 여부를 결정
		for (int i = 2; i < n; i++) {
			d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
		}

		// 계산된 결과 출력
		System.out.println(d[n - 1]);
	}
}
