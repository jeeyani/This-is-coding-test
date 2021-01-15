package Test02;

import java.util.*;

public class check03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 횟수를 입력받기
		int testCase = Integer.parseInt(sc.nextLine());
		
		//테스트케이스 만큼 암호를 입력받을 문자열배열생성
		String[] password = new String[testCase];
		
		
		//1.테스트 케이스 횟수만큼 반복
		for(int i = 0; i < testCase; i++) {
			
			//입력할 암호의 길이를 받기
			int len = Integer.parseInt(sc.nextLine());
			
			//해당길이 만큼 암호를 입력받기
			String str = sc.nextLine();
			
			//암호해독 완료 후 결과값을 넣기 위한 배열
			char[] pwConvert = new char[len];
						password[i] = ""; //null값일때 오류나는 것을 방지
			
			//암호길이만큼 반복
			for(int j = 0; j < len; j++) {
				//4자리 이동한 문자의 결과가 'z'의 아스키코드 값보다 크다면
				if((int) str.charAt(j) + 4 >122) {
					//다시 a가 시작할 수 있도록 수를 더해주고 char형으로 강제형변환을 진행한다.
					pwConvert[j] = (char)((int) str.charAt(j) + 4 - 26);
				} 
				// 'z'의 아스키코드 값보다 작다면 그대로 암호해독을 진행한다
				else {
					pwConvert[j] = (char)((int) str.charAt(j) + 4);
				}
				
				//최종적으로 해독이 된 char결과를 다시 문자열배열로 묶어서 넣어준다
				password[i] += String.valueOf(pwConvert[j]);
			}
			
		}//1. 종료
		
		//암호해독된 결과를 테스트케이스만큼 출력
		for(int i = 0; i < testCase; i++) {
			System.out.println("Case #"+(i+1));
			System.out.println(password[i]);
		}
	}

}
