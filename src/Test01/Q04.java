package Test01;

import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

public class Q04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/********************************* 문제4번 단어암기 *******************************/
		
		String FristNum = scanner.nextLine(); 
		String[] NumArr = FristNum.split(" ");
		
		int N =Integer.parseInt(NumArr[0]); //암기할 수 있는 수
		int W = Integer.parseInt(NumArr[1]); //주어진 단어 수 
		
	
		String VOCA = scanner.nextLine();
		String[] VOCAArry = VOCA.split(" "); //외워야하는 단어 목록을 구분하여 배열에 삽입
		

		String[] My = new String[N]; //암기할 수 있는 수 만큼 배열생성 
		
		
		int second = 0; //초 카운터
		
		
		//암기할 단어들의 평균길이 값 구하기
		int VOCALength =0;
		double LengthAvg=0.0;
		
		for (int i = 0; i < VOCAArry.length; i++) {
			VOCALength+=VOCAArry[i].length();
		}
		
		LengthAvg = VOCALength/VOCAArry.length;
		

		//암기단어 넣기
		for (int i = 0; i < VOCAArry.length; i++) {
			for (int j = 0; j < My.length; j++) {
				
				if (My[j] == null) {//암기할 수 있는 공간이 비워져 있으면
					My[j] = VOCAArry[j];
					second += 3;
				}
		
				/*for (int k = My.length; k < VOCAArry.length; k++) {
					if (My[j] == VOCAArry[i]) { //암기하고 있는 단어라면
						My[j] = VOCAArry[k];
						second++;
						
					} else if (My[j] != VOCAArry[i]) {//암기하고 있지 않는 단어라면
						My[j] = VOCAArry[k];
						second += 3;
					}
				}
				*/
			}
		}
		
		
		
		System.out.println("걸린 시간을 초단위로 출력");
		System.out.println(second);
		
		

	}

}
