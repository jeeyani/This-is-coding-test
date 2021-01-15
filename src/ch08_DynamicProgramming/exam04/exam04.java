package ch08_DynamicProgramming.exam04;

import java.util.Scanner;

public class exam04 {

	//타일의 길이를 저장하기 위한 배열
	public static int[] d = new int[1001];
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//타일의 가로길이를 입력
		int n = sc.nextInt();
		
		d[0] = 1;
		d[1]=3; //타일이 2*2일때의 경우의 수는 3가지
		
		for (int i = 2; i < n; i++) {
			d[i] = (d[i-1]+ 2*d[i-2])%796796 ;
		}
		System.out.println(d[n-1]);

	}

}
