package ch11_Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//모험가 수 N명 입력받기
		int n = sc.nextInt();
		Integer[] user = new Integer[n];
		
		//모험가의 공포도를 배열로 입력받기
		for (int i = 0; i < n; i++) {
			user[i] = sc.nextInt();
		}

		//모험가의 공포도를 오름차순으로 정렬
		Arrays.sort(user); 
		
		
		int userNum=0; //그룹안에 있는 모험가의 수
		int group=0; //만들어진 그룹 수
		
		for (int i = 0; i < n; i++) {
			userNum++;
			//만약 그룹안에 있는 모험가의 수가 해당 모험가의 공포도와 동일하다면
			//그룹수를 체크, 새로운 그룹의 모험가 수를 계산해야함으로 0으로 초기화
			if(userNum >=user[i]) {
				group ++;
				userNum =0;
			}
		}
	
		System.out.println(group);
		
	}

}
