package ch08_DynamicProgramming.exam03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class antWarrior {

	public static int n, k;
	public static int[] dp = new int[101];

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		String[] temp = br.readLine().split(" ");
		int[] ant = new int[n];
		for (int i = 0; i < n; i++) {
			ant[i] = Integer.parseInt(temp[i]);
		}

		// 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
		dp[0] = ant[0]; // d[]에는 계산 결과를 저장하기 위해 창고정보를 가지고 있는 배열로 초기화
		dp[1] = Math.max(ant[0], ant[1]);

		//1. 왼쪽부터 차례대로 값을 비교하는 것이 핵심
		//2-1. 왼쪽부터 창고를 털지 안털지 결정
		//2-2. 특정한 창고i번째 식량창고에 대해 털지 안 털지의 여부를 결정
		for (int i = 2; i < n; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + ant[i]);
		}

		// 계산된 결과 출력
		System.out.println(dp[n - 1]);

	}
}
