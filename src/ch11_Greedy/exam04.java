package ch11_Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exam04 {
	
	public static int n=0;
	public static int [] realArr = new int[n];
	
	public static int check(int i) {
		
		int sum=0;
		
		for (int j = 0; j < realArr.length; j++) {
			sum+=realArr[j];
			
			if(i == sum) {break;} 
			else if(i<sum) {
				
			} else if(i>sum) {
				
			}
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();

		String[] strArr = new String[n];
		strArr = str.split(" "); //문자열 나누기
		
		Arrays.sort(strArr);
		
		//문자열로 받은 화폐단위들을 계산을 위해 int형 배열로 삽입
		for (int i = 0; i < realArr.length; i++) {
			realArr[i]=Integer.parseInt(strArr[i]);
		}
		

		for (int i = 1; i <=realArr[n-1]; i++) { //1부터 가장큰 화폐단위 까지 순차적으로 비교
			
			for (int j = 0; j < realArr.length; j++) {
				if(i != realArr[j]) {
					check(i);
				}
			}
			
		}
		
		System.out.println();
		
	}
}
