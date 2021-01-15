package ch11_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] strArr = new String[10000];
		strArr = str.split(""); //문자열 나누기
		
		//int배열을 선언하여 변환하여 넣어주기
		int[] realArr = new int[strArr.length];
		for (int i = 0; i < realArr.length; i++) {
			realArr[i]=Integer.parseInt(strArr[i]);
		}

		int count =0; //배열의 수가 바뀌는 것을 세는 카운트
				
		for (int i = 1; i < realArr.length; i++) {		
			//현재 배열과 다음배열과의 수 비교를 통해 카운터를 셈
			if(realArr[i-1] != realArr[i]) {	
				count ++;
			}
		}
		
		//바뀌는 순간에 카운터를 센 결국 짝을 이루거나 짝을 못이루는 상태로 하나의 그룹을 구별할 수 있도록 한다.
		//따라서 하나의 짝이 이뤄지면 그룹을 이룸으로 2로 나눠준다
		//2로 나눠떨어지지 않으면 카운터 수를 더해준 뒤 2로 나눠준다
		if(count%2 ==0) {
			System.out.println(count/2);
		} else {
			count +=1;
			System.out.println(count/2);
		}
	}
}
