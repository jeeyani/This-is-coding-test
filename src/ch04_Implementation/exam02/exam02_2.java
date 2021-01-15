package ch04_Implementation.exam02;

import java.util.Scanner;

public class exam02_2 {

	// 나이트가 움직일 수 있는 경우의 수
	public static int[] dx = { -2, -2, 2, 2, -1, -1, 1, 1 };
	public static int[] dy = { -1, +1, 1, -1, 2, -2, 2, -2 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String location = sc.nextLine();
		int y = location.charAt(0) - 96;
		int x = location.charAt(1) - 48;

		int count = 0;

		for (int i = 0; i < 8; i++) {

			x += dx[i];
			y += dy[i];
			
			if ((x > 0 && y > 0) && (x < 8 && y< 8)) {
				count ++;
				System.out.println(i+": "+count);
			}
			
			y = location.charAt(0) - 96;
			x = location.charAt(1) - 48;

		}
		
		System.out.println(count);

	}

}
