package Test01;
import java.util.Scanner;

public class check3_add {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		//사과 개수 입력
		int num = Integer.parseInt(sc.nextLine());
		
		int[] scores = new int[num];
		//점수 문자열로 받음
		String str = sc.nextLine();
		//받은 문자 스플릿 함수를 이용하여 스트링 배열에 각각 입력
		String[] score = str.split(" ");
		String[] ox = new String[2];  
		
		int result = 0;
		
		//사용자가 입력한 사과 개수와 스트링 배열로 입력받은 점수의 길이를 비교하여 틀리면 다시 입력
		//맞으면 장애물 정보와 입력받은 점수 문자열을 int배열로 옮긴다.
		if(num != score.length) {
			System.out.println("다시입력해주세요");
		} else {
			for(int i = 0; i < scores.length; i++) {
				scores[i] = Integer.parseInt(score[i]);
			}
			ox[0] = sc.nextLine();
			ox[1] = sc.nextLine();
		}
		
		//반복문을 이용하여 해당 인덱스의 두 문자열이 다 o라면 해당 인덱스의 점수 배열의 값을 총점수 값에 더한다.
		for(int i = 0; i < scores.length; i++) {
			if(ox[0].charAt(i) == 'O' && ox[1].charAt(i) == 'O' ) {
				result += scores[i];
			}
		}
		
		System.out.println("총점수");
		System.out.println(result);

	}

}
