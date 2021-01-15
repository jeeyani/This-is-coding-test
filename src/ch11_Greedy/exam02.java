package ch11_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//문자열 입력받기
		String str = sc.nextLine();
		
		//문자열 선언
		String[] s = new String[20];
		s = str.split("");
		
		int[] sArr = new int[s.length]; //숫자계산을 위해서 선언한 int배열
		
		for (int i = 0; i < s.length; i++) {
			sArr[i] = Integer.parseInt(s[i]);
		}
		
		Arrays.sort(sArr); //오름차순으로 정리
		int res = 1;
		
		for (int i = 0; i < sArr.length; i++) {
			
			if(sArr[i]!=0) {
				res *=sArr[i];
			} else { continue;
			}
		}
		
		System.out.println(res);
		
	}
}
