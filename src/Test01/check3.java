package Test01;
import java.util.Scanner;

public class check3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine()); //첫줄에 사과의 갯수를 입력받음
		
		//ox를 서로 비교하기 위해 2차행렬를 선언
		//*사과갯수만큼 입력받아야함!!
		String[][] ox = new String[2][num]; 
		int[] scores = new int[num]; //사과갯수만큼 사과의 점수를 가지는 배열을 선언
		int score = 0;//점수 초기값은 0   
		
		
		//사과갯수만큼 반복문 반복하여 사과의 점수를 입력
		for(int i =0; i < num; i++) {
			scores[i] = Integer.parseInt(sc.next());
		}
		sc.nextLine();
		
		//장애물의 정보를 입력하기 위해 문자열 선언
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		
		//첫째줄 장애물 입력
		for(int i = 0; i < num; i++) {
			ox[0][i] = String.valueOf(str1.charAt(i)); //각 문자를 문자열로 변환하여 배열에 대입
		}
		
		//둘째줄 장애물 입력
		for(int i = 0; i < num; i++) {
			ox[1][i] = String.valueOf(str2.charAt(i));
		}
		
		//장애물의 여부에 따른 점수계산을 한다.
		for(int i = 0; i < num; i++) {
			//둘다 장애물을 통과해야지만 해당 사과의 점수를 획득할 수 있음
			if(ox[0][i].equals("O") && ox[1][i].equals("O")) { 
				score += scores[i]; //각 점수들의 합을 계산하다.
			}
		}
		
		//총 점수 추출
		System.out.println("총 점수");
		System.out.println(score);

	}

}
