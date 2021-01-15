package ch08_DynamicProgramming.exam03;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		
		int max =0; //식량의 양 기억
		int num=0; //창고자리 기억
		
		//가장 식량의 양이 많은 것부터 찾기
		for (int i = 0; i < n; i++) {
			if(max<d[i]) {
				max = d[i];
				num = i;
			}
		}
		
		int res = ant(n,d,num); //창고의 수, 창고내용, 창고의 위치 보내주기

		System.out.println(res);
	}
	
	public static int n,k;
	public static int d[] = new int[101];
	
	public static int ant(int n, int[] d,int index) {
		int res=0;
		res+=d[index];
		
		//첫번째 창고일떄
		if (index == 0) {
			res +=d[index+2];
		} else if (index == n) { //마지막 창고일때
			res +=d[n-2];
		}
		
		res += d[n + 2];
		res += d[n - 2];
		
		
		
		return ant(n,d,index);
	}

}
