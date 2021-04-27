package ch08_DynamicProgramming.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class makeOne {

	public static int n;
	public static int[] dp = new int[30001];

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		for (int i = 2; i <= n; i++) {
			// 현재의 수에서 1을 빼는 경우
			dp[i] = dp[i - 1] + 1;
			// 현재의 수가 2로 나누어 떨어지는 경우
			if (i % 2 == 0)
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			// 현재의 수가 3으로 나누어 떨어지는 경우
			if (i % 3 == 0)
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			// 현재의 수가 5로 나누어 떨어지는 경우
			if (i % 5 == 0)
				dp[i] = Math.min(dp[i], dp[i / 5] + 1);
		}

		System.out.println(dp[n]);
	}
}
