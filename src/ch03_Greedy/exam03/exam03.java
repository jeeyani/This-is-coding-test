package ch03_Greedy.exam03;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[][] card = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				card[i][j] = Integer.parseInt(sc.next());
			}
			sc.nextLine();
		} 
		
		//10000 보다 작은 수를 초기값을 정한다
		int res = 10001;
		int min = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				//10000보다 작은 수를 기억한다
				if(card[i][j]<res) {
					res = card[i][j];
				}
					
			}
			//행마다 제일 작은 수 중에 가장 큰 수를 뽑는다
			if(min<res) {
				min = res;
			}
			res = 10001;
		}
		
		System.out.println(min);

	}

}
