package ch04_Implementation.exam02;

import java.net.Inet4Address;
import java.util.Scanner;

public class exam02_solustion {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		 //현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
       
        //각 문자를 int형으로 입력받기
        int row = inputData.charAt(1)-'0'; //문자 '0'의 유니코드는 48
        int column = inputData.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 8가지 방향을 x축과 y축 각각을 배열에 정리
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인하기 위해 반복문 사용
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }

        System.out.println(result);
	}

}
