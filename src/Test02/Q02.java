package Test02;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Q02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//******************** 문제2번 계단산 ********************//

		String Line=scanner.nextLine(); //등고선 입력
		
		
		int height=0;
		int kcal=0;
		int poundkey=0;
	
		
		for (int i = 0; i < Line.length(); i++) {

			if(Line.charAt(i)=='(') {
				height++;
				if(poundkey==1) {
				kcal +=height*2;
				} else {
					kcal += height;
				}
			}
			else if(Line.charAt(i)==')') {
		
				if(poundkey ==1) {
				kcal +=height*2;
				} else {
					kcal += height;
				}
				height--;
			} 
			else if(Line.charAt(i)=='#') {
				poundkey ++;
				if(poundkey==2) {
					poundkey =0; //급경사길 초기화
				}
			}
			
		}
		
		System.out.println(kcal);
		
		
	}

}
