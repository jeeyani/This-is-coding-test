package Test02;

import java.util.Scanner;

public class Q01 {
	
	public static void main(String[] args) {
		
		//******************** 문제 1번 홀수계산 ********************//
		
		Scanner scanner = new Scanner(System.in);
		
		//자연수 7개를 문자열에 입력받는다.
		String Num =scanner.nextLine();
		String[] NumArry =Num.split(", "); 
		
		//입력받은 문자열을 다시 정수형 배열에 넣기 위해 새로운 정수형 배열을 선언
		int[] NumA = new int[7];
		
		int sum =0; //홀수들의 합을 구하기 위해 해당 변수 초기화
		int[] Count = new int[7]; //홀수만 구별하여 받을 함수 정의
		
		
		//문자열로 받은 자연수값들을 비교를 위해 다시 정수형 배열에 넣어준다.
		for (int i = 0; i < NumArry.length; i++) {
			NumA[i] = Integer.parseInt(NumArry[i]);
		}

		//7개의 자연수를 반복문을 사용하여 비교
		for (int i = 0; i < NumA.length; i++) {
			if(NumA[i]%2 !=0) { //홀수만 구별하기
				sum+=NumA[i]; //홀수만 더하기
				Count[i] =NumA[i]; //홀수만 count배열에 삽입
			}
		}
		
		//홀수 존재 유무 판단
		if(sum ==0) { //홀수가 없으면 -1을 출력
			System.out.println(-1);
		}
		else { //홀수가 존재하면 홀수의 총합을 출력
		System.out.println(sum);
		}
		
		
		//비교할 초기화값 찾기, 0  제외(정수)
		int min=0;
		for (int i = 0; i < Count.length; i++) {
			if(Count[i] !=0) { //해당 변수에는 0이 초기값으로 들어가 있음으로 0을 제외
				min =Count[i];
				break;
			}
		}
		
		//홀수 들의 최솟값 구하기
		for (int i = 1; i < Count.length; i++) {
			if(Count[i]==0) {
				continue;
			} else if(min>Count[i]) {// 해당 비교값과 비교하여 최솟값 구하기
				min = Count[i];
			}
		}
		
		System.out.println(min);
		
	}

}
