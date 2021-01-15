package ch03_Greedy.exam04;

import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.nextLine();*/
	
		int[] NK = new int[2];
		for (int i = 0; i < 2; i++) {
			NK[i] = Integer.parseInt(sc.next());
		}
		
		//int K = sc.nextInt();
		
		
		int count = 0;

		while (true) {

			if (NK[0] % NK[1] == 0) {
				NK[0] /= NK[1];
				count++;
			} else if (NK[0] % NK[1] != 0) {
				NK[0]--;
				count++;
			} else if (NK[0] == 1) {
				break;
			}
		}
		System.out.println(count);
	}

}
