package ch03_Greedy.exam03;

import java.util.Scanner;

public class exam03_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//행과 열 입력
		int n = sc.nextInt();
		int m = sc.nextInt();

		//열의 갯수 만큼 카드의 숫자를 입력받을 배열을 선언
		int[] arr = new int[m];
		
		//최종적으로 그 중 가장 큰 수를 저장할 변수를 초기화
		int max = 0;
		
		//이중 for문
		//전체적으로 N번 만큼 for문을 돌려준다.
		for (int i = 0; i < n; i++) {
			int minV = 10001; //카드의 숫자는 최대 10000임으로 설정
			
			//각 행마다 입력을 받고 그 중  가장 작은 수를 구한다.
			for (int j = 0; j < m; j++) {
				arr[j] = sc.nextInt();
				
				if (minV  > arr[j]) {
					minV  = arr[j];
				}
			}

			//그 다음 선택된 행과의 숫자비교를 통해 그 중 가장 큰 수를 뽑는다.
			if(max < minV) {
				max = minV;
			}
			
			
		}
		
		//최종적인 카드 수 출력
		System.out.println(max);

	}

}
