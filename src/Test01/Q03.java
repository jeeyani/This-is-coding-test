package Test01;

import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

public class Q03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		/********************************* 문제3번 점수알아내기 *******************************/
		
		
		int N = Integer.parseInt(scanner.nextLine()); // 사과의 갯수
		
	
		int[] score = new int[N];
		
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(scanner.next());
		}
		scanner.nextLine();
		
		/*String scores =scanner.nextLine();
		String[] scoresArry = scores.split(" "); //split을 이용하여 구분하여 배열에 삽입하기
		*/
		
		String[] FristLine = new String[N];
		for (int i = 0; i < FristLine.length; i++) {
			FristLine[i] = scanner.next();
		}
		scanner.nextLine();
		
		
		String[] SecondLine = new String[N];
		
		for (int i = 0; i < SecondLine.length; i++) {
			SecondLine[i] = scanner.next();
		}
		scanner.nextLine();
		
		/*String FristLine =scanner.nextLine(); //첫번째줄 원통입력
		String SecondLine =scanner.nextLine();//두번째줄 원통입력
*/		
		int sum=0;
		for (int i = 0; i < N; i++) {
			
			if(FristLine[i].charAt(i)  == 'O' && SecondLine[i].charAt(i)=='O') { //모두통과시에만 점수를 계산
				sum+=score[i]; //계산을 위해서 String타입을 int형으로 변환
			}
		}
		System.out.println("총 점수");
		System.out.println(sum);
		
	}

}
