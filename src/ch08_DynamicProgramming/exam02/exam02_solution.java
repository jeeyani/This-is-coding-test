package ch08_DynamicProgramming.exam02;

import java.util.Scanner;

public class exam02_solution {
	
	  // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화 
    public static int[] d = new int[30001];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 int x = sc.nextInt();

		 // 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
		 // 아래에서부터 횟수를 비교하여 올라간다.
		 //총 비교는 네 가지, -1, 2로 나누기, 3으로 나누기, 5로 나누기
		 //for문의 +1은 d[i] 즉, 윗값이 되기 위한 횟수라고 생각하자
		 //i는 연산의 결과값이고 d[i]의 값은 i가 되었을 때의 계산 횟수이다. 
		 //따라서 계산 횟수가 가장 작은 횟수를 뽑아가는 것이 핵심

			for (int i = 2; i <= x; i++) {
				// 현재의 수에서 1을 빼는 경우
				d[i] = d[i - 1] + 1;
				// 현재의 수가 2로 나누어 떨어지는 경우
				if (i % 2 == 0)
					d[i] = Math.min(d[i], d[i / 2] + 1);
				// 현재의 수가 3으로 나누어 떨어지는 경우
				if (i % 3 == 0)
					d[i] = Math.min(d[i], d[i / 3] + 1);
				// 현재의 수가 5로 나누어 떨어지는 경우
				if (i % 5 == 0)
					d[i] = Math.min(d[i], d[i / 5] + 1);
			}

			System.out.println(d[x]);
		}
}
