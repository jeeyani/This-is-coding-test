package Test01;

import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //입력받는 메소드 
		
		
		/*********************** 문제1번 별찍기 *********************/
		
		//우선 위아래로 나눠서 생각하기
		
		//별 다섯개가 찍히는 구간까지만 반복
		for (int i = 1; i < 6; i++) { 
		
			//i자리 만큼 별 수를 찍기 
			for (int j = 0; j < i; j++) { //
				System.out.print("*");
			}
			//i자리가 끝나면 행간바꾸기
			System.out.println();
		}
		
		//별 다섯개에서 한개가 찍히는 구간까지 반복
		for (int i = 0; i < 6; i++) {
			//별 5개에서부터 한개씩 줄여나감
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			//위와 동일하게 i자리가 끝나면 행간바꾸기
			System.out.println();
		}
		
		
	}

}
